import java.util.Scanner;
public class ProcessAName5026201129 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = in.next();

        System.out.print("Enter your last name: ");
        String lastName = in.next();

        String name = lastName + ", " + firstName.substring(0,1)+".";
        System.out.println("Type your name: "+firstName+ " "+lastName);
        System.out.println("Your name is: "+lastName+ ", " +firstName.substring(0,1)+".");
    }
}