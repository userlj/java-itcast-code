/*
�̼߳�ͨѶ��Ҳ���������������ߵ����ӡ�

�����߳���ͬʱ����ͬһ����Դ��
���������̵߳Ķ����ǲ�ͬ�ġ�

���й����г���������

ԭ�������߳�������������û�������Ա�ʱ�������̱߳�cpuִ�У���ʱ�ͻ��������

ͨ��ͬ�������
ʹ���ĸ����أ�Ҫȷ������Ψһ�ԣ��������Դ��Ψһ�ģ����������߳�ͬʱ����
���Կ��Խ���Դ������Ϊ�����ڣ�������������⡣



*/

class Res
{
	String name;
	String sex;
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
				System.out.println(r.name+"......."+r.sex);
			}
		}
	}
}
class  ThreadDemo10
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
