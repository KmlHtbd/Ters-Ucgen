import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {

        int n,i,a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Uzunluk için bir sayı giriniz:");
        n = input.nextInt();

        for (i=1;i<=n;i++){
            for(a=1;a<=i+1;a++){
                System.out.print(" ");
            }
            for(b=1;b <= 2*n - (2*i-1);b++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}