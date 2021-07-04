#include<stdio.h>
#include<string.h>
#include<time.h>
int match(char main[],char substr[])
{
	int match=0,um=0,i,mlen,sublen;
	mlen=strlen(main);
	sublen=strlen(substr);
	
	for( i=0;i<=(mlen-sublen);i++)
	{
		if(main[i]==substr[0])
		{
			for(int j=1;j<sublen;j++)
			{
				if(main[i+j]!=substr[j])
				{
				    	um=1;
				}
				
			}
			if(um!=1)
			{
				match=1;
				break;
			}
			
		}
		
		
	}
	if(match==1){
	return i;}
	
	return 0;
	
}


int main()
{
	char a[20],b[20];
	int i;
	clock_t start,end;
	printf("Enter a main string :\n");
	gets(a);
	printf("Enter a substring string :\n");
	gets(b);
	start=clock();
	i=match(a,b);
	end= clock();
	if(i)
	{
		printf("The string is found at position : %d\n",i+1);
	}
	else
	{
		printf("The string is not found");
	}
	
	float t=(start-end)/CLOCKS_PER_SEC;
	  	printf("time taken :-   %f",t);
	
}
