/*
�����ڲ��ࣺ��ʵ�����ڲ���ļ�д��ʽ��

ǰ�᣺
�ڲ�����Լ̳��ⲿ�����ʵ���ⲿ�ӿڡ�


��ʽ��new ������߽ӿ�(){}

�����ڲ�����ʵ���ǣ���������������������е��֡�


ʲôʱ��ʹ�������ڲ����أ�
Ӧ�ó���֮һ���������Ĳ����Ľӿ����͵�ʱ�򣬸ýӿ��еķ���������3����
���ʱ�򣬿��Խ������ڲ�����Ϊʵ�ʲ������д��ݡ�


*/

class Demo
{
	void show()
	{
		System.out.println("haha");
	}
}


class Outer
{
	int x = 3;
	/*
	class Inner extends Demo
	{
		void show()
		{
			System.out.println(x);
		}
	}
	*/
	public void method()
	{
		//new Inner().show();
		
		new Demo()
		{
			void show()
			{
				System.out.println("hehe");
			}
		}.show();

	}
}


interface Inter3
{
	void show();
	void method();
}


class  InnerDemo
{
	public static void main(String[] args) 
	{
		new Outer().method();
		
		Inter3 i = new Inter3()
		{
			public void show(){}
			public void method(){}
		};


		function(i);
	}

	//��ʾӦ�ó�����
	public static void function(Inter3 in)
	{
		in.show();
		in.method();
	}
}
