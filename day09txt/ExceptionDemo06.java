/*
�������֡�
�쳣ʹ�õ�ϸ�ڡ�
�쳣�����֣�
һ������ʱ�����쳣��
һ������ʱ�����쳣��

�쳣�ڼ̳й����г��ָ���ʱ��ע�����

1�����า�Ǹ��෽����������෽���׳��쳣������ֻ���׳����෽���쳣���߸��쳣�����ࡣ
2����������׳�����쳣������ֻ���׳�����쳣���Ӽ���


���า�Ǹ���ʱ��ֻ���׳������쳣����������Ӽ�

class AException extends Exception
{}
class BException extends Exception
{}
class CException extends AExcetpion

class Fu
{
	void show()throws AException ,BException
	{
		
	}
}

class Zi extends Fu
{
	void show()throws CException
	{}
}

*/






class FuShu extends RuntimeException
{
}
class Demo
{
	int div(int a,int b)
	{
		if(b<0)
			throw new FuShu();
		return a/b;
	}

	void show(int [] arr)
	{
		if(arr==null)
			throw new NullPointerException("����Ϊnull���޷�����");
		System.out.println(arr[2]);
	}
}



class  ExceptionDemo06
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		int num = d.div(4,-1);
		d.show(null);
		System.out.println("num="+num);
		System.out.println("over");
	}
}
