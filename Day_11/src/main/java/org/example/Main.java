
import org.example.Employee;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ievadiet vārdu:");
        String vards = scanner.nextLine();

        System.out.println("Ievadiet uzvārdu:");
        String uzvards = scanner.nextLine();

        System.out.println("Ievadiet stāžu :");
        int darbaStazs = scanner.nextInt();


       Employee employee = new Employee(vards, uzvards, darbaStazs);

        System.out.println("Vārds: " + employee.vards);
        System.out.println("Uzvārds: " + employee.uzvards);
        System.out.println("Darba stāžs: " + employee.darbaStazs + " gadi");
    }
}
