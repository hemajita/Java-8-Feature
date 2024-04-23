package LamdaExpression;

import java.util.Random;

public class LambdaMultiThreading2 {
    static String[] games={"Cricket","Ludo","Basket Ball"};
    static String[] music={"let me love you","you & I","Believer"};
    public static void main(String[]args){
      Player player=new Player();
        Random random=new Random();
        Runnable gameRunner=()->{
            try{
                player.playGame(games[random.nextInt(games.length)]);
            }catch (InterruptedException e){
                e.getMessage();
            }
        };
        Runnable musicPlayer=()->{
            try {
                player.playMusic(music[random.nextInt(music.length)]);
            } catch (InterruptedException e) {
               e.getMessage();
            }
        };
        Thread game=new Thread(gameRunner);
        Thread music=new Thread(musicPlayer);
        game.start();
        music.start();
    }
}
 class Player{
    public void playGame(String gameName) throws InterruptedException{
        System.out.println(gameName+" game started");
        Thread.sleep(500);
        System.out.println(gameName+" game ended");
    }
    public void playMusic(String trackName)throws InterruptedException{
        System.out.println(trackName+" track stated");
        Thread.sleep(500);
        System.out.println(trackName+" track ended");
    }
}
