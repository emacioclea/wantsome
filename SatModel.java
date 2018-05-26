public class Satex {
    public static void main(String[] arg) {
        int[] toSort = {4, 12, 3, 56, 5, 13};
        int[] sortedArray = doIntersionSort(toSort);
        System.out.println("sorted array:");
        for (int no : sortedArray) {
            System.out.println(no);
        }
    }

    private static int[] doIntersionSort(int[] inputArray) {
        int temp;
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (inputArray[j] < inputArray[j - 1]) {
                    temp = inputArray[j-1];
                    inputArray[j-1] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }
}
