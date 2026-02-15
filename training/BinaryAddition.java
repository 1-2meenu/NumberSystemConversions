import java.util.Scanner;
public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String binary1=scan.nextLine();
        String binary2=scan.nextLine();
        String result="";
        int i=binary1.length()-1;
        int j=binary2.length()-1;
        int sum=0;
        int carry=0;
        while(i>=0 ||j>=0 || carry!=0){
            sum=carry;
            if(i>=0){
                sum=sum+(binary1.charAt(i)-'0');
                i--;
            }
             if(j>=0){
                sum=sum+(binary2.charAt(j)-'0');
                j--;
            }
            int digit=sum%2;
            carry=sum/2;
            result=digit+result;
        }
        System.out.println(result);
    }
}
