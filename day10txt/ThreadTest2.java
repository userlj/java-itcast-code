/*
����
�����˸���300Ԫ��������ÿ��100Ԫ���������С�

*/

class Bank
{
	private int sum;
	//Object obj = new Object();
	public synchronized void add(int n)//ͬ������
	{
		//synchronized(obj)
		//{
			sum = sum + n;
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println("sum="+sum);
		//}
	}
}

class Consumer implements Runnable
{
	private Bank b = new Bank();
	public void run()
	{		
		for(int x=0; x<3; x++)
		{
			b.add(100);
		}
	}
}


class  ThreadTest2
{
	public static void main(String[] args) 
	{
		//��ȻҪ����Consumer�Ķ���
		//��ΪҪ��Runnable�ӿڵ����������Ϊ�������ݸ�Thread��Ĺ��캯����
		Consumer c = new Consumer();

		//�����̶߳���
//		Thread t1 = new Thread(c);
//		t1.start();
		new Thread(c).start();
		new Thread(c).start();

	}
}
