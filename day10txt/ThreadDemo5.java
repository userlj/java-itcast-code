/*
�̵߳İ�ȫ���⡣

ͨ��Thread���е�sleep����ģ��һ�£��̵߳İ�ȫ���⡣
�ö���߳���ָ��λ����ͣ��һ�£�����0�ţ��Լ�����Ʊ�������

�����ɵ��أ�
����������ͬһ����Դ(��Ӧ��ͨ���ǳ�Ա������Ҳ�����̹߳��������)���в���������Щ��䱻���̷ֿ߳�ִ�С�
�����������̰߳�ȫ���⡣



��ν����ȫ�����أ�
ֻҪ��֤��ͬһʱ�̣�ֻ��һ���߳���ִ����Щ������Դ�Ĵ��뼴�ɡ�

����ͨ��ͬ�����������ɡ�

ͬ����ԭ��
��ʵ���������Ĵ��ڡ�

���ϵ������䡣

ͬ���ı׶ˣ�
�����˳����Ч�ʣ��ж����ǽ�Ϊ������Դ��

ͬ��ʹ�õ�ǰ�᣺
1������Ҫ�����������������ϵ��̡߳�
2�����뱣֤����߳�ʹ�õ���ͬһ������

*/

class SaleTicket implements Runnable
{
	private int tick = 100;
	private Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)
			{
				if(tick>0)
				{
					//try{Thread.sleep(500);}catch(Exception e){}
					System.out.println(Thread.currentThread().getName()+".....sale......"+tick--);
				}
			}
		}
	}
}

class ThreadDemo5 
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
/*
java���ṩ��ͬ���ķ�ʽ������̵߳İ�ȫ������

synchronized(����)
{
	��Ҫ��ͬ���Ĵ��룻
}
*/


