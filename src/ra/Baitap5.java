package ra;

public class Baitap5 {
    public static void main(String[] args) {
        int n = 1;
        while (n % 5==0){
            if (n%7==0 && n%11==0){
                System.out.println(n);
            }
                n++;

        }
    }
}
