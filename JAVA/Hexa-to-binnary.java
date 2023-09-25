import java.util.*; 

class Main {


	String decimalToBinary(int decimal)
	{

		String binaryString = "";

		while (decimal != 0) {

			binaryString = (decimal % 2) + binaryString;

			decimal /= 2;
		}


		while (binaryString.length() % 4 != 0) {

			binaryString = "0" + binaryString;
		}

		return binaryString;
	}

	String hexToBinary(String hexadecimal)
	{


		int i;
		char ch;
		String binary = "";
		int returnedBinary;

		hexadecimal = hexadecimal.toUpperCase();


		for (i = 0; i < hexadecimal.length(); i++) {


			ch = hexadecimal.charAt(i);


			if (Character.isDigit(ch) == false
				&& ((int)ch >= 65 && (int)ch <= 70)
					== false) {


				binary = "Invalid Hexadecimal String";
				return binary;
			}

			else if ((int)ch >= 65 && (int)ch <= 70)


				returnedBinary = (int)ch - 55;
			else
				returnedBinary
					= Integer.parseInt(String.valueOf(ch));

			binary += decimalToBinary(returnedBinary);
		}

		return binary;
	}


	public static void main(String[] args)
	{

        System.out.print("Enter Hexa Number :");
		Scanner sc= new Scanner(System.in); 
		Main ob = new Main();
		
		String hex = sc.nextLine();
	
		//System.out.println(hex);
        System.out.print("Binary Value :");
		System.out.println(ob.hexToBinary(hex));
	}
}
