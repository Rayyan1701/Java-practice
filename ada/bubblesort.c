#include<windows.h>
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<time.h>

int* sort(int arr[],int n)
{
	
	for(int i=0;i<n;i++)
	{
		
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				
				
				int temp=arr[j];
		        arr[j]=arr[j+1];
		        arr[j+1]=temp;
			}
			
		}
		
	}
	return arr;
}

int main()
{
	clock_t start,end;
	int a[1000];
	
	
	for(int i=0;i<1000;i++)
	{
		a[i]=rand()%50;
	}
		start=clock();
	    sort(a,1000);
	    sleep(1);
	    end=clock();
	    
	    printf("sorted array:-\n");
	    for(int j=0;j<1000;j++)
	    {
			printf("%d\t",a[j]);
		}printf("\n");
		
	  	
	  	printf("\n\n");
	

	float t=(end-start)/CLOCKS_PER_SEC;
	  	printf("time taken :-   %f",t);
	
}


