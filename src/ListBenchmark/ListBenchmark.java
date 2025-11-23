package ListBenchmark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListBenchmark {
    public static void main(String[] args){

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(new Random().nextInt(1000000));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList insert: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(new Random().nextInt(1000000));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList insert: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            arrayList.get(new Random().nextInt(99999));
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList random access: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            linkedList.get(new Random().nextInt(99999));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList random access: " + (endTime - startTime) + "ms");


        startTime = System.currentTimeMillis();
        for (int i = 99999; i > 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList remove: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 99999; i > 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList remove: " + (endTime - startTime) + "ms");


    }
}
