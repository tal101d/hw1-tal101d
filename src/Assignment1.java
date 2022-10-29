

public class Assignment1 {
	public static void main(String[] args){
        int offset =Integer.parseInt(args[1]);
        char chr = args[0].charAt(0);
        char newChar = (char)((int)(chr) + offset);
        System.out.println("New char is " + newChar + ".");
    }
}
