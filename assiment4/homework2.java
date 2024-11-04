
package assiment4;


public class homework2 {
     public static void main(String[] args) {
 
int o=0, e=0;
        for (int i = 1; i <= 100; i++){
            if(i%2==0)e=e+i;
            else o=o+i;
        }
        System.out.println("all sum odd number: "+o+"\n all sum even number: "+e);
     }
}
