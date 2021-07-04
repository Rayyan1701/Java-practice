#include<windows.h>
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<time.h>

int partition(int a[],int low,int high)
{
	int i,j;
	i=low+1;
	j=high;
	
	while(1)
	{
		while(a[i]<=a[low] && i<high)
		{i++;}
		
		while(a[j]>a[low] )
		{j--;}
		
		
			if(i<j)
			{
				int temp;
			    temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
			}
			else
			{
				int temp;
			    temp=a[low];
			    a[low]=a[j];
			    a[j]=temp;
			    
			    return j;
			}
		
		
		
		
	}
}

void sort(int arr[],int l,int h)
{
	int p;
	
	p=partition(arr,l,h);
	
	
	if(l<h)
	{
		sleep(1);
	sort(arr,l,p-1);
	
	sort(arr,p+1,h);
	}
}


int main()
{
	int arr[1000],size;
	clock_t start,end;
	printf("Enter size :");
	scanf("%d",&size);
	
	for(int i=0;i<size;i++)
	{
	 arr[i]=rand()%100;	
	}
	printf("before:");
	for(int i=0;i<size;i++)
	{
	 printf("%d ",arr[i]);	
	}
	
	
	start= clock();
	sort(arr,0,size-1);
	end=clock();
	printf("after:");
	for(int i=0;i<size;i++)
	{
	 printf("%d ",arr[i]);	
	}
	
	float t=(end-start)/CLOCKS_PER_SEC;
	  	printf("time taken :-   %f",t);
}


