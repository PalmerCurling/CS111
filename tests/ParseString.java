import java.util.Scanner;

public class ParseString{
		public static void main(String[] args){
			Scanner test = new Scanner("1 2 3 4 5 6 7 8 9 10");

				while (test.hasNextInt()){
					int num = test.nextInt();
					if(num % 2 == 0)
						System.out.println(num);
				}
		}
}
