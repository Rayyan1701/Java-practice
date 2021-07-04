#include<stdio.h>
#include<stdlib.h>
#include<time.h>



typedef struct std
{
    int data[100];
    int top;
}stack;

int empty(stack *p)
{
	printf("%d",p->top==-1);
    return (p->top==-1);
}


int top(stack *p)
{
	if(!empty(p))
    return p->data[p->top];
}

void push(stack *p,int x)
{
   p->data[++(p->top)]=(x);
   printf("%d",p->data[p->top]);
  
}

void pop(stack *p)
{
    
    if(!empty(p))
    {
       
        p->top=(p->top)-1;
        
    }
    
}








int main()
{
    int matrix[20][20],n,queue[20],reach[20],v=1,i=0,inserted=0;
    stack s;
    clock_t start,end;

    
	printf("Enter number of vertices :");
	scanf("%d",&n);
	
	printf("Enter the adjacency matrix of the directed graph\n");
	
	// for(int i=0;i<n;i++)
	// {
	// 	for(int j=0;j<n;j++)
	// 	{
	// 		if(i==j)
	// 		{
	// 			matrix[i][j]=0;
	// 		}
	// 		 else
	// 		 {
    //              matrix[i][j]=rand()%2;
	// 			 printf("Enter length of edge from %d to %d = %d \n",i+1,j+1,matrix[i][j]);
	// 		    //  scanf("%d",&matrix[i][j]);
			   
				 
	// 		 }
		
		
	// 	}
    //     reach[i]=0;
	// }

    
     for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			matrix[i][j]=0;
			
		
		
		}
		reach[i]=0;
        
	}
   matrix[0][1]=1;
   matrix[0][2]=1;
   matrix[0][3]=1;
   matrix[1][4]=1;
   matrix[2][4]=1;
   matrix[3][2]=1;
   matrix[3][5]=1;
   matrix[3][6]=1;
   matrix[4][7]=1;
   matrix[5][2]=1;
   matrix[5][7]=1;
   matrix[6][8]=1;
   matrix[6][7]=1;








    
    printf("enter the starting edge");
    scanf("%d",&v);
    push(&s,v);
    
    reach[v-1]=1;
    start=clock();
    while(!empty(&s))
    {
		printf("%d",top(&s));
		inserted=0;
        for(int k=0;k<n;k++)
        {
            if(matrix[top(&s)-1][k]!=0 && reach[k]==0)
            {
               push(&s,k+1);
               reach[k]=1;
               queue[i++]=k+1; 
               inserted=1;
               break;
            }

        }
        if(inserted)
        {
			continue;
		}
         
        pop(&s);

    }
    end=clock();
     
    printf("The DFS traversal is :");
    for (int j = 0; j < i; j++)
    {
        printf(" %d",queue[j]);
    }
    printf("\n");
    
    
    float t=(end-start)/CLOCKS_PER_SEC;
	  	printf("time taken :-   %f",t);





			     
}
