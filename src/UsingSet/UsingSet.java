package UsingSet;
import java.util.*;


public class UsingSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(set.contains(input));
        System.out.println(set);


        Set<String> treeSet = new TreeSet<>();
        String input2 = scanner.nextLine();
        String[] inputArray = input2.split(" ");
        Collections.addAll(treeSet, inputArray);
        System.out.println(treeSet);
    }
}
