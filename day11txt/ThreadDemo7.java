/*
ͬ������ʹ�õ���ʲô���أ�
��Ϊ��������Ҫ��������ã����Ժ�������һ������������
�ö���ʹ�õ�this����ʾ�ģ�����ͬ������ʹ�õ�������this��

����ʾ����֤ͬ�����������ǲ���this��

ͨ�������߳�����֤һ�£�
һ���߳���ͬ��������
һ���߳���ͬ�������С�
�������ʹ�õ���ͬһ��������ô�Ͳ������0��Ʊ��
����ͻᰲȫ���⡣

��ӡ����������£�
Thread-1.....show....6
Thread-0.....obj....5
Thread-1.....show....4
Thread-0.....obj....3
Thread-1.....show....2
Thread-0.....obj....1
Thread-1.....show....0

������0��Ʊ�İ�ȫ���⡣
������ͬ�������ָ����⡣
˵������ͬ��ǰ��û���㡣

����߳��õĲ���ͬһ������

��ͬ�������Ҳʹ��this�������
��ȫ��������
�Ӷ���֤ͬ������ʹ�õ�this����


*/

class SaleTicket implements Runnable
{
	private static int tick = 300;
	//private Object obj = new Object();

	boolean b = true;

	public void run()
	{
		if(b)
		{
			while(true)
			{
				synchronized(this)
				{
					if(tick>0)
					{
						try{Thread.sleep(10);}catch(InterruptedException e){}
						System.out.println(Thread.currentThread().getName()+".....obj...."+tick--);
					}
				}
			}
		}
		else
		{
			while(true)
			{
				show();
			}
		}
		
	}

	public synchronized static void show()
	{
		if(tick>0)
		{
			try{Thread.sleep(10);}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+".....show...."+tick--);
		}
	}
}


class  ThreadDemo7
{
	public static void main(String[] args) 
	{
		SaleTicket st = new SaleTicket();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		t1.start();
		//�����߳���΢ͣһ�£���t1��ȥִ��ͬ������顣
		//Ȼ�����߳������Ժ��ڽ���ǽ����л�����t2ȥִ��ͬ��������
		//try{Thread.sleep(10);}catch(InterruptedException e){}
		st.b = false;
		t2.start();


	}
}
