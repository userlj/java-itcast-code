/*
��ʾͬ������һ���׶� ��������

����ͨ��������ͬ��Ƕ�׵�Ƕ�ס�


�������ɡ�

*/

class SaleTicket implements Runnable
{
	private  int tick = 500;
	private Object obj = new Object();

	boolean b = true;

	public void run()
	{
		if(b)
		{
			while(true)
			{
				synchronized(obj)
				{
					func();
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

	public synchronized  void show()
	{
		synchronized(obj)
		{
			if(tick>0)
			{
				//try{Thread.sleep(10);}catch(InterruptedException e){}
				System.out.println(Thread.currentThread().getName()+".....show...."+tick--);
			}
		}
	}

	public synchronized  void func()
	{
		if(tick>0)
		{
			try{Thread.sleep(10);}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+".....func...."+tick--);
		}
	}
}


class  ThreadDemo9
{
	public static void main(String[] args) 
	{
		SaleTicket st = new SaleTicket();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		t1.start();
		//�����߳���΢ͣһ�£���t1��ȥִ��ͬ������顣
		//Ȼ�����߳������Ժ��ڽ���ǽ����л�����t2ȥִ��ͬ��������
		try{Thread.sleep(10);}catch(InterruptedException e){}
		st.b = false;
		t2.start();


	}
}
