public class Coin{
	public static void main (String[] args){

		System.out.println("Place coins A & B on one side of scale, and coins C & D on the other.");
		System.out.println("Are they equal?");
		boolean a = IO.readBoolean();

		if(a){
			System.out.println("Place coin E on one side of scale and F on the other");
			System.out.println("Are they equal?");
			boolean b = IO.readBoolean();
			if(b){
				System.out.println("Place coin A on one side and coin G on the other.");
				System.out.println("Are they equal?");
				boolean c = IO.readBoolean();
				if(c){
					System.out.println("H is the bad coin!");
				}
				else{
					System.out.println("G is the bad coin!");
				}
			}
			else{
				System.out.println("Place coin E on one side and coin G on the other.");
				System.out.println("Are they equal?");
				boolean d =IO.readBoolean();
				if(d){
					System.out.println("F is the bad coin!");
				}

				else{
					System.out.println("E is the bad coin");
				}	
			}
		}
		else{
			System.out.println("Place coin A on one side and coin B on the other.");
			System.out.println("Are they equal?");
			boolean e = IO.readBoolean();
			if(e){
				System.out.println("Put A on one side and C on the other.");
				System.out.println("Are they equal?");
				boolean f = IO.readBoolean();
				if(f){
					System.out.println("D is the bad coin!");
				}
				else{
					System.out.println("C is the bad coin!");
				}
			}
			else{
				System.out.println("Put A on one side and C on the other.");
				System.out.println("Are they equal?");
				boolean g = IO.readBoolean();
				if(g){
					System.out.println("B is the bad coin!");
				}
				else{
					System.out.println("A is the bad coin!");
				}
			}
		}
	}
}
