#include <stdio.h>
#include<string.h>

int horsepool(char string[], char pattern[], int ST[])
{

    int sl = 0, pl = 0, j = 0,k;

    

    sl = strlen(string)-1;
    pl = strlen(pattern)-1;
    j = pl - 1;
     
    while (j <= sl - 1)
    {
		printf("%d\n",j);
		
        k = 0;
        
        while (k <= pl - 1 && pattern[pl - 1 - k] == string[j - k])
        {
            k++;
        }

        if (k == pl)
        {
            return j - pl + 2;
        }
        else
        {
            j = j + ST[string[j]-'a'];
        }
    }
    return -1;
}

int main()
{
    char pattern[20], string[50];
    int ST[27], sl = 0, pl = 0,index,pos;
    printf("Enter the main string :");
    fgets(string, 50, stdin);
     printf("press Enter \n");
    getchar();
    printf("Enter the pattern string :");
    fgets(pattern, 20, stdin);
    
    sl = strlen(string)-1;
    pl = strlen(pattern)-1;

    for (int i = 0; i < 26; i++)
    {
        ST[i] = pl;
    }
    for (int i = 0; i < pl - 1; i++)
    {
        index = pattern[i] - 'a';
        ST[index] = pl - 1 - i;
    }

  
    
    
    pos=horsepool(string,pattern,ST);
    
    if(pos==-1)
    {
		printf("Pattern does not exist int the main string %d     %s %d \n",pos,pattern,pl);
	}
	else
	{
		printf("pattern string at position : %d from beginning\n",pos);
	}
    
}
