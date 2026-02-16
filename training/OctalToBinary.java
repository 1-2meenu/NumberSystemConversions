import java.util.Scanner;
public class OctalToBinary{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String octal=scan.nextLine();
        int decimal=0;
        int i=octal.length()-1;
        int index=0;
        while(i>=0){
            decimal=decimal+(octal.charAt(i)-'0')*(int)Math.pow(8,index);
            index++;
            i--;
        }
       // System.out.println(decimal);
        String binary="";
        while(decimal!=0){
            int rem=decimal%2;
            binary=rem+binary;
            decimal=decimal/2;
        }
        System.out.println(binary);
    }
}
