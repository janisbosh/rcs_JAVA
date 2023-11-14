import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Ievadi skaitli");
            int number =sc.nextInt();
            System.out.println(number +5);
        }
    }

    public static void example1() {

        for (int i = 0; i < 5; i++) {//sakam skaitit ar 0, cikls darbojas kamer i ir mazaks par 5, i=i+1
            System.out.println(i);
            System.out.println("Hello");
            System.out.println("--------------");
        }
    }
}