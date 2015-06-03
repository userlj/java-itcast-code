/*
��ϰ��
����������㡣
����������Ϊ0�����߸�����
�ں�������ͨ���쳣��ʽ���³������ת��
�ڵ�����Ҫ���ж�catch�Ĵ���




*/


class ByZeroException extends Exception
{
	ByZeroException()
	{
		super();
	}
	ByZeroException(String message)
	{
		super(message);
	}
}

class ByFuShuException extends Exception
{
	ByFuShuException()
	{
		super();
	}
	ByFuShuException(String message)
	{
		super(message);
	}
}

class DivDemo
{
	public int div(int a,int b)throws ByZeroException,ByFuShuException
	{
		if(b==0)
			throw new ByZeroException("����������Ϊ0,ץ��ʱ�俴��");
		if(b<0)
			throw new ByFuShuException("���������Ը���");
		return a/b;
	}
}
class  ExceptionTest
{
	public static void main(String[] args) 
	{
		DivDemo d = new DivDemo();
		try
		{
			int num = d.div(4,-1);
			System.out.println("num="+num);
		}
		catch (ByZeroException e)
		{
			System.out.println(e.getMessage());
		}
		catch (ByFuShuException e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("over");

	}
}
