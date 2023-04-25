package basico;

import java.util.Scanner;

public class FuncoesSintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);


        showResult(higher);

        sc.close();
    }

    public static int max (int a, int b, int c){
        int aux;
        if( a > b && a > c){
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}
