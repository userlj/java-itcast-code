/*
���ͷ�����
���ǽ����Ͷ����ڷ����ϡ�

���Ͷ��������ϣ��÷��������������ࡣ
��ô����һ�����󣬸ö�����������͵ķ���ʱ����Щ����ֻ�ܲ���ͬһ�����͡�

�ɲ������ò�ͬʹ�÷��͵ķ���������ͬ���������أ�
��ʱֻҪ�����Ͷ����ڷ����ϼ��ɡ�

*/


class Utils<Z>
{
	<Q> void show(Q t)
	{
		System.out.println("show:"+t);
	}
	<T> void print(T t)
	{
		System.out.println("print:"+t);	
	}
	void method(Z z)
	{
		System.out.println("method:"+z);	
	}
}


class  GenericDemo04
{
	public static void main(String[] args) 
	{

		//���Ͷ��������ϣ��Լ������ϡ�
		Utils<String> u1 = new Utils<String>();
		u1.show(1234);
		//u1.method(456);//������Ϊ�÷���Ҫ�����ж���ķ���һ�¡�

		//���Ͷ����ڷ����ϡ�
		/*
		Utils u = new Utils();
		u.show("haha");
		u.print(123);
		*/

		//���Ͷ��������ϡ�
		/*
		Utils<String> u = new Utils<String>();
		u.show("haha");
		u.print(123);
		*/

		
	}
}
