package LamdaExpression;

import java.io.*;
import java.util.function.Function;

public class LambdaSerialization {
    private static void serialize(Serializable obj, String outputPath) throws IOException {
        File outputFile = new File(outputPath);
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            outputStream.writeObject(obj);
        }
    }

    private static Object deserialize(String inputPath)
            throws IOException, ClassNotFoundException {
        File inputFile = new File(inputPath);
        try (ObjectInputStream inputStream
                     = new ObjectInputStream(
                new FileInputStream(inputFile))) {
            return inputStream.readObject();
        }
    }
    private static void serializeAndDeserializeFunction()
            throws Exception
    {
        Function<Integer, String> fn
                = (Function<Integer, String> & Serializable)(n)
                -> "Hello " + n;
        System.out.println("Run original function: "
                + fn.apply(10));

        String path = "./serialized-fn";

        serialize((Serializable)fn, path);
        System.out.println("Serialized function to "
                + path);

        Function<Integer, String> deserializedFn
                = (Function<Integer, String>)deserialize(path);
        System.out.println("Deserialized function from "
                + path);
        System.out.println("Run deserialized function: "
                + deserializedFn.apply(11));
    }
    private static void serializeAndDeserializeClass()
            throws Exception
    {
        String path = "./serialized-class";
        serialize(MyImpl.class, path);
        System.out.println("Serialized class to " + path);

        // Pretending we don't know the exact class of the
        // serialized bits, create an instance from the
        // class and use it through the interface.
        Class<?> myImplClass = (Class<?>)deserialize(path);
        System.out.println("Deserialized class from "
                + path);
        MyInterface instance
                = (MyInterface)myImplClass.newInstance();
        instance.m1("Java");
    }
    public static void main(String[] args) throws Exception
    {

        // Calling above method 3 and method 4
        // in the main() body
        serializeAndDeserializeFunction();
        serializeAndDeserializeClass();
    }
}

interface MyInterface{
    void m1(String name);
}
class MyImpl implements MyInterface{

    @Override
    public void m1(String name) {
        System.out.println("Hello  "+name);
    }
}


