class  WhileDemo
{
	public static void main(String[] args)
	{
		int x = 1;
		/*
		while(x<10)
		{					
			System.out.println("x="+x);
			x+=2;
		}
		*/

		int a = 1;

		while(a<3)
		{
			System.out.println("a="+a);
			a++;
		}


		//do while.���������Ƿ����㣬ѭ��������ִ��һ�Ρ�
		do
		{
			System.out.println("x="+x);
			x++;
		}
		while (x<0);

	}
}


