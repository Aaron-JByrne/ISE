#include <stdio.h>

int main(void)
{
   int x = 0x12345678;
   char *y = (char*) &x;
   
   if (*y == 0x12) {
      printf("This machine is big-endian\n");
   }
   else if (*y == 0x78) {
      printf("This machine is little-endian\n");
   }
   else {
      printf("This machine is weird\n");
   }
   
   return 0;
   
   }