
class Person
{
	private int age;
	private String name;


	Person(int age)
	{
		this.age = age;
	}
	Person(String name)
	{
		this.name = name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	/*
	��Person���У�����һ���Ƚ�ͬ��ķ�����
	*/
	public boolean compare(Person p)
	{
		/*
		if(this.age==p.age)
			return true;
		return false;
		*/
		return this.age==p.age;
		
	}
	public void show()
	{
		System.out.println(this.name);
	}
	public void method()
	{
		this.show();
	}
}

/*
this:������һ����������á�
this.name�������е�name��name�ǳ�Ա����
1���������־ֲ������ͳ�Ա����ͬ�����������


this���״����ĸ������أ�

this�ʹ������ں���������������á�

this�����ĸ��������this���ں�����this�ʹ����ĸ�����


ʲôʱ��ʹ��this�أ�
�����幦���ǣ��ù���ʹ�õ��˱���������Ǿ���this����ʾ�������


*/
class ThisDemo 
{
	public static void main(String[] args) 
	{
		Person p1 =new Person(30);
		Person p2 = new Person(24);
		p1.compare(p2);


//		Person p = new Person("xili");
//		p.setName("haha");
//		Person p1 = new Person("fengjie");
//		//p1.setName("hehe");
//		p1.method();

	}
}
