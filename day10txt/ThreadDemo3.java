
/*
ʾ����
��Ʊ����
��ΪƱ�ᱻ����߳�ͬʱ������
������Ҫ�̳�Thread��������Ʊ�������run�����С�
*/
class SaleTicket  extends Thread
{
	private int tick = 100;
	public void run()
	{
		while(true)
		{
			if(tick>0)
			{
				System.out.println(Thread.currentThread().getName()+".....sale......"+tick--);
			}
		}
	}
}




class ThreadDemo3 
{
	public static void main(String[] args) 
	{

		//�����ĸ��̣߳������400��Ʊ��
		//��Ϊÿһ�������еĶ����Լ���tick���ԡ�
		SaleTicket t1 = new SaleTicket();
		//SaleTicket t2 = new SaleTicket();
		//SaleTicket t3 = new SaleTicket();
		//SaleTicket t4 = new SaleTicket();


		//��һ���߳̿����ĴΣ������.IllegalThreadStateException����Ч�߳�״̬�쳣��
		t1.start();
		t1.start();
		t1.start();
		t1.start();
	}
}
