public class recur {
    public static void main(String[] args) {

        // F(20);
        System.out.print(F(20));
        // System.out.print(A(532));
        // System.out.print(B(900));
    }

    static int F(int n) {
        if (n < 2)
            return 0;
        return 1 + F(n / 2);
    }

    static int A(int n) {
        if (n <= 0)
            return 0;
        return F(n / 10) + n % 10;
    }

    static int B(int n) {
        if (n < 0)
            return F(-n);
        if (n < 10)
            return n;
        return B(n / 10);
    }

}