/*

�������֡�
��ȡ�쳣�Ľ�Ϊϸ�ڵ���Ϣ��

��Ҫͨ���쳣�ķ�������ɡ�
Exception��ֻ���幹�캯����
����Ҫ���丸��ķ�����

String getMessage():��ȡ�쳣��Ϣ��
String toString():��ȡ�����쳣�������Լ��쳣��Ϣ��
void printStackTrace():��ӡ�쳣�������쳣��Ϣ���쳣�����ڳ����λ�á�
					jvmĬ�ϵ��쳣������ƣ���ʵʹ�õľ��Ǹ÷�����





*/
import java.io.*;
class Demo
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int[] arr = new int[a];
		System.out.println(arr[b]);//�������ĽǱ�Խ�磬����ֽǱ�Խ���쳣����jvm����ɶ����׳���
								//��ʱ�ĺ����Ѿ���ת�����������޷�ִ�С�
		return a/b;
	}
}

class ExceptionDemo03 
{
	public static void main(String[] args) throws IOException
	{
		Demo d = new Demo();

		try
		{
			int x = d.div(4,0);
			System.out.println("x="+x);
		}
		
		catch (ArithmeticException e)//ArithmeticException e = new ArithmeticExcetion();
		{
			System.out.println("�������");
			System.out.println("message:"+e.getMessage());
			System.out.println("toString:"+e.toString());
			//System.out.println("className:"+e.getClass().getName());
			//e.printStackTrace(new PrintStream("exce.log"));//���쳣��Ϣ���س־û��洢��
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�Ǳ�Խ��");
		}
		
		System.out.println("over");
	}
}
