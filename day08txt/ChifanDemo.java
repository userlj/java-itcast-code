abstract class Person
{
	abstract void chifan();

}
class Chi
{
	void kaichi(Person p)//Person p = new Zhangsan();
	{
		p.chifan();
	}
}



class Zhangsan extends Person
{
	void chifan()
	{
		System.out.println("����");
	}
}

class Lisi extends Person
{
	void chifan()
	{
		System.out.println("����");
	}
}




/*
��ǰ��ָ�Ӷ��������顣
��ô��������Ժ�ָ��ÿһ������ͱ�̸��ӵ����飬����ø�������򵥻��أ�
�ҵ���Щ����Ĺ��ԡ�ֻҪָ���������������Ϳ����ˡ�
*/

class  ChifanDemo
{
	public static void main(String[] args) 
	{

		Chi c = new Chi();
		c.kaichi(new Zhangsan());
		c.kaichi(new Lisi());
//		Zhangsan z = new Zhangsan();
//		z.chifan();
//		Lisi l = new Lisi();
//		l.chifan();
	}
}
