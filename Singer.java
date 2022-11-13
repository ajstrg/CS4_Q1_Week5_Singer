import java.util.Scanner;
import java.util.HashMap;

class Singer {

  static HashMap <String, Singer> singers = new HashMap <String, Singer>();
  static Scanner input = new Scanner(System.in);

  static int totalPerformances = 0;
  String name;
  int noOfPerformances = 0;
  double earnings;
  double newEarnings;
  Song favoriteSong;


  public Singer(String n) {

    name = n;

  }


/////// CHANGE THE CODE BELOW TO SOLVE THE PROBLEM


  public static void listSingers(){

    System.out.println("");
    System.out.println("Singers:");  

    for (String name: singers.keySet()) {
        String key = name.toString();
        System.out.println("- " + key);
    }

    System.out.println("");
  }


  public static void addSinger() {

    System.out.print("What is the singer's name? "); 

    String new_singer = input.nextLine();
    singers.put(new_singer, new Singer(new_singer));

    System.out.print("Singer " + new_singer +" has been added to the system."); 
    
    System.out.println("");
    
  }

  public static void performForAudience(Singer artist) {
    
    System.out.print("Enter number of audience: ");
    int audience = input.nextInt();
    
    System.out.println("");

    singers.get(artist.name).earnings += audience * 100;
    
    singers.get(artist.name).noOfPerformances++;
    totalPerformances++;

    System.out.println(artist.name + " has performed " + singers.get(artist.name).noOfPerformances + " time(s) and has earned " + singers.get(artist.name).earnings + " pesos.");
    System.out.println("The total performance count is now at " + totalPerformances + ".");
    
  }


 

  public static void performForAudience(Singer s1, Singer s2) {
    
    System.out.print("Enter number of audience: ");
    int audience = input.nextInt();
    
    System.out.println("");

    singers.get(s1.name).earnings += audience * 50;
    singers.get(s2.name).earnings += audience * 50;
    
    singers.get(s1.name).noOfPerformances++;
    singers.get(s2.name).noOfPerformances++;
    totalPerformances++;

    System.out.println(s1.name + " has performed " + singers.get(s1.name).noOfPerformances + " and has earned " + singers.get(s1.name).earnings + " pesos.");
    System.out.println(s2.name + " has performed " + singers.get(s2.name).noOfPerformances + " and has earned " + singers.get(s2.name).earnings + " pesos.");
    System.out.println("The total performance count is now at " + totalPerformances + ".");

  }



  public static void changeFavSong() {

    System.out.print("Enter the name of the Singer: "); 
    String singer = input.nextLine();

    Song.listSongs();
    System.out.print("Enter the number of the favorite song: "); 
    int song_number = input.nextInt();
    
    System.out.println(singer + "'s favorite song has been updated to " + Song.songs.get(song_number).title); 
  }


  public static void showMenu(){
    
    System.out.println("What would you like to do?");      
    System.out.println("- Add singer");
    System.out.println("- Add song");
    System.out.println("- Assign fav song");
    System.out.println("- Perform for audience");
    System.out.println("- Perform duet for audience");
    System.out.println("- List singers");
    System.out.println("- List songs");
    System.out.println("- End application");

    String function = input.nextLine();

    if (function.equals("List singers")) {
      listSingers();
      showMenu();
    }

    else if (function.equals("Add singer")) {
      addSinger();
      showMenu();
    }
      
    else if (function.equals("Assign fav song")) {
      listSingers();
      changeFavSong();
      String function1 = input.nextLine();
      showMenu();
    }

    else if (function.equals("Perform for audience")) {

      listSingers();
      
      System.out.print("Enter the name of the singer: ");
      String singer = input.nextLine();

      performForAudience(singers.get(singer));
       String function1 = input.nextLine();
      showMenu();

    }

    else if (function.equals("Perform duet for audience")) {

      listSingers();
      
      System.out.print("Enter the name of the 1st performer: ");
      String singer1 = input.nextLine();

      System.out.print("Enter the name of the 2nd performer: ");
      String singer2 = input.nextLine();
      
      performForAudience(singers.get(singer1),singers.get(singer2));
      String function1 = input.nextLine();
      showMenu();
      
    }
      
      
    else if (function.equals("List songs")) {
      Song.listSongs();
      showMenu();
    }

    else if (function.equals("Add song")) {

      System.out.print("What is the song's title? "); 
      String song = input.nextLine();

      System.out.print("Who is the artist? "); 
      String artist = input.nextLine();

      System.out.println("Song " + song + " by " + artist + " has been added to the system."); 
      
      Song.addSong(song, artist);
      
      showMenu();
    }

    
  }



  /////// CHANGE THE CODE ABOVE TO SOLVE THE PROBLEM

 
}
