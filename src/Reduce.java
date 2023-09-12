public class Reduce {
    public static void main(String[] args) {
        System.out.println(doReduce(2));
    }

    public static int doReduce(int n) {
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0)
                n /= 2;
            else
                n -= 1;
            steps++;
        }
        return steps;
    }
}
