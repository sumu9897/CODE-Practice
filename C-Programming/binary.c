#include<stdio.h>    
#include<stdlib.h>  
int main(){  
int x[10],n,i;    

printf("Enter the number to convert: ");    
scanf("%d",&n);    
for(i=0;n>0;i++)    
{    
x[i]=n%2;    
n=n/2;    
}    
printf("\nBinary of Given Number is=  ");    
for(i=i-1;i>=0;i--)    
{    
printf("%d",x[i]);    
}    
return 0;  
}  
