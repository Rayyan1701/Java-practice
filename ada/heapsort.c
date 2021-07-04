#include<windows.h>
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<time.h>
int temp;  
  
void heapify(int arr[], int size, int i)  
{  
    int largest = i;    
    int left = 2*i + 1;    
    int right = 2*i + 2;    
  
    if ((left < size) && (arr[left] > arr[largest]))
    {
        largest = left;
    }
  
    if ((right < size) && (arr[right] > arr[largest]))  
    {
        largest = right;
    } 
  
    if (largest != i)  
    {   
        temp = arr[i];  
        arr[i]= arr[largest];   
        arr[largest] = temp;  
        heapify(arr, size, largest);  
    }  
}  
  
void heapSort(int arr[], int size)  
{  
    int i;  
    for (i = size / 2 - 1; i >= 0; i--)  
    heapify(arr, size, i);  
    for (i=size-1; i>=0; i--)  
    {  
        sleep(1);
        temp = arr[0];  
        arr[0]= arr[i];   
        arr[i] = temp;  
        
  //      for(int i=0;i<size;i++)
	//{
	// printf("%d ",arr[i]);	
	//}printf("\n");
        
        
        heapify(arr, i, 0);  
    }  
}  
  
int main()  
{  
    int arr[1000],size;
	clock_t start,end;
	printf("Enter the no of elements : ");
	scanf("%d",&size);
	
	for(int i=0;i<size;i++)
	{
	 //arr[i]=rand()%100;	
     scanf("%d",&arr[i]);
	}
	printf("The values :");
	for(int i=0;i<size;i++)
	{
	 printf("%d ",arr[i]);	
	}	
    printf("\nSorting");
	start=clock();
	heapSort(arr,size);
	end=clock();
	printf("\nValues after sorting :");
	for(int i=0;i<size;i++)
	{
	 printf("%d ",arr[i]);	
	}
	float t=1.0*(end-start)/CLOCKS_PER_SEC;
	printf("\nTime taken : %f",t);   
}
