package question2;
import java.util.Scanner;

public class GameMenu {
	void startGame() {
		System.out.println("1.Start the Game");
	}
	
	void displayGameInstruction() {
		System.out.println("2.Display game instruction");
	}
	
	void exitGame() {
		System.out.println("3.Exit the Game");
	}
	

	public static void main(String[] args) {
		
		System.out.println("--------MENU----------");
		System.out.println("1.Start the Game");
		System.out.println("2.Dispay game instruction");
		System.out.println("3.Exit the Game");
		System.out.println("___________________________");
		
		GameMenu obj=new GameMenu();
		System.out.print("Enter the Choice Number: ");
		Scanner sc =new Scanner(System.in);
		int Choice = sc.nextInt();
		
		switch(Choice) {
		case 1:
			obj.startGame();
			break;
			
		case 2:
			obj.displayGameInstruction();
			break;
			
		case 3:
			obj.exitGame();
			break;
			
		default :
			System.out.println("Invalid Choice!!!");
			
			}	
		
		}
}