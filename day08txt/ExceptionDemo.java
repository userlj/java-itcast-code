/*
�쳣�ĳ��֣���ʵ����java�������������
Throwable
	|--Error:ͨ������д���������д���OutOfMemoryError: Java heap space����.NoClassDefFoundError
	|--Exception�����Զ�����д���

���������µ����������������ƶ����Ը�������Ϊ��β��


*/

class Demo
{
	int div(int a,int b)throws Exception
	{
		return a/b;
	}
}



class ExceptionDemo 
{
	public static void main(String[] args) //throws Exception
	{

		Demo d = new Demo();
		try
		{
			int x = d.div(4,0);
			System.out.println("x="+x);
		}
		catch (Exception e)//Exception e = new ArithmeticException();
		{
			System.out.println("�쳣��");
			System.out.println("message:"+e.getMessage());
			System.out.println("toString:"+e.toString());
			e.printStackTrace();

		}		
		
		System.out.println("over");
	}
}
/*
������쳣��������䡣
try 
{
	��Ҫ�����Ĵ��롣
}
catch(�쳣�� ����)
{
	�쳣������롣
}

finally
{
	һ���ᱻִ�еĴ��롣
}	
*/