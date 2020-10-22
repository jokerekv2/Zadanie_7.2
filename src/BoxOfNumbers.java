import java.util.Scanner;

public class BoxOfNumbers {
    private Scanner sc = new Scanner(System.in);
    private double[] box;

    public void createAndFillBox() {
        box = new double[setSizeOfBox()];
        for (int i = 0; i < box.length; i++) {
            System.out.print("Podaj liczbę, którą chcesz zapisać: ");
            box[i] = sc.nextDouble();
        }
    }

    public void sumOfSquares() {
        double sum = 0;
        for (double v : box) {
            sum += v * v;
        }
        System.out.println("Suma kwadratów liczb w boxie wynosi: " + sum);
    }

    private int setSizeOfBox() {
        System.out.print("Podaj rozmiar boxa: ");
        int x = sc.nextInt();
        return x;
    }


}
