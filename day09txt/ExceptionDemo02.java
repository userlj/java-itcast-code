/*

�ڶ����֡�
���գ����ܵĶ��쳣���׳���
���ù���ʱ����catch�Ĵ���


��catch����
�����幦��ʱ���ù��ܻᷢ�����쳣��ֻһ����
��ô�����ں�����ͨ��throws�ؼ��ֶԶ���쳣�����������쳣���ͨ�����Ÿ�����

��ô�ڵ��øù���ʱ������try����Ҳ��Ҫ���з��ദ��
��ô����Ҫtry��Ӧ���catch�������

Сϸ�ڣ������catch���������档






*/

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

class ExceptionDemo02 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();

		try
		{
			int x = d.div(4,4);
			System.out.println("x="+x);
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("�������");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�Ǳ�Խ��");
		}
		
		System.out.println("over");
	}
}
