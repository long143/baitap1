package ra;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("Nhập 1 số bất kỳ ");
//        n = Integer.parseInt(sc.nextLine());
//        if (isPrimeNumber(n)){
//            System.out.println(n+" là số nguyên tố");
//        } else {
//            System.out.println(n+" không là số nguyên tố");
//        }


        System.out.println("Các cố nguyên tố từ 2-100 là: ");
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)){
                System.out.println(i);
            }
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
