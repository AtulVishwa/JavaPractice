import java.util.Scanner;

public class JavaAndC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Current Year: ");
        int currentYear = scanner.nextInt();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.format("You were born in %d\n",currentYear-age);

    }

}
