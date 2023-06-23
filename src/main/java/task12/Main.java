package main.java.task12;

public class Main {
    public static void main(String[] args) {
        int[] array = createArray(10);
        printArray(array);
//        int[] array1 = createArray(15);
//        printArray(array1);
//        int[] array2 = createArray(20);
//        printArray(array2);
//        int[] array3 = createArray(5);
//        printArray(array3);



    }
    public static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                System.out.println(array[i] + " - четное");
            } else {
                System.out.println(array[i] + " - нечетное");
            }
        }
    }
    public static int[] createArray(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random()*99)+1);
        }
        return array;
    }

}
