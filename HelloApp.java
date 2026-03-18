import java.util.Scanner;

public class HelloApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        if (name.isEmpty()) {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");

        input.close();
    }
}