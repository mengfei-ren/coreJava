package basic;

public class TestString {
	
	public static void countChar(String str){
		// Count the uppercase and lowercase characters in a string
		int uCount=0, lCount=0;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(Character.isUpperCase(c)) uCount++;
			else if(Character.isLowerCase(c)) lCount++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
