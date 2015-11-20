#include <stdio.h>

int Partition(int v[],int low,int high){
	int flag;
	int pivotkey = v[low];
	flag = v[low];
	while(low<high){
		while(low<high && v[high] >= pivotkey) --high;
		v[low] = v[high];
		while(low<high && v[low] <= pivotkey) ++low;
		v[high] = v[low];

	}
	v[low] = flag;
	return low;
}

void qsort(int v[], int low, int high){
	int pivotloc;
	if(low<high){
		pivotloc = Partition(v,low,high);
		qsort(v,low,pivotloc-1);
		qsort(v,pivotloc+1,high);
	}
}

main(){
	int i;
	int v[] = {7,1,3,5,2,4,6,9,10};
	qsort(v,0,8);
	for(i = 0;i<9;i++)
		printf("%d ",v[i]);

}