/*
�����̵߳ĵڶ��ַ�ʽ��
ʵ��Runnable�ӿڡ�

���裺
1�������̴߳���������ʵ��Runnable�ӿڡ�
2����дRunnable�ӿ��е�run�����������߳�Ҫ���еĴ���������С�
3������Runnable�ӿڵ��������
4������Thread��Ķ��󣬲���Runnable�ӿڵ����������Ϊ�������ݸ�Thread��Ĺ��캯����
	ΪʲôҪ���ݸ�Thread��Ĺ��캯����
	��ΪҪ���̶߳���ȥ����ָ����run�����������run��������Runnable�ӿڵ����ࡣ
	���Խ�Runnable�ӿڵ�������󴫵ݸ�Thread��Ĺ��캯�������̶߳���һ�����Ϳ�����ȷҪ���е�run������
5������Thread���start���������̲߳�ִ��ָ����run������
ʵ��Runnable�ӿڵķ�ʽ�������˵��̳еľ����ԡ�

���Ҹ��ַ�ʽ��Ϊ���á�


*/

class SaleTicket implements Runnable
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

class ThreadDemo4 
{
	public static void main(String[] args) 
	{

		
		SaleTicket t = new SaleTicket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
