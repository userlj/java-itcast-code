/*
�߳���ϰ��

1������һ���࣬�̳�Thread�ࡣ����Ϊ����������Ҫ�����߳�ִ�еĴ��롣
2������Thread�е�run���������Զ������Ҫ�����߳�ִ�еĴ������ڸ÷����У�
3������������󴴽��̡߳�
4�������̡߳�

ͨ��run��������ѭ���ṹ��
*/

class A extends Thread
{
	public void run()
	{
		for(int x=0; x<30; x++)
		{
			System.out.println(Thread.currentThread().getName()+"aa"+x);
		}
	}
}




class  
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		for(int x=0; x<50; x++)
		{
			System.out.println(" hello"+x);
		}
	}
}
/*
����һ����Ʊ����
ͨ�����߳�����ɡ�
�߳�ͨ���ڶ��ַ�ʽ��������


*/


��ҵ��
�Լ����һ�µ������ģʽ������ʽ���ص㡣
�����̲߳������ʸ÷���ʱ���᲻����ְ�ȫ���⡣
��ν���أ�
��ν��������΢��Чһ���أ�

class Single
{
	private static Single s = null;
	private Single(){}
	public static synchronized Single getInstance()
	{
		if(s==null)
			s = new Single();
		return s;
	}
}


