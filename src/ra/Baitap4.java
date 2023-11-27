package ra;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        int n = 20;
        int i = 2;
        int cout = 0;
        while (cout < n ){
            if (isPrimeNumber(i)){
                System.out.println(i+" ");
                cout++;
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int n){
        if (n < 2){
            return false;
        }
        int squareRoot =(int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
