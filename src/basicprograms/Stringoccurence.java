package basicprograms;

public class Stringoccurence {
	
	
	public static void main (String[] args) {
		
		String input = "Swiss";
		char toFind = 'S';
		int present = 0;
		
		input.toLowerCase();
		
		for(int i=0;i<input.length();i++) {
			
			if(input.charAt(i)==toFind);
			present=present+1;
						
		}
		
		System.out.println(present);
		
	}

}
