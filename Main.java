class Main {

  public static void main(String[] args) {

    System.out.println("\n\n");
    
    // Initialize songs

    Song.songs.add(new Song("Liwanag sa Dilim", "Rivermaya"));
    Song.songs.add(new Song("With a Smile", "Eraserheads"));
    Song.songs.add(new Song("Paraiso", "Smokey Mountain"));
    Song.songs.add(new Song("Perfect", "True Faith"));
    Song.songs.add(new Song("Ikaw lang ang aking Mahal", "Brownman Revival"));

    // Initialize singers
    
    Singer.singers.put("Yeng Constantino", new Singer("Yeng Constantino"));
    Singer.singers.put("Gabriel Valenciano", new Singer("Gabriel Valenciano"));
    Singer.singers.put("Celeste Legaspi", new Singer("Celeste Legaspi"));
    Singer.singers.put("Moira Dela Torre", new Singer("Moira Dela Torre"));
    Singer.singers.put("Taylor Swift", new Singer("Taylor Swift"));

    System.out.println("Welcome to our Singer Registry System");
    System.out.println("");
    Singer.showMenu();

  }

}
