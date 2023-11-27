package ra;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        System.out.println("nhap 1 so tu 0 - 9 ");
        so = Integer.parseInt(sc.nextLine());
        switch (so){
            case 0 :
                System.out.println("so khong ");
                break;
            case 1:
                System.out.println("so mot");
                break;
        }
    }
}
