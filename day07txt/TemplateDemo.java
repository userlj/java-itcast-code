/*
����
��ȡ�Զ���������е�ʱ�䡣

ģ�淽�����ģʽ��
������⣺���幦��ʱ��һ���ֹ���ȷ����һ���ֲ�ȷ����ʱ��
	����ȷ���Ĳ��ֱ�¶��ȥ������������ɡ�

*/

abstract class GetTime
{
	public final void getTime()
	{
		long start = System.currentTimeMillis();		
		run();
		long end = System.currentTimeMillis();
		System.out.println("����:"+(end-start));
	}

	public abstract  void run();
}

class Sub extends GetTime
{
	public void run()
	{
		for(int x=0; x<10000; x++)
		{
			System.out.print(x);
		}
	}
}

class  TemplateDemo
{
	public static void main(String[] args) 
	{
		new Sub().getTime();
	}
}
