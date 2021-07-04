#include<windows.h>
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<time.h>

int size;
void merge(int a[],int low,int mid,int high)
{

	int i,j,k,b[size];
	i=low;
	j=mid+1;
	k=0;
	
	while(i<=mid && j<=high)
	{
		if(a[i]<a[j])
		{ 
			b[k++]=a[i++];
		}
		else
		{
			b[k++]=a[j++];
		}
			
	}
	
	while(i<=mid)
	{
		b[k++]=a[i++];
	}
	while(j<=high)
	{
		b[k++]=a[j++];
	}
	k=0;
	for(int i=low;i<=high;i++)
	{
		a[i]=b[k++];
		
	}
	
	
}


void ms(int arr[],int low,int high)
{
	if(low<high)
	{
		sleep(1);
		
		int mid=(low+high)/2;
		ms(arr,low,mid);
		ms(arr,mid+1,high);
		merge(arr,low,mid,high);
		
	}
	
}


int main()
{
	int arr[1000];
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
	 printf("\n");	
	
	
	start= clock();
	ms(arr,0,size-1);
	end=clock();
	  	
	  	printf("after:");
	for(int i=0;i<size;i++)
	{
	 printf("%d ",arr[i]);	
	}
	printf("\n ");	
	
	float t=(end-start)/CLOCKS_PER_SEC;
	printf("time taken :-   %f",t);

}
