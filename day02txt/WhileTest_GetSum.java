/*
����1~100�ĺ͡�
˼·��
1��1~100�й��ɣ�����ͨ��ѭ������ʽ����Щ���Զ����֡�
2��ÿ����������ĺ���Ҫ����һ����������͡�
	ÿ�γ��ֵĺ��Ǳ仯�ġ���Ҫ��һ��������¼��ֵ��
	���øñ�������һ����������͡�

*/

class  WhileTest_GetSum
{
	public static void main(String[] args) 
	{
		int x = 1;
		int sum = 0;

		while(x<=100)
		{
			sum = sum + x;
			x++;
		}

		System.out.println("sum="+sum);		
	}
}
