class  FunctionDemo
{
	public static void main(String[] args) 
	{
		//int x = 3+4;
		//int y = 5+6;

		int x = getSum(3,7);
		//System.out.println(x);

		//draw(3,6);
		//draw(7,9);	

	}


	

	/*
	���幦�� �ж����������Ƿ���ȡ�
	1������ֵ���ͣ�boolean ��
	2�������б��������α�����
	*/
	public static boolean compare(int x,int y)
	{
		/*
		if(x==y)
			return true;
		else
			return false;
		*/

		//return (x==y)?true:false;

		return x==y;

	}


	/*
	
	���ֵ���ӡ��ͬ��С�ľ���ʱ����Ȼ���ƴ��������ɣ����Ǵ�����ظ��̶�̫�ߡ�
	�ɲ��������һ�´���ĸ�������

	�ɴ࣬����һ��ר�Ż����εĹ��ܡ�
	��ʲôʱ��ʹ�øù��ܼ��ɡ��������ι��ܵĴ����Ÿù����С�

	1����ȷ�ù��ܵĽ������Ϊ�Ǵ�ӡ����ˣ�����û�о���Ľ������ô����������void��
	2����û��λ�����ݲ��������أ��У��к��в�ȷ�����ͽ��к��ж���Ϊ��ʽ������
	*/
	public static void draw(int row,int col)
	{
		for(int x=0; x<row; x++)
		{
			for(int y=0; y<col; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}



	public static void add(int a,int b)
	{
		System.out.println(a+b);
		//return;

	}

	/*
	����һ���ӷ�����Ĺ��ܡ�
	1����ȷ�������һ�������͡�����ֵ���;�ȷ��Ϊint��
	2��ʵ�ָù��ܵĹ������Ƿ���Ҫδ֪���ݲ��������أ������ͱ�������ȷ������Ϊ�������ڡ�

	int add(int a,int b)
	{
		return a+b;
	}

	����ֵ���� ������(�������� ��ʽ����1���������� ��ʽ����2������)
	{
			ִ�����;
			return ����ֵ;
	}

	���庯���ķ�ʽ��
	��Ϊ����������ʵ�ֹ��ܵģ������Խ��ù��ܽ��и��á�

	1����ȷ�ù��������Ľ������ʵ��������ȷ����ֵ���͡�
	2����ȷ�ù�����ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㡣��ʵ��������ȷ�����б�

	*/
	public static int getSum(int x,int y)
	{
		return x+y;
	}


}
