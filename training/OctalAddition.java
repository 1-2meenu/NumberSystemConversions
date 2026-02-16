import java.util.Scanner;
public class OctalAddition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String octal1=scan.nextLine();
        String octal2=scan.nextLine();
        String result="";
        int i=octal1.length()-1;
        int j=octal2.length()-1;
        int sum=0;
        int carry=0;
        while(i>=0 ||j>=0 || carry!=0){
            sum=carry;
            if(i>=0){
                sum=sum+(octal1.charAt(i)-'0');
                i--;
            }
             if(j>=0){
                sum=sum+(octal2.charAt(j)-'0');
                j--;
            }
            int digit=sum%8;
            carry=sum/8;
            result=digit+result;
        }
        System.out.println(result);
    }
}
