import java.util.Scanner;

public class User{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();

		System.out.println("What is your quest?");
		String quest = input.nextLine();
		
		System.out.println("Input some word(s). We wish to read.");
		String word = input.nextLine();
		
		System.out.println("Enter your most favorite number. There is science to be done.");
		int favorite = input.nextInt();

		System.out.print(name+", questing for \""+quest+"\" who thought of the word(s) \""+word+"\" and who likes the number "+favorite+", welcome to the Borg. ");
		System.out.println("You will be assimilated. Resistance is futile.");
	}
}
