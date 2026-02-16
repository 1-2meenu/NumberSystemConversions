import java.util.Scanner;
public class HexadecimalAddition{
    static int getvalue(char ch){
        if(ch>='0' && ch<='9'){
            return (ch-'0');
        }
        else{
            return (ch-'A' +10);
        }
    }
    static char getchar(int digit){
        if(digit>=0 && digit<=9){
            return (char)(digit+'0');
        }
        else{
            return (char)(digit-10 +'A');
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String hex1=scan.nextLine().toUpperCase();
        String hex2=scan.nextLine().toUpperCase();
        String result="";
        int sum=0;
        int carry=0;
        int i=hex1.length()-1;
        int j=hex2.length()-1;
        while(i>=0 && j>=0){
            sum=carry;
            if(i>=0){
                sum=sum+getvalue(hex1.charAt(i));
                i--;
            }
            if(j>=0){
                sum=sum+getvalue(hex2.charAt(j));
                j--;
            }
            int digit=sum%16;
            carry=sum/16;
            result=getchar(digit)+result;
        }
        System.out.println(result);
    }
}
