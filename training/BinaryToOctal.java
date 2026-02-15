import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String binary=scan.nextLine();
        while(binary.length()%3!=0){
            binary="0"+binary;
        }
        String octal="";
        for(int i=0;i<=binary.length()-1;i=i+3){
             int sum=0;
             int a=(binary.charAt(i)-'0')*4;
             int b=(binary.charAt(i+1)-'0')*2;
             int c=(binary.charAt(i+2)-'0')*1;
             sum=a+b+c;
             octal=octal+sum;
        }
        System.out.println(octal);
    }
}
