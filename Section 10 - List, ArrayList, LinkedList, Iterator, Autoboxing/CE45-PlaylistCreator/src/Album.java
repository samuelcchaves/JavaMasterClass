import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Album
{
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
        songs.add(new Song("Photon Cascade", 7.40));

    }




    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title, duration));

            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song check : songs){
            if(check.getTitle().equals(title)){
                return check;
            }
        }
        return null;
    }

   /* private Song findSong(String title, LinkedList<Song> playlist){
        System.out.println(title + " ... finding song ...");
        if(playlist.contains()){
            System.out.println("Songs contain ... " + title + " -> " + playlist.contains(title));
            return songs.get(songs.indexOf(title));
        }
        return null;
    }*/

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if(index >= 0 && index  <= playlist.size()){
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }


    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song check = findSong(title);
        if(check != null){
            playlist.add(check);
            return true;
        }
        return false;
    }

    public String getName(){
        return this.name;
    }

    public String getArtist(){
        return this.artist;
    }

    public ArrayList<Song> getSongs(){
        return songs;
    }


    public void printSongs(){
        System.out.println("Printing songs from the album: " + name);
        for(Song element : songs){
            System.out.println(element);
        }
    }
}

