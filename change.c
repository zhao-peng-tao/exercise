#include <stdio.h>
int main()
{
	int price = 0;
	
	int money = 0;
	
	printf("请输入金额(元)\n");
	printf("请输入总额(元)\n"); 
	scanf("%d",&price);
	scanf("%d",&money);
	int change = money - price;

	printf("找您%d\n",change);

	return 0;


 } 
