import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int decimal=scan.nextInt();
        String hex="";
        while(decimal!=0){
            int rem=decimal%16;
            if(rem>=0 && rem<=9){
                hex=rem+hex;
            }
            else{
                hex=(char)(rem-10 +'A')+hex;
            }
            decimal=decimal/16;
        }
        System.out.println(hex);
    } 
}
