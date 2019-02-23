import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        System.out.println("1: rectangle");
        System.out.println("2: quare triangle");
        System.out.println("4: Exit");

        while (number != 0)
        {
            //draw rectangle
            if (number ==1 ) {
                for (int x = 0; x < 5; x++) {
                    for (int y = 0; y < 5; y++) {
                        System.out.print("-");
                    }
                    System.out.println("-");
                }
            }

            //quare triangle
            if (number == 2) {
                for (int x = 0; x < 5; x++) {
                    for (int y = 0; y < x; y++) {
                        System.out.print("-");
                    }
                    System.out.println("-");
                }
            }

            if (number == 4)
            {
                System.out.println("exit");
                System.exit(0);
            }
            number = scanner.nextInt();
        }
    }
}
