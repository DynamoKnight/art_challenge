class ASCII {
  public static void main(String[] args) throws InterruptedException{
    // The exception is thrown when a thread is interupted while it's sleeping
    String spaces = "";
    
    while(true){
      spaces = spaces.concat(" "); // Increments the number of spaces
        
      System.out.println(spaces + " 😄 ");
      System.out.println(spaces + " /|\\/");
      System.out.println(spaces + "  /\\");
      System.out.println(spaces + " / |");
      Thread.sleep(100); // So it doesnt print instantly
      spacing();
      
  
      System.out.println(spaces + " 😄 ");
      System.out.println(spaces + " /|\\/");
      System.out.println(spaces + "  /\\");
      System.out.println(spaces + " | \\");
      Thread.sleep(100);  
      spacing();
        
      if (spaces.length() == 180){
        spaces = "";
      }
    }
    
  }
  // Adds space before next character is drawn
  public static void spacing(){
    for(var i = 0; i < 15; i++){
      System.out.println();
    }
  }


  
}
