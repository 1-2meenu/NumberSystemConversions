import java.util.Scanner;
public class OctalToHexadecimal{
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
        String hex="";
        while(decimal!=0){
            int rem=decimal%16;
            if(rem<10){
                hex=rem+hex;
            }
            else if(rem>=10){
                hex=(char)((rem-10)+'A')+hex;
            }
            decimal=decimal/16;
            
        }
        System.out.println(hex);
        
    }
}
