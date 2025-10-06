public class GCThreads {
   public static void main(String[] args) {
      GCObject myObj = new GCObject();
      myObj = null;
      System.gc();
      System.out.println("Garbage collector running");
      try {
         Thread.sleep(5000);
      } catch(InterruptedException e) {
         System.out.println("catch");
         Thread.currentThread().interrupt();
      }
      System.out.println(GCObject.x);
   }
}

class GCObject {
   static int x = 10;

   @Override
   protected void finalize() {
      System.out.println(Thread.currentThread());
   }
}
