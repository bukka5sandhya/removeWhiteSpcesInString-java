package Java;
import java.util.Scanner;

public class removeWhiteSpaces {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    String result = str.replaceAll("\\s","");
    System.out.println(result);
    }
    
}

// input 
// Java is secure and fast
// output
// Javaissecureandfast