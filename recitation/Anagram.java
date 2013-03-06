public class Anagram{
	public static void main(String[] args){

		String s1 = IO.readString();
		String s2 = IO.readString();

		if(s1.length() != s2.length()){
			System.out.println ("These cannot be anagrams for each other!");
			return;
		}
		for(int i=0; i < s1.length(); i++){
			for(int j=0; j < s2.length(); j++){
				if(s1.charAt(i) == s2.charAt(j)){
					s2 = s2.substring(0,j)+s2.substring(j+1,s2.length());
					break;
				}
			}
		}
		if (s2.length() == 0) {
			System.out.println("These are anagrams!");
		}else{
			System.out.println("These are not anagrams! :(");
		}
	}
}
