import java.util.Scanner;
public class binary{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter binary string:");
        String binary=scan.nextLine();
        int decimal=0;
        int power=0;
        for(int i=binary.length()-1;i>=0;i--){
            decimal=decimal+(binary.charAt(i)-'0')*(int)Math.pow(2,power);
            power++;
        }
        System.out.println(decimal);
    }
}