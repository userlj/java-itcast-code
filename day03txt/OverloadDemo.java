/*
ʲôʱ���������أ�
�������Ĺ�����һ�£����ǲ����б��ǲ�һ�µġ�
���Ǻ��������Զ���ͬһ�����ƣ���ǿ�Ķ��ԣ�������á�

*/

class  OverloadDemo
{
	public static void main(String[] args) 
	{
		
	}
	public static void isPrint99(int num)
	{
		if(num<=0)
		{
			System.out.println("�Ƿ�����");
			return ;
		}
		
		print99(num);
	}


	public static void print99(int num)
	{
		
		for(int x=1;x<=num; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	public static void print99()
	{
		print99(9);
	}



	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}


/*

void show(float a,char b,int c)
{}

a
void show(char b,float a, int c)

b
int show(float x,char y,int z)
{}

c
void show(float x,char y,int z)

d
void show(char a,int b)

e
int show()
*/
