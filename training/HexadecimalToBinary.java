import java.util.Scanner;
public class HexadecimalToBinary{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String hex=scan.nextLine().toUpperCase();
        int decimal=0;
        int power=0;
        for(int i=hex.length()-1;i>=0;i--){
            if(hex.charAt(i)>='0' && hex.charAt(i)<='9'){
                decimal=decimal+(hex.charAt(i)-'0')*(int)Math.pow(16,power);
                power++;
            }
            else{
                decimal=decimal+(hex.charAt(i)-'A' +10)*(int)Math.pow(16,power);
                power++;
            }
        }
        System.out.println(decimal);
        String binary="";
        while(decimal!=0){
            int rem=decimal%2;
            binary=rem+binary;
            decimal=decimal/2;
        }
        System.out.println(binary);
    }
}
