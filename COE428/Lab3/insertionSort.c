#include "mySort.h"

void mySort(int array[], unsigned int first, unsigned int last){
	
	for(int i = first; i <= last; i++){
		int key = array[i];
		int j = i - 1;
		while(j >=0 && (myCompare(array[j],key)>0)){
			mySwap(&array[j+1], &array[j]);
			j--;
		}
		myCopy(&key, &array[j+1]);
	}
}
