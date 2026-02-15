import java.util.Scanner;
public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String binary=scan.nextLine();
        int decimal=0;
        int power=0;
        for(int i=binary.length()-1;i>=0;i--){
            decimal=decimal+(binary.charAt(i)-'0')*(int)Math.pow(2,power);
            power++;
        }
        String hex="";
        while(decimal!=0){
            int rem=decimal%16;
            if(rem>=0 && rem<=9){
                hex=rem+hex;
            }
            else{
                hex=(char)(rem-10+'A')+hex;
            }
            decimal=decimal/16;
        }
        System.out.println(hex);

    }
}
