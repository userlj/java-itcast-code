/*
Object���и����ж������˽��бȽϵķ�����
����������������Զ�����������У��������ݲ���������Ҫ�ġ�

��ʱ��������Լ̳и÷���������д�÷������ݡ�

*/

class Demo //extends Object
{
	private int num;
	Demo(){}
	Demo(int num)
	{
		this.num = num;
	}
	public boolean equals(Object obj)//Object obj = new Demo();
	{
		if(!(obj instanceof Demo))
			return false;
		Demo d = (Demo)obj;
		return this.num == d.num;
	}
	/*
	���������Լ��Ķ����Ӧ���ַ���������ʽ��ֻҪ����Object���еķ������ɡ�
	�÷������������������У�����ʡ�Բ�д��
	*/
	public String toString()
	{
		return "num:"+num;
	}

	public void finalize()
	{
		System.out.println("haha");
	}

	//getClass();���ڻ�ȡ�����������ࡣ���ص��Ǹ����ļ���Ӧ�Ķ���


}

class Test
{
}

class ObjectDemo 
{
	public static void main(String[] args) 
	{

		new Demo();
		new Demo();

		System.gc();
		new Demo();

//		Demo d1 = new Demo(5);//Demo.class
//		Demo d2 = new Demo(5);
//		Test t = new Test();
//		Class c = d1.getClass();
//		System.out.println(t.getClass().getName());
//		System.out.println(t);

//		System.out.println(d1.equals(t));
	}
}


/*

���ж��󶼾��з�����ȡ����Object���С�
1��boolean equals(Object obj):������������бȽϡ�
2��String toString():��ȡ������ַ���������ʽ��
ͨ���ڿ����У�Ϊ�˶����Զ������ıȽϷ�ʽ���ַ�����ʽ��
���ḴдObject���е��������������

3��int hashCode():��ͨ����ϣ�㷨��һ���������ڴ��д洢λ�á�
4��Class getClass():��ȡ�������������ļ�������ʵ�����ֽ����ļ�����
5��void  finalize():�����������ĵ��õķ�����




*/