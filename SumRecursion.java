public class SumRecursion {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(SumFirstNRecursion(list, 5));
    }
    public static int SumFirstNRecursion(int[] list, int number) {
        if (number == 0) {
            return 0;
        }
        return list[number - 1] + SumFirstNRecursion(list, number - 1);
    }
}
