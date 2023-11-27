public class Main {


    public static int aprēķinātSummu(int[] masīvs) {
        int summa = 0;
        for (int elements : masīvs) {
            summa += elements;
        }
        return summa;
    }
    public static void main(String[] args) {
        int[] masivs = {2, 4, 6, 8, 10};

        int summa = aprēķinātSummu(masivs);
        System.out.println("Masīva summa: " + summa);


    }
}