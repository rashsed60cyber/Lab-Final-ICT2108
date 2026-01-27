public class Question01 {
    public static void main(String[] args) {
        double[] myList = {5.8, 2.6, 9.0, 3.4, 7.1};

        System.out.println("Original Array:");
        printArray(myList);
      
        reverse(myList);
        System.out.println("\nReversed Array:");
        printArray(myList);
    }
    public static void reverse(double[] list) {
        int left = 0;
        int right = list.length - 1;

        while (left < right) {
            double temp = list[left];
            list[left] = list[right];
            list[right] = temp;

            left++;
            right--;
        }
    }
    public static void printArray(double[] list) {
        for (double value : list) {
            System.out.print(value + "  ");
        }
        System.out.println();
    }
}
