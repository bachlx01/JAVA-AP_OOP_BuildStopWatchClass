import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int myInt[] = new int[100000];
        StopWatch watch = new StopWatch();

        for (int i = 0; i < myInt.length; i++) {
            myInt[i] = (int) Math.round(Math.random() * 100000);
        }

        watch.start();
        Arrays.sort(myInt);
        watch.stop();
//        sortInt(myInt);
//        for (int e :
//                myInt) {
//            System.out.println(e);
//        }

        System.out.println("Time(second) for sort 100000 number is: "+ watch.getElapsedTime() + "s");
    }

    static void sortInt(int array[]) {
        int temp;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
