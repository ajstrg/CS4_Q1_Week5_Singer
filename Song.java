import java.util.ArrayList;

class Song {

  static ArrayList<Song> songs = new ArrayList<Song>();

  int id;
  static int count = 0;
  String title;
  String artist;

  public Song(String t, String ar) {

    id = count;
    count++;
    title = t;
    artist = ar;

  }


  public static void listSongs(){

    System.out.println("");
    System.out.println("ID \t Title \t Artist");

    for (Song s : Song.songs) {
      System.out.println(s.id + "\t" + s.title + "\t" + s.artist);
    }

    System.out.println("");
  }


  public static void addSong(String t, String a){

    songs.add( new Song(t,a) );

  }

}
