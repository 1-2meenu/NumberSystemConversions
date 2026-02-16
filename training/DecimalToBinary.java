import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int decimal=scan.nextInt();
        String binary="";
        while(decimal!=0){
            int rem=decimal%2;
            binary=rem+binary;
            decimal=decimal/2;
        }
        System.out.println(binary);
    }
}
