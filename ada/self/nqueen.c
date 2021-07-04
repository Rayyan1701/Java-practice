#include<stdio.h>
#include<stdlib.h>

// void print(int board[][])
// {
   
    

// }

int main()
{
    int board[10][10];

    int n=5,colvalue[5],i=0,j=0;



    //  for (int i = 0; i < 5; i++)
    // {
    //     for (int j = 0; j < 5; j++)
    //     {
    //         printf("%d",board[i][j]);
            
    //     }
    //     printf("\n");     
            
    // }



colvalue[0]=0;
colvalue[1]=0;
i=1;

    
    while (i<5)    
    {
        j=colvalue[i]+1;
        while(j<5)
        {
            if (j==colvalue[i-1])
            {
                j++;
            }
            for (int k = 0; k < i; k++)
            {
               if (abs(colvalue[k]-j)==abs(i-k))
               {
                  j++;
               }
               
            }
            if (j>=5)
            {
                i--;
            }
            else
            {
                colvalue[i]=j;
            }
       }
           
            
    }
     for (int j = 0; j < 5; j++)
        {
            printf("%d",colvalue[j]);
            
        }
    




}