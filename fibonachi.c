#include <stdio.h>

long long fibo(long long int num)
{
    static long long arr[201]={0};
    
    if(arr[num]!=0)
        return arr[num];
    
    else if (num==1||num==2)
        return arr[num]=1;
    
    else
        return arr[num]=(fibo(num-1)+fibo(num-2))%10009;
}
int main(void)
{
    long long int num;
    scanf("%lld", &num);
    printf("%lld", fibo(num));
}
