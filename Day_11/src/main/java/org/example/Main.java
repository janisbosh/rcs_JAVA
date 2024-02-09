
import com.google.gson.Gson;
import org.example.Connect;
import org.example.Employee;
import java.sql.Connection;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Connection conn = Connect.connect();
        Connect.readEmployees(conn);


        String vards;
        String uzvards;
        int darbaStazs;
        try (Scanner scanner = new Scanner(System.in)) {


            System.out.println("Ievadiet vārdu:");
            vards = scanner.nextLine();

            System.out.println("Ievadiet uzvārdu:");
            uzvards = scanner.nextLine();

            System.out.println("Ievadiet stāžu :");
            darbaStazs = scanner.nextInt();
        }


        Employee employee = new Employee(vards, uzvards, darbaStazs);

        System.out.println("Vārds: " + employee.vards);
        System.out.println("Uzvārds: " + employee.uzvards);
        System.out.println("Darba stāžs: " + employee.darbaStazs + " gadi");

        Gson gson = new Gson();
        String json = gson.toJson(employee);
        System.out.println("Employee as JSON: " + json);

    }
}
