package recursion;

public class FibonacciRecurisve {
    static int num = 0;

    static int a = 0;
    static int b = 1;
    public static void Fibonacci(int n){
        for(int i=0;i<n;i++){
            //System.out.println(a);
            int temp = a;
            a = a+b;
            b = temp;
        }
    }

    public static void printFibonacci(int n, int a, int b){
        if(n==0){
            return;
        }
        //System.out.println(a);
        printFibonacci(n-1, b, a+b);
    }

    public static void main(String[] args){
        int number = 26434; //highest i can run without stack overflow, difference is 1ms
        long time1 = System.currentTimeMillis();
        Fibonacci(number);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);

        time1 = System.currentTimeMillis();
        printFibonacci(number, 0, 1);
        time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
    }
}
