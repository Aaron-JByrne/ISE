import java.util.*;

public class NATOalphabet {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String userInput = input.nextLine();
      NATO.convert(userInput);
   }
}

class NATO{

   private static final HashMap<Character, String> phonetic;
   
   static {
      phonetic = new HashMap<>();
      phonetic.put('A', "ALPHA");
      phonetic.put('B', "BRAVO");
      phonetic.put('C', "CHARLIE");
      phonetic.put('D', "DELTA");
      phonetic.put('E', "ECHO");
      phonetic.put('F', "FOXTRO");
      phonetic.put('G', "GOLF");
      phonetic.put('H', "HOTEL");
      phonetic.put('I', "INDIA");
      phonetic.put('J', "JULIETT");
      phonetic.put('K', "KILO");
      phonetic.put('L', "LIMA");
      phonetic.put('M', "MIKE");
      phonetic.put('N', "NOVEMBER");
      phonetic.put('O', "OSCAR");
      phonetic.put('P', "PAPA");
      phonetic.put('Q', "QUEBEC");
      phonetic.put('R', "REOMEO");
      phonetic.put('S', "SIERRA");
      phonetic.put('T', "TANGO");
      phonetic.put('U', "UNIFORM");
      phonetic.put('V', "VICTOR");
      phonetic.put('W', "WHISKEY");
      phonetic.put('X', "X-RAY");
      phonetic.put('Y', "YANKEE");
      phonetic.put('Z', "ZULU");
      }

      
      static void convert(String userString) {
         userString = userString.toUpperCase();
         
         for (int i=0; i<userString.length();i++) {
            if (phonetic.containsKey(userString.charAt(i))) {
               String tempkey = Character.toString(userString.charAt(i));
               System.out.printf("%s ",phonetic.get(userString.charAt(i)));
            }
            if (userString.charAt(i) == ' ') {
               System.out.printf("\n");
            }
            
         }
      }
      
}