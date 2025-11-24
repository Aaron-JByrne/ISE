#include <stdio.h>

int fib(int a, int b) {
   if (b<100000) {
      printf("%d ",a);
      return fib(b,b+a);
   }
   else {
      return 0;
   }
   
}

int fib(int a, int b) {
   
}

int main() {
  fib(1,1);
  
  return 0;
}


