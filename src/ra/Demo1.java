package ra;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNguyen;
        System.out.println("nhap vao so nguyen");
        soNguyen = Integer.parseInt(sc.nextLine());
        System.out.println("Gia tri cua so nguyen vua nhap la: " +soNguyen);
        String fullName ;
        System.out.println("nhap ten vao day");
        fullName = sc.nextLine();
        System.out.println("ten cua ban la : "+fullName);
    }
}
