
class Outer
{
	public void show()
	{
		Object obj = new Object()
		{
			public void func()
			{
				System.out.println("fun");
			}
		};
		obj.func();//�����������Ǹ���������ִ��������󡣶�������û��func����������ʧ�ܡ�


	}
}

class  InnerObject
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

		new Outer().show();
	}
}
