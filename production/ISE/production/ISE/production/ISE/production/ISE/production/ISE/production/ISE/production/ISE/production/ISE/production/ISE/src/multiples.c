#include <stdio.h>
#include <stdbool.h>


bool multiple(int x){
	if (x%5==0||x%3==0){
		return true;
	}else{
	return false;}
}



int main() {
	int sum = 0;
	int i;
	for (i=0;i<1000;i++) {
		if (multiple(i)) {
			sum += i;
		}		
	}
	printf("%d", sum);
}

