
/*
���캯��֮�����ʹ��this��䡣
ע�⣺this��䡣ֻ�ܷ��ڹ��캯���ĵ�һ�С�
��Ϊ��ʼ������һ��Ҫ��ִ�С�


*/
class Person
{
	private int age;
	private String name;

	Person()
	{
		this("hah");
		this.name = "heihei";
		
	}
	private Person(String name)
	{
		this.name = name;
	}
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public void show()
	{
		System.out.println("name="+name);
	}

}
class ThisDemo2 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.show();

		//Person pp = new Person();

	}
}
