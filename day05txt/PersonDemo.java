/*
����������
��װ���̳У���̬��

��װ��
����ʵ��ϸ�ڡ�����˰�ȫ�ԡ�
����������С�ķ�װ�塣




private :˽�У��������γ�Ա������˽��ֻ�ڱ�������Ч��
Ϊ�˳���Ľ�׳�ԣ�ͨ���Ὣ��Ա����˽�л���ͨ�����з���������з��ʣ��ô����ڿ����ڷ����ڼ����߼��жϡ�
ͨ������javaԼ���׳ɵĹ淶��������з���ͨ���ᶨ���set get������

˽�н����Ƿ�װ��һ�����֡�


*/
class Person
{
	private int age;
	private String name;

	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}

	public void setAge(int a)
	{
		age = a;
	}

	public int getAge()
	{
		return age;
	}
	public void abc(int a)
	{
		if(a>0 && a<130)
		{
			age = a ;
			speak();
		}
		else
			System.out.println("nono");
	}
	public void speak()
	{
		System.out.println(name+"::"+age);
	}
}



class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.name = "lisi";
		//p.age = -20;
		p.abc(-20);
		//p.speak();
	}
}
