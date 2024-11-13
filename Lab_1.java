import java.util.Random;
import java.lang.Math;

public class Lab_1 {
    public static void main(String[] args) {
        int e[] = new int[10];
        int index = 0;
        for (int i = 3; i <= 21; i++) {
            if (i % 2 == 1) {
                e[index] = i;
                index++;
            }
        }
        float x[] = new float[20];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            x[i] = random.nextFloat(9) - 3;
        }

        double[][] k = new double[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (e[i] == 9) {
                    k[i][j] = Math.pow(2 * Math.log(Math.pow(Math.sin(x[j]), 2)), 2);
                } else if (e[i] > 10 & e[i] % 2 == 1) {
                    k[i][j] = Math.pow(0.25 * (1 / 3 - Math.pow(((Math.sin(x[j]) + 1) / (Math.atan((x[j] + 1.5) / 9))), 2)), (Math.cos(Math.sin(x[j]))));
                } else {
                    k[i][j] = (0.5 + Math.pow((Math.pow(Math.pow(Math.exp(1), Math.exp(1)), x[j]) + 0.25), Math.pow(Math.exp(1), Math.pow(x[j], (1 - x[j]) / x[j])))) / 4;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                k[i][j] = Math.round(k[i][j] * 100000.0) / 100000.0;
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }
    }

}

