/*
�����߳�ͬʱִ�С�
�������������߳̿����������̺߳���������һ������ִ�У���Ϊ��ʱ�п���cpu��ִ���������̡߳�

ÿһ���̶߳����Լ�Ĭ�ϵ����ƣ�Thread-��ţ��ñ�Ŵ�0��ʼ��

Thread currentThread():��ȡ��ǰ�̶߳�������á�
String getName():��ȡ�̵߳����ơ�

���������ڵ��߳�����Ϊ��main��



*/

class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		this.name = name;
	}
	public void run()
	{
		for(int x=0; x<10; x++)
		{
			for(long y=-1999; y<1999; y++){}
			System.out.println(Thread.currentThread().getName()+".....name:"+name+"...."+x);
		}
	}
}

class  ThreadDemo2
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo("one");
		Demo d2 = new Demo("two");

		/*
		�����ֱ�ӵ���run��������ʱֻ��һ���߳������У����������������̡߳�
		��Ϊ�̲߳�û�б�������
		d1.run();
		d2.run();
		*/
//		d1.run();
//		d2.run();
		d1.start();
		d2.start();

		for(int x=0; x<50; x++)
		{
			System.out.println(Thread.currentThread().getName()+".......main method run ...."+x);
		}
	}
}
