import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int decimal=scan.nextInt();
        String octal="";
        while(decimal!=0){
            int rem=decimal%8;
            octal=rem+octal;
            decimal=decimal/8;
        }
        System.out.println(octal);
    }
}
