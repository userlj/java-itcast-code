/*
����
��Ҫ��one��twoͬʱִ�С�
��ʱ����Ҫ��ԭ�е��̳߳����ϣ���������������̵�Ԫ��

��window�Ѿ�����ʵ���̵߳Ķ�����javaֻ��Ҫ���øö������ɣ�
���÷�ʽ����װ����һ�����ж����У��ö�����Thread��


ͨ������api�ĵ���
�����̵߳ĵ�һ�ַ�ʽ��
1���̳�Thread�ࡣ
2������Thread���е�run�����������߳�Ҫִ�еĴ�������run�����С�
3������Thread���������󴴽��̡߳�
4��ʹ���߳����start���������̣߳������̵߳�run������

name:two....0
name:one....0
name:two....1
name:one....1
name:two....2
name:one....2
name:two....3

����one ��two����ͬʱִ���ˡ�

���������м���forѭ�����֣��������߳��ڽ���ͬʱִ�С�

ÿһ�ε�ִ�н������һ���������˶��̵߳����ԣ�����ԡ�
ԭ������cpu�ڲ��ϸ�ÿһ���̷߳���һ��ʱ��Ƭ�����ſ��ٵ��л���





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
			System.out.println("name:"+name+"...."+x);
		}
	}
}

class  ThreadDemo1
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo("one");
		Demo d2 = new Demo("two");
		//d1.show();
		//d2.show();
		d1.start();
		d2.start();

		for(int x=0; x<50; x++)
		{
			System.out.println("main method run ...."+x);
		}
	}
}
