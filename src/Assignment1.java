

public class Assignment1 {
	 // Getting arguments
        int offset =Integer.parseInt(args[0]);
        char chr = args[1].charAt(0);

        //Calculating the new Char
        char newChar = (char)((int)(chr) + offset);

        //Printing the new Char
        System.out.println("New char is " + newChar + ".");
    }
}
