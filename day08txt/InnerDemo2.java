

abstract class Demo
{
	abstract void show();
	
}

//��ʽ��new ������߽ӿ�(){}
class Outer
{
	int x = 3;
	/*
	class Inner extends Demo
	{
		public void show(){System.out.println(x);}
	}
	*/
	public void method()
	{
		//new Inner().show();

		new Demo()
		{
			public void show()
			{
				System.out.println(x+"...");
			}
			/*
			public void func()
			{
				System.out.println("hah");
			}
			*/
		}.show();

	}
}

class  InnerDemo2
{
	public static void main(String[] args) 
	{
		//new Outer().method();

		new Test().method();//��������show func������ͨ�������ڲ�������ɡ�




	}
}


//��ϰһ��

interface Inter
{
	void show();
	void func();
}

class Test
{
	/*
	private class Inner implements Inter
	{
		public void show(){}
		public void func(){}
	}
	public void method()
	{
		Inner in =new Inner();
		in.show();
		in.func();
	}
	*/

	public void method()
	{
		Inter in = new Inter()
		{
			public void show(){}
			public void func(){}
		};

		in.show();
		in.func();
	}
}







//��ϰ����

interface Inter2
{
	void function();
}

class Test2
{
	//������롣
	static Inter2 method()
	{
		return new Inter2()
		{
			public void function(){}
		};
	}

}

main()
{
	Inter2 in = Test.method();
	in.function();

	Test2.method().function();
}