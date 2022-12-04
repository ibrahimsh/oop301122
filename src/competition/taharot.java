package competition;

import entities.song;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class taharot {
    private song[] listOfSongs;
    public taharot()
    {
        this.listOfSongs = new song[10];
    }
    public void addSong(String singerName,String songName ,double dur)
    {
        for(int  i = 0; i<this.listOfSongs.length;i++)
        {
            if(this.listOfSongs[i]==null)
            {
                this.listOfSongs[i]=new song(songName,singerName,dur,0);
                break;
            }
        }
    }
    public void printSongs()
    {
        for (int i=0; i<this.listOfSongs.length;i++)
        {
            System.out.println(this.listOfSongs[i]);
        }
    }
    public void voting(String songName)
    {
        for (int i=0; i<this.listOfSongs.length;i++)
        {
           if(this.listOfSongs[i].getName().equals(songName))
           {
               this.listOfSongs[i].setNumLikes(this.listOfSongs[i].getNumLikes()+1);
           }
        }
    }
    public song winner()
    {
        int maxLikes = this.listOfSongs[0].getNumLikes();
        song s = this.listOfSongs[0];
        for (int i=0; i<this.listOfSongs.length;i++)
        {
            if(maxLikes < this.listOfSongs[i].getNumLikes())
            {
                maxLikes = this.listOfSongs[i].getNumLikes();
                s =this.listOfSongs[i];
            }
        }
        return s;
    }

}
