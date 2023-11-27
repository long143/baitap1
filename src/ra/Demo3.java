package ra;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kyTu;
        kyTu =sc.nextLine();
        switch (kyTu.toLowerCase()){
            case "u":
            case "a":
            case "i":
            case "o":
            case "e":
                System.out.println(kyTu+" la nguyen am ");
                break;
            default:
                System.out.println(kyTu+ " la phu am");
        }

    }
}
