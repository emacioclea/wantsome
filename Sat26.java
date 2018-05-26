public class Saturday {
    public static void main(String[] arg) {
        int[] myArray = {38, 27, 43, 3, 10};

        for (int i = 1; i < myArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (myArray[j] < myArray[j - 1]) {
                    int temp = myArray[j - 1];
                    myArray[j-1] = myArray[j];
                    myArray[j] = temp;
                }
                System.out.println(myArray[j]);
            }
        }
        System.out.println("sorted array:");
        for (int no : myArray) {
            System.out.println(no);
        }


    }


}
