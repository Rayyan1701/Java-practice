#include<stdio.h>
#include<stdlib.h>
#include<time.h>


int n;
struct node 
{
	int data;
	struct node* next;
	
};

struct node * get_node(int l)
{
	struct node* p;
	p=(struct node*)malloc(sizeof(struct node));
	p->data=l;
	p->next=NULL;
	return p;
}

struct node* find(struct node* arr[],int l)
{
	
	for(int i=0;i<n;i++)
	{
		for(struct node* temp=arr[i];temp!=NULL;temp=temp->next)
		{
			if(temp->data==l)
			{
				return arr[i];
			}
		}
	}
	
}

void merge(struct node* a,struct node* b,struct node* arr[])
{
	struct node* temp;
	
	 for(temp=a;temp->next!=NULL;temp=temp->next)
		{
			
		}
	
		
		for(struct node* temp2=b ;temp2!=NULL;temp=temp->next,temp2=temp2->next)
		{
		    temp->next=get_node(temp2->data); 
		    
		}
		
		for(int i=0;i<n;i++)
		{
			
			if(arr[i]!=NULL &&(arr[i]->data) == (b->data))
			{
				
				arr[i]=NULL;
				
			}
			
		}
	
	
}



void display(struct node* a)
{
    printf("\n");
    for(struct node* temp=a;temp!=NULL;temp=temp->next)
    {
        printf("%d ",temp->data);
    }
}
	  

int main()
{
	int i1=0,mincost=0;
	int matrix[9][9],result[20][2];
	int min=999,a,b;
	clock_t start,end;
	
	struct node* arr[9];
	
	printf("Enter number of vertices :");
	scanf("%d",&n);
	
	printf("Enter the adjacency matrix of the parent graph\n");
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
			{
				matrix[i][j]=0;
			}
			 else if(j>=i)
			 {
				 //printf("Enter length of edge (%d,%d) :",i+1,j+1);
			     //scanf("%d",&matrix[i][j]);
			     matrix[i][j]=rand()%20;
				 
			 }
		 else
			 {
				 matrix[i][j]=matrix[j][i];
			 }
		
		}
		arr[i]=get_node(i+1);
	}			
			     
			 
// 	

   
   
//   for(int j=0;j<n;j++)
// 		{
// 		   for(int i=0;i<n;i++)
// 		      {
// 		       matrix[i][j]=0;
// 		   }
// 		   	arr[j]=get_node(j+1);
// 		}
	   
    
    
//      matrix[2][5]=12;
// 		matrix[0][1]=4;
// 	    matrix[0][2]=28;
// 	    matrix[1][4]=26;
// 	    matrix[2][3]=8;
// 	    matrix[2][5]=12;
// 	    matrix[3][4]=22;
// 	    matrix[3][6]=16;
// 	    matrix[4][6]=20;
// 	    matrix[5][6]=6;
    
    	
//     	for(int i=0;i<n;i++)
//     	{
//     	for(int j=0;j<n;j++)
// 		{
		    
			
// 			 if(i>j)
// 			 {
// 				 matrix[i][j]=matrix[j][i];
// 			 }
// 		}
//     	}
	   
		
   
   
   start=clock();
   
   
   
   
    while(i1<n-1)
	{

		struct node* u,*v;
	min=999;
	  for(int i=0;i<n;i++)
	  {
		  
		  for(int j=0;j<n;j++)
		  {
			  if(min>matrix[i][j] && matrix[i][j]!=0 && i<j)
			  {
				  min =matrix[i][j];
				  a=i+1; b=j+1;
				 
				  //matrix[i][j]=0;
				  //matrix[j][i]=0;
			  }
			
		  }
		 
	  }
	  matrix[a-1][b-1]=0;
	  matrix[b-1][a-1]=0;
	  	  
	  
	  u=find(arr,a);
	  v=find(arr,b);
	 
	  if(u->data != v->data)
	  {
	      
		  result[i1][0]=a;  result[i1][1]=b;
		 
		  i1=i1+1;
		  
		  mincost+=min;
		  
		  merge(u,v,arr);
		  
		  //display(u);
		  //display(v);

		  
		  
	  }
	  
		
	}
	end= clock();
	
	if(i1!=n-1)
	{
		printf("No spanning tree possible in this graph\n");
	
	}
	else
	{
		printf("spanning tree possible in this graph, the vertices in spanning tree are :-\n");
		for(int i=-0;i<i1;i++)
		{
			printf("(%d,%d)",result[i][0],result[i][1]);
		}
	}
	
	
	float t=(end-start)/CLOCKS_PER_SEC;
	  	printf("time taken :-   %f",t);
	
	
}
