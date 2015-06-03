/*
���ģʽ�����ǽ��������֮��Ч�ķ�����
�������ģʽ����֤һ�������ڴ��еĶ���Ψһ�ԡ�


˼·��
1�����������ཨ�����������Ϊ�����ཨ��������кܶࡣ�޷����ơ�
2���ڸ����У�����һ���������
3�������ṩ������ȡ�ö��󼴿ɡ�

���裺
1��˽�л����캯�������������ཨ�������ʼ������ô��������޷�������������ˡ�
2������һ��������󡣲�˽�к;�̬��
3�������ṩһ����̬��������������Ի�ȡ�ö���
*/

class Single
{

	private static final Single s = new Single();
	private Single(){}
	public static  Single getInstance()
	{
		return s;
	}
}

class Single2
{
	private static  Single2 s = null;
	private Single2(){}
	public static synchronized Single2 getInstance()
	{
		if(s==null)
			s = new Single2();
		return s;
	}
}


class Test
{
}
class  SingleDemo
{
	public static void main(String[] args) 
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1==s2);
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1==t2);

	}
}
