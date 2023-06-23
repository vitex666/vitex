package main.java.task12;

public class Main {
    public static void main(String[] args) {
        int[] array = createArray(10);

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
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
