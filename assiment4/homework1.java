
package assiment4;


public class homework1 {
     public static void main(String[] args) {
        int j = 0;

        for (int i = 1; i <= 100; i++) {

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }

            }
            if (j == i) {
                System.out.print(i + ", ");
            }
        }

    }
}
