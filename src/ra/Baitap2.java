package ra;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int numFirst,numLast;
        System.out.println("Nhập giá trị đầu");
        numFirst = Integer.parseInt(sc.nextLine());
        System.out.println("Giá trị đầu là: " +numFirst);
        System.out.println("Nhập giá trị cuối: ");
        numLast = Integer.parseInt(sc.nextLine());
        System.out.println("Giá trị cuối là: "+numLast);
        int sum = 0;
        for (int i = numFirst; i <= numLast ; i++) {
            if (i%2==0){
                sum += i;
                System.out.println(sum);
            }
        }
    }
}
