#include "mySort.h"

void merge(int array[],int first, int mid,int last)
{
	int temp[MAX_SIZE_N_TO_SORT];
	int i1,i2,x;
	i1 = first;
	i2 = mid+1;
	x = 0;
	
	while(i1<=mid && i2<=last){
		
		if(myCompare(array[i1],array[i2]) < 0){
			temp[x++] = array[i1++];
		}
		else{
			temp[x++] = array[i2++];
		}
    }
	
	while(i1<=mid){
		myCopy(&array[i1++],&temp[x++]) ;
	}
	while(i2<=last){
		myCopy(&array[i2++],&temp[x++]);
	}
		
	for(i1=first,x=0;i1<=last;i1++,x++){
		mySwap(&array[i1],&temp[x]);
	}
}


void mySort(int array[], unsigned int first, unsigned int last)
    {
		if (first >= last){
			return;
		}
		
		else{
			int mid = first + (last-first)/2;
			mySort(array, first, mid);
			mySort(array, mid+1, last);
			merge(array, first, mid, last);
		}
    }
