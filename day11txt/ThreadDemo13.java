/*
���ֹͣ�߳��أ�
��Ϊstop������ʱ�ˡ�

ֹͣ�̵߳����ַ�ʽ��
1�������ǣ���run����������
	run������һ�㶼����ѭ����ֻҪ����סѭ���������ɡ�
	�������ַ�ʽ�о����ԣ�����߳̽��뵽����״̬���ǲ����ȡ��ǵġ���ô�߳��ǲ���ֹͣ�ġ�

2���ж��̡߳���ʵ��������̵߳Ķ���״̬�����ָ̻߳���������״̬�������Ϳ������߳�ȥ��ȡ��ǣ��������̡߳�

ֹͣ�߳�ԭ��������run����������



*/


class StopThread implements Runnable
{
	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"...exception....");
				flag = false;
			}
			System.out.println(Thread.currentThread().getName()+"....");
		}
	}
	public void change()
	{
		flag = false;
	}

}

class  ThreadDemo13
{
	public static void main(String[] args) 
	{
		StopThread st = new StopThread();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);

		t1.start();
		t2.start();

		int num = 0;

		while(true)
		{
			if(num++==50)
			{
				//st.change();
				t1.interrupt();
				t2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"...."+num);
		}
	}
}
/*
wait():�ͷ���Դ���ͷ�����
sleep():�ͷ���Դ�����ͷ�����

�ͷ���Դ������cpu���ڴ�����̡߳�

*/