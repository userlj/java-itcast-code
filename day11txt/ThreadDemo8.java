/*
��ͬ��������static���κ�ʹ�õ�����ʲô�أ�

static�������ǲ����Գ���this�ġ�
ͨ������ʾ��Ҳ��֤����һ�㡣


static��������ļ��ض����أ���ʱ��û�н�������Ķ���
ֻ���౻���ؽ����ڴ棬��ʱֻ��һ��������ھ��Ǹ�������Ӧ���ֽ����ļ�����

��̬ͬ��������ʹ�õ����ǣ��÷�����������ֽ����ļ�����
����  ������.class
*/

class SaleTicket implements Runnable
{
	private static  int tick = 300;

	boolean b = true;

	public void run()
	{
		if(b)
		{
			while(true)
			{
				synchronized(SaleTicket.class)
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

	public synchronized static  void show()
	{
		if(tick>0)
		{
			try{Thread.sleep(10);}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+".....show...."+tick--);
		}
	}
}


class  ThreadDemo8
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


//------------------------------
/*
�������ģʽ�е�����ʽ��
������̲߳������ʸ÷���ʱ���п��ܳ����̰߳�ȫ���⡣
������getInstance�����ϼ�����ͬ����
��Ȼ����˰�ȫ���⡣����Ч�ʽ����ˡ�

����ͨ��˫���жϵ���ʽ����һ���Ż���

����Ҫ�ᡣ


*/
class Single
{
	private static Single s = null;
	private Single(){}
	public static  Single getInstance()
	{
		if(s==null)
		{
			synchronized(Single.class)
			{
				if(s == null)			
					s = new Single();
			}
		}
		return s;
	}
}

//����ʽ��
class Single
{
	private static Single s = null;
	private Single(){}
	public static synchronized  Single getInstance()
	{		
		if(s == null)			
			s = new Single();		
		return s;
	}
}
//����ʽ��
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{			
		return s;
	}
}
