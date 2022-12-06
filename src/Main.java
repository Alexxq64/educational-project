public class Main {
    public static void main(String[] args) {
        int[] arr = {1507, 124, 3, 344, 17 };
        int summa = 0;
        for (int i: arr) {
            summa += i;
        }
        System.out.println("Average: " + summa / arr.length);
    }
}