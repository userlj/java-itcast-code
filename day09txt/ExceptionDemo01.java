/*

��һ���֡�
���ն��幦��ʱ����Ϊ�����ķ��������⣬ͨ��throws����ʽ������
�����쳣��������ַ�ʽ��������try�ķ�ʽΪ�ص㡣



��ʾ�쳣�ڳ���ķ����Լ��쳣�Ĵ���


���쳣���д���


�����쳣�Ĵ����������֣�
1���������쳣�׳���
2��ʹ�����������쳣���д���
try
{
	
}
catch(�쳣���� ������)
{

}


�쳣�ĺô�����������������ת��
			�����Խ��������̴���������������롣

�������������������������װ�ɶ���


*/

class Demo
{

	//�ڶ��幦��ʱ����Ϊ�����Ĳ�ȷ���ԣ��п��ܵ��¹����޷����㡣Ϊ����߰�ȫ�ԣ������׳��ֵ������ں�������������
	//��������ʹ�øù���ʱ������������������ǿ�ƴ���
	int div(int a,int b)throws Exception
	{
		return a/b;
	}
}

class ExceptionDemo01 
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
			System.out.println("exception...");
		}
		
		System.out.println("over");
	}
}
