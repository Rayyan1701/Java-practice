#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main()
{
    int matrix[20][20],n,queue[20],reach[20],v=1,i=0,j=0;
    clock_t start,end;

    
	printf("Enter number of vertices :");
	scanf("%d",&n);
	
	printf("Enter the adjacency matrix of the directed graph\n");
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
			{
				matrix[i][j]=0;
			}
			 else
			 {
                 matrix[i][j]=rand()%2;
				 printf("Enter length of edge from %d to %d = %d \n",i+1,j+1,matrix[i][j]);
			    //  scanf("%d",&matrix[i][j]);
			   
				 
			 }
		
		
		}
        reach[i]=0;
	}

    
//      for(int i=0;i<n;i++)
// 	{
// 		for(int j=0;j<n;j++)
// 		{
// 			matrix[i][j]=0;
			
		
		
// 		}
// 		reach[i]=0;
        
// 	}
//    matrix[0][1]=1;
//    matrix[0][2]=1;
//    matrix[0][3]=1;
//    matrix[1][4]=1;
//    matrix[2][4]=1;
//    matrix[3][2]=1;
//    matrix[3][5]=1;
//    matrix[3][6]=1;
//    matrix[4][7]=1;
//    matrix[5][2]=1;
//    matrix[5][7]=1;
//    matrix[6][8]=1;
//    matrix[6][7]=1;








    
    printf("enter the starting edge");
    scanf("%d",&v);
    queue[i++]=v;
    
    reach[v-1]=1;
    start=clock();
    while(i!=j)
    {
        for(int k=0;k<n;k++)
        {
            if(matrix[queue[j]-1][k]!=0 && reach[k]==0)
            {
                queue[i++]=k+1;
               reach[k]=1;
            }

        }
         
        j++;

    }
    end=clock();

    printf("The BFS traversal is :");
    for (int i = 0; i < j; i++)
    {
        printf(" %d",queue[i]);
    }
    printf("\n");
    
    
    float t=(end-start)/CLOCKS_PER_SEC;
	  	printf("time taken :-   %f",t);





			     
}
