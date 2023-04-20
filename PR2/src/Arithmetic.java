public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic newExample = new Arithmetic(30,45);
        newExample.min();
        newExample.max();
        newExample.sum();
        newExample.pr();
    }
    private int per1;
    private int per2;

    public Arithmetic(int a, int b) {
        per1 = a;
        per2 = b;
    }
    public int max() {
        int maxOfNumbers = Math.max(per1,per2);
        System.out.println("Максимальное из двух чисел: " + maxOfNumbers);
        return maxOfNumbers;
    }
    public int min() {
        int minOfNumbers = Math.min(per1,per2);
        System.out.println("Минимальное из двух чисел: " + minOfNumbers);
        return minOfNumbers;
    }
    public int sum() {
        int  sumOfNumbers = per1 + per2;
        System.out.println("Сумма введённых чисел равна: " + sumOfNumbers);
        return sumOfNumbers;
    }
    public int pr() {
        int prOfNumbers = per1 * per2;
        System.out.println("Произведение введённых чисел равно: " + prOfNumbers);
        return prOfNumbers;
    }


}
