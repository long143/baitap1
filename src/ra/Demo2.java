package ra;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a;
        System.out.println("nhap 1 so bat ky");
        a = Integer.parseInt(sc.nextLine());
        if (a%2==0){
            System.out.println(a+ " la so chan");
        }else {
            System.out.println(a+ " la so le");
        }
    }
}
