public class Kdv {
    public static void main(String[] args) {
        int a = 4;

        System.out.print(FirstFactorial(5) );
    }


    public static int FirstFactorial(int num) {

        int i = 1, b = 1;
        for (i = 1; i <= num; i++) {
            b = b * i;
        }
        num = b;
        return b;

    }
}
