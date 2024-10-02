package week06;

public class GameBoard {
  String[] gameBoard = new String[9];
  
  public void init() {
    for (int i = 1; i < 10; i++) {
      this.gameBoard[i-1] = String.valueOf(i);
    }
  }
  
  public void display() {
    System.out.println("+---+---+---+");
    System.out.println("| " + this.gameBoard[0] + " | " + this.gameBoard[1] + " | " + this.gameBoard[2] + " |" );
    System.out.println("+---+---+---+");
    System.out.println("| " + this.gameBoard[3] + " | " + this.gameBoard[4] + " | " + this.gameBoard[5] + " |" );
    System.out.println("+---+---+---+");
    System.out.println("| " + this.gameBoard[6] + " | " + this.gameBoard[7] + " | " + this.gameBoard[8] + " |" );
    System.out.println("+---+---+---+");
  }
  
  public void checkWinStatus() {
    
  }
}
