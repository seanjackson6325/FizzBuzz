public class Multiples {
    public static void main(String[] args) {
        System.out.println(doMultiples(1000));
    }

    public static int doMultiples(int num) {
        int total = 0;
        int i = 1;
        while (i <= num) {
            if (i % 3 == 0 || i % 5 == 0) {
                total++;
            }
            i++;
        }
        return total;
    }

}
