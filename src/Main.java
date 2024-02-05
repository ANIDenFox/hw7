public class Main {
    public static void main(String[] args) {

        int[] array = {26, 94, 49, 37, 81, 2};
        printArray(array);
        insertionSort(array);
        printArray(array);

        System.out.println(maxAchievableX(4, 1)); // 6
        System.out.println(maxAchievableX(3, 2)); // 7

    }

    public static void insertionSort(int[] array) {

        for (int j = 1; j < array.length; j++) {
            int num = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > num)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = num;
        }
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

    }

    //https://leetcode.com/problems/find-the-maximum-achievable-number/description/
    public static int maxAchievableX(int num, int t) {
        int diff = t * (t + 1) / 2;
        int maxAchievable = num + diff;
        if (t % 2 == 1) {
            maxAchievable--;
        }
        return maxAchievable;
    }
}