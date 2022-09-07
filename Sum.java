public class Sum {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(SumFirstN(list, 5));
    }
    public static int SumFirstN(int[] list, int number) {
        if (number == 0) {
            return 0;
        }
        int sum = 0;
        for (int index = 0; index < number; index++) {
            sum = sum + list[index];
        }
        return sum;
    }
}
