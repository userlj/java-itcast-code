/*
��̬����顣
static 
{

}
������ļ��ض�ִ�У�������������ִ�С�����ִֻ��һ�Ρ�
���Զ�����г�ʼ����

*/

class Demo
{
	static
	{
		System.out.println("c");
	}

	{
		System.out.println("haha");
	}

	Demo()
	{
		System.out.println("kk");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}

class StaticCode 
{
	/*
	static
	{
		System.out.println("a");
	}
	*/
	public static void main(String[] args) 
	{
		//Demo d = new Demo();
		//Demo d1 = new Demo();
		//Demo.show();
		//Demo.show();

		Demo d = new Demo();
		Demo d1 = new Demo();
		//System.out.println("d");
	}
	/*
	static
	{
		System.out.println("b");
	}
	*/
}
