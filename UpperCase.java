package week1.day1;

public class UpperCase {

	public static void main(String[] args) {
		String name1,name;
		String name = name1.toLowerCase();

		if (name1 == null || name1 == "") {
			System.out.println("Enter the valid data");
		}

		char[] charArray = name1.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (i % 2 != 0) {
				char upperCase = Character.toUpperCase(c);
				System.out.print(upperCase);

			} else {
				System.out.print(charArray[i]);

			}

		}

		System.out.println("\n");

	}

	
	
	



	}



