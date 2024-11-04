
package assiment4;

import java.util.Scanner;
public class homework3 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("nhap so tu nhien n: ");
        int n = scanner.nextInt();
        int sum=0, a=n;
    while (a>0){
        sum=sum+ (a%10);
        a=a/10;
    }
   System.out.println("tong cac chu so cua so "+n+" la: "+sum);  
}
}
