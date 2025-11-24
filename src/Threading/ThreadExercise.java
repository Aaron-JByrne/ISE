package Threading;

public class ThreadExercise {
    public static void main(String[] args) {
        myThread threadA = new myThread("threadA");
        threadA.start();
        myThread threadB = new myThread("threadB");
        threadB.start();
    }
}

class myThread extends Thread{
    int count = 0;
    String name;

    myThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.printf("%s - %d\n", this.name, count++);
            System.out.println(getAllStackTraces());
            try{
                sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
