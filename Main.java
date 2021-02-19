import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Hello there, This programme will allow you to joing 2 sentences together... Lets have a go, enter your first message: ");

    String message01 = input.nextLine();

    System.out.print("Now, enter your second message: ");
    String message02 = input.nextLine();

    System.out.println(message01 + " " + message02);
  }
}