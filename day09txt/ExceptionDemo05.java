/*
���岿�֡�
finally:�ô�����д�ŵ���һ���ᱻִ�еĴ��롣

ֻ�г���System.exit(0);finally�ǲ��ᱻִ�еġ�

ͨ�����ڹر���Դ��



*/




class  ExceptionDemo05
{
	public static void main(String[] args) 
	{
		try
		{
			int[] arr = new int[3];
			System.out.println(arr[3]);
			
			

		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�Ǳ�Խ��");
			//return ;
			System.exit(0);
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("over");


	}
}


//try ���Ե�����finlly��һ��

class TryDemo
{
	void show()throws Exception
	{
		try
		{
			//sdfasdfasdfsad
			throw new Exception();
		}
		finally
		{
			close();
		}
	}
}