package tester;

import competition.taharot;
import entities.song;

import java.util.Random;

public class testSong {
    public static void main(String[] args) {
        song[] list = new song[10];
        taharot t = new taharot();
        Random r= new Random();
        for (int i =0 ; i<10;i++)
        {
           t.addSong("singer"+i,"song"+i,3.5);
        }

        for(int  i =0 ; i<100;i++)
        {
            t.voting("song"+r.nextInt(0,10));
        }
        t.printSongs();
        System.out.println("------ winner song  --------------");
        System.out.println(t.winner());


    }
}
