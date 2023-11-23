import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




            System.out.println("Izvēlieties darbību:");
            System.out.println("1. Saskaitīt");
            System.out.println("2. Atnemt");
            System.out.println("3. Reizināt");
            System.out.println("4. Dalīt");
            System.out.println("5. Iziet");

            int choice = scanner.nextInt();

            }

            System.out.print("Ievadiet pirmo skaitli: ");
            int num1 = scanner.nextInt();

            System.out.print("Ievadiet otro skaitli: ");
            int num2 = scanner.nextInt();

            int result = 0;

            if (choice == 1) {
                result = Calculations.saskaitit(num1, num2);
            } else if (choice == 2) {
                result = Calculations.atnemt(num1, num2);
            } else if (choice == 3) {
                result = Calculations.reizinat(num1, num2);
            } else if (choice == 4) {
                int quotient = Calculations.divide(num1, num2);
                System.out.println("Rezultāts: " + quotient);
                continue;
            } else {
                System.out.println("Nepareiza ievade");
                continue;
            }

            System.out.println("Rezultāts: " + result);
        }

    }
}