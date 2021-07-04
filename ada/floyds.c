#include<stdio.h>
#include<stdlib.h>
#include<time.h>


int min(int a,int b)
{
    if(a>b)
    {
        return b;
    }

    return a;
}


int main()
{
    
	int graph[10][9][9];
	int n;
	clock_t start,end;
	
	
	printf("Enter number of vertices :");
	scanf("%d",&n);
	
	printf("Enter the adjacency matrix of the parent graph\n");
	printf("Enter 1000 if no edge present\n\n");
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			
			 
				 //printf("Enter length of edge (%d,%d) :",i+1,j+1);
			     scanf("%d",&graph[0][i][j]);
			    // graph[0][i][j]=rand()%20;
				 
			 
		 
		
		}
		
	}
     
     start=clock();
    for (int k = 1; k <= n; k++)
    {
       for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               graph[k][i][j]=min(graph[k-1][i][j],(graph[k-1][i][k-1]+graph[k-1][k-1][j]));
           }
           
       }
       
    }
    end=clock();
    

    printf("the final matrix that shows least distance from each vertex pair is: \n");

    	for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
				
                printf("%d ",graph[n][i][j]);
            }
            printf("\n");
        }
        
        
        float t=1.0*(end-start)/CLOCKS_PER_SEC;
	    printf("\n\nTime taken : %f",t);   
        		
			     
}
