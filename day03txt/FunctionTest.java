/*
	��ϰ��
	1������һ�����ܣ���ȡ�������������������
	2������һ����ӡ99�˷����ܵĺ�����
	3������һ�����ܣ����տ��Է��������ط�����Ӧ�ĵȼ���
		90~100 ��A'  80~89 'B'  70~79 'C' 60~69 'D' 60���¡�'E'

	*/


class  FunctionTest
{


	/*
	3������һ�����ܣ����տ��Է��������ط�����Ӧ�ĵȼ���
		90~100 ��A'  80~89 'B'  70~79 'C' 60~69 'D' 60���¡�'E'

	1,����ֵ������ char��
	2��������int��
	*/
	public static char getLevel(int num)
	{
		char ch ;
		if(num>=90 && num<=100)
			ch = 'A';
		else if(num>=80 && num<=89)
			ch = 'B';
		else if(num>=70 && num<=79)
			ch = 'c';
		else if(num>=60 && num<=69)
			ch = 'd';
		else 
			ch = 'E';
		return ch;
	}


	/*
	2������һ����ӡ99�˷����ܵĺ�����
	*/
	
	public static void print99()
	{
		for(int x=1;x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}


	/*
	1������һ�����ܣ���ȡ�������������������
	*/
	public static int getMax(int a,int b)
	{
		/*
		if(a>=b)
			return a;
		else
			return b;
		*/
		return (a>=b)?a:b;
	}
	
	public static void main(String[] args)
	{

	}



}
