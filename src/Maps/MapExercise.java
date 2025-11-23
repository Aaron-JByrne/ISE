package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        System.out.println("type end to stop entering pairs");


        while (running) {
            System.out.println("1 - Add a pair\n2 - Query\n3 - Print the map\n4 - Exit");

            switch(Integer.parseInt(input.nextLine())){
                case 1:
                    System.out.println("Enter a key");
                    String key = input.nextLine();
                    System.out.println("Enter a value");
                    String value = input.nextLine();
                    map.put(key, value);
                    break;
                case 2:
                    System.out.println("Enter a key");
                    String keyRequest = input.nextLine();
                    if (map.containsKey(keyRequest)) {
                        System.out.println(map.get(keyRequest));
                    } else {
                        System.out.println("Key not found");
                    }
                    break;
                case 3:
                    System.out.println(map);
                    break;
                case 4:
                    running = false;
                    break;
            }
        }




    }
}
