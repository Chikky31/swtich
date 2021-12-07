import java.util.Scanner;

class pronic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, flag = 0;
        ;
        System.out.println("enter the number");
        n = sc.nextInt();
        for (i = 1; i < (n / 2 ); i++) {
            if (i * (i + 1) == n) {
                flag = 1;
              
                break;
            } else {
                continue;
            }
        }
        if (flag == 1) {

            System.out.println("pronic");
        } else {
            System.out.println("Not pronic");
        }
    }
}
