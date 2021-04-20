import java.util.Scanner;
import java.util.Stack;
public class Palindrome {

    public static void main(String[] args) 
    {
        System.out.print("Masukkan Kata : ");
        Scanner in = new Scanner(System.in);
        String origString = in.nextLine();
 
        Stack<Character> stack = new Stack<>();
 
        //Push all chars in stack
        for (int i = 0; i < origString.length(); i++) {
            stack.push(origString.charAt(i));
        }
 
        String reverseString = "";
 
        //Pop all chars from stack one by one and build reverse string
        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }
 
        //Check palindrome string
        if (origString.equals(reverseString)) {
            System.out.println("Kata adalah palindrome.");
        } else {
            System.out.println("Kata Bukan palindrome.");
        }
    }
}