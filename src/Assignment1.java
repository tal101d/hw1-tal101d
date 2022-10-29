

public class Assignment1 {
	public static void main(String[] args){

        // Getting arguments

        char chr = args[0].charAt(0);
        int offset =Integer.parseInt(args[1]);

        //Calculating the new Char
        char newChar = (char)((int)(chr) + offset);

        //Printing the new Char
        System.out.println("New char is " + newChar + ".");
    }
}
