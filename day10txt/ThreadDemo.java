/*
���̣߳�

ʲô�ǽ��̣�
����ִ�еĳ���

ʲô���̣߳�
�߳̾��ǽ����е�һ�����Ƶ�Ԫ��
һ��������������һ���������̡�
����һ�����Ƶ�Ԫ����Ϊ���̳߳���

һ�������е��ж�����Ƶ�Ԫʱ���ͳ�Ϊ���̳߳���
���̵߳ĳ��������Ч�ʡ�



���̳߳�������ѭ���ϴ�ʱ��oneûӴִ���ꡣtwo�ǲ�����ִ�С�
*/




class Demo
{
	private String name;
	Demo(String name)
	{
		this.name = name;
	}
	public void show()
	{
		for(int x=0; x<10; x++)
		{
			for(long y=-1999999999; y<1999999999; y++){}
			System.out.println("name:"+name+"...."+x);
		}
	}
}

class  ThreadDemo
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo("one");
		Demo d2 = new Demo("two");
		d1.show();
		d2.show();
	}
}
