package ra;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2.Tính chu vi và diện tích hình tam giác");
            System.out.println("3.Tính chu vi và diện tích tròn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                    int chieuDai,chieuRong;
                    System.out.println("Nhập chièu dài");
                    chieuDai = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập chiều rộng");
                    chieuRong = Integer.parseInt(sc.nextLine());
                    float chuVi = (chieuDai + chieuRong ) * 2;
                    float dienTich = chieuDai * chieuRong;
                    System.out.println("Chu vi = " +chuVi);
                    System.out.println("Diện tích = " +dienTich);
                    break;
                case 2:
                    float a,b,c,p;
                    System.out.println("nhập cạnh tam giác");
                    a = Float.parseFloat(sc.nextLine());
                    System.out.println("nhập cạnh tam giác");
                    b = Float.parseFloat(sc.nextLine());
                    System.out.println("nhập cạnh tam giác");
                    c = Float.parseFloat(sc.nextLine());
                    while (a > 0 && b > 0 && c > 0){
                        if (a + b > c || a + c > b || b + c > a) {
                            p = (a+b+c)/2;
                            float chuViHinhChuNhat = p * 2;
                            double dienTichHinhChuNhat = Math.sqrt(p*(p-a)*(p-c)*(p-b));
                            System.out.println("Chu vi = " +chuViHinhChuNhat);
                            System.out.println("Diện tích = " +dienTichHinhChuNhat);
                            break;
                        }
                    }
                    break;
                case 3:
                    double r;
                    System.out.println("Nhập bán kính");
                    r = Double.parseDouble(sc.nextLine());
                    double chuViHinhTron = 2 * Math.PI * r;
                    double dienTichHinhTron = Math.PI * r;
                    System.out.println("Chu vi = " +chuViHinhTron);
                    System.out.println("Diện tích = " +dienTichHinhTron);
                    break;
            }
        }while (true);
    }
}
