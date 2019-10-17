public class recur {
    public static void main(String[] args) {

        // F(20);
        System.out.print(F(20));

    }

    static int F(int n) {
        if (n < 2)
            return 0;
        return 1 + F(n / 2);
    }
}