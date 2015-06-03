/*
���ڴ�ӡ������Ǻ����⡣
��Ҫ����һ����Դ��������һ�Ρ�

����Դ���ж����ǣ������жϸ���Դ�Ƿ������ݴ��ڡ�

Ȼ��ͨ��wait notify���������̵߳Ŀ��ơ�



wait();��ִ�е��̵߳Ľ��뵽����״̬��
notify()�������̳߳��еĵ�һ���̡߳�
notifyAll()���������б��ȴ����̡߳�
����������������ͬ���в����̣߳�
Ϊ��ʲôû�ж�����Thread���У����Ƕ�����Object�С�

��Ϊ��Щ������Ҫ��ʶ���������ڵ�����
����������������ܱ����������õķ���������Object���С�


*/

class Res
{
	String name;
	String sex;
	boolean b ;
}

class Input implements Runnable
{
	Res r; 

	Input(Res r)
	{
		this.r = r;
	}

	public void run()
	{
		int x = 0;

		while(true)
		{
			synchronized(r)
			{
				if(r.b)
					try{r.wait();}catch(InterruptedException e){}
					
				if(x==0)
				{
					r.name = "Mike";
					r.sex = "nan";
				}
				else
				{
					r.name = "������";
					r.sex = "ŮŮŮŮ";
				}
				r.b = true;
				r.notify();

			}
			x = (x+1)%2; 
		}
	}
}


class Output implements Runnable
{
	private Res r ;
	Output(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			synchronized(r)
			{
				if(!r.b)
					try{r.wait();}catch(InterruptedException e){}
				System.out.println(r.name+"......."+r.sex);
				r.b = false;
				r.notify();
			}
		}
	}
}
class  ThreadDemo11
{
	public static void main(String[] args) 
	{
		Res r = new Res();
		Input in = new Input(r);
		Output out = new Output(r);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		t1.start();
		t2.start();
	}
}

