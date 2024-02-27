import java.util.Scanner;

public class Main {
	public static void identifyCharacter(char ch)

	{
		if (Character.isAlphabetic(ch)) {
			
				if(Character.isUpperCase(ch) && vowelOrConsonant(ch)) {
						System.out.println("upper-case vowel");
				}
				else if(Character.isUpperCase(ch) && !vowelOrConsonant(ch)) {
						System.out.println("upper-case consonant");
				}
				else if(Character.isLowerCase(ch) && vowelOrConsonant(ch)) {
					System.out.println("Lower-case vowel");
				}
				else {
					System.out.println("Lower-case consonant");
				}
		}

		else if (Character.isDigit(ch)) {

            System.out.println("digit");

        } 
		else {

            System.out.println("SPECIAL CHARACTER.");

        }
		
}
	
	static boolean vowelOrConsonant(char x)
    {
        if (x == 'a' || x == 'e' || x == 'i' ||
                x == 'o' || x == 'u' || x == 'A' ||
                x == 'E' || x == 'I' || x == 'O' || x == 'U') {
            return true;
        }
        else {
            return false;
        }
    }

	
	public static void main(String[] args)

	{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a Character : ");
	char ch=scn.next().charAt(0);
	scn.close();
	identifyCharacter(ch);
	}
}
