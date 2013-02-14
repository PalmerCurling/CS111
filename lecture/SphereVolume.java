public class SphereVolume{
	public static void main(String[] args){

		System.out.println("Input radius");
		double r = IO.readDouble();

		double v = Math.pow(r,3)*Math.PI*4/3;
		System.out.println(v+ "pi radians");

	}
}
