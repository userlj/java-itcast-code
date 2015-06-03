/*

���Ĳ��֡�
�Զ����쳣��

���Զ������Ŀ�г������������ʱ�򣬸�����java��û�����Ӧ��������
��ʱ����Ҫ�Լ������������˼�����������Զ����������
������Զ����쳣��


����
����������㡣Ҫ�󣬳���������Ϊ������

1,�Ը����������������
	����һ����̳�Exception��Ŀ��ֻ��һ�����ø���߱������ԡ�
2,ͨ��throw�ؼ��ֽ�������Ķ�������׳�������������ת��
	ͨ�������������throw�׳�����ô������һ��Ҫ����throws��������

Throwable����ϵ�߱����ص㣺
����ϵ���еĶ��󶼿��Ա�throws ��throw�ؼ��ֲ�����


throw��throws������

throw���ں����ڣ�������쳣����
throws���ں����ϣ�������쳣������������ö��Ÿ�����






*/

class FuShuException extends Exception
{
	private int num;
	FuShuException()
	{
		super();
	}
	//�Զ����쳣����Ϣ��ֻҪͨ��super���ø��๹�캯��������Ϣ���ݸ����༴�ɡ�
	FuShuException(String mess)
	{
		super(mess);//����Throwable�Ѷ��������
					//���Բ��������й����ʼ���Ķ���������ˣ���ô����ֻҪʹ�ø���ĳ�ʼ�������Ϳ����ˡ�
	}

	FuShuException(String mess,int num)
	{
		super(mess);
		this.num = num;
	}
	public int getFuShu()
	{
		return num;
	}
}
/*

ThrowableԴ���У��Ѿ������쳣��Ϣ�Ľ��г�ʼ�����Լ���ȡ��
��ô����̳�Throwable��ֻҪ���ø����Ѷ���õĹ��ܼ��ɡ�


class Throwable
{
	private String detailMessage;
	Throwable(String message)
	{
		detailMessage = message;
	}
	public String getMessage()
	{
		return detailMessage;
	}
}
*/
class Demo
{
	int div(int a,int b)throws FuShuException
	{
		if(b<0)
			throw new FuShuException("���ֳ���������� / by fushu--",b);
		return a/b;
	}
}

class ExceptionDemo04 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();

		try
		{
			int x = d.div(4,-188);
			System.out.println("x="+x);
		}
		catch (FuShuException e)
		{
			System.out.println("�����ǣ�"+e.getFuShu());
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}		
		System.out.println("over");
	}
}

/*
class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}


class Zhangsan extends Person
{
	Zhangsan(String name)
	{
		super(name);
	}
}

main()
{
	Zhangsan z = new Zhangsan("haha");
	System.out.println(z.getName());
}

*/