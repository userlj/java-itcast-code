class Person
{
	 private int age;
	 private String name;

	//Person(){}
	

	
	Person()
	{
		System.out.println(name+"::"+age);
	}
	
	Person(String n)
	{
		this.name = n;
	}
	/**/

	public void setName(String n)
	{
		this.name = n;  //this ����ǰ����
		zhangsan.name=n;
		
	}
	public String getName()
	{
		return this.name;
	}
	Person(String n,int a)
	{
		name = n;
		age = a;
		///speak();
		cry();
	}
	public void speak()
	{
		System.out.println(name+"::"+age);
	}

	public void cry()
	{
		System.out.println("wa......");
	}
}
/*
���ֶ���һ���������캯���������ˡ�
���캯�������ã����ڸ�������г�ʼ����

���캯����һ�㺯��������

���캯�������ѽ����ͻ����С�
��һ�㷽������Ҫ��������òŻᱻִ�С�

Person p2 = new Person("wangwu",30);
Person p1=new Person();

1,�ȼ���Person.class�ļ���
2���ڶ��ڴ��п��ٿռ䣬
3���Ըÿռ�����Խ��г�ʼ����
	3.1Ĭ�ϳ�ʼ����
	3.2��ʾ��ʼ����
	3.3���캯����ʼ����
4����ջ�п��ٿռ䣬p2���ڣ�
	����������ڴ��ֵַ����p2
5��p2��ָ���˸ö���


ͨ��class��������У�
����һ��Ĭ�ϵĿղ������캯����
���������ϵͳ�Զ�������ϵġ�

���ǣ������������Զ��Ĺ��캯��ʱ��Ĭ�ϵĹ��캯����û���ˡ�

ʲôʱ���幹�캯���أ�
��������Ϊ�˽������󣬽�������ʱ����Ҫִ�е����ݣ������ڹ��캯���С�



*/
class ConsDemo
{
	public static void main(String[] args)
	{
		//Person p = new Person();
		//Person p1 = new Person("lisi");
		//p1.speak();

		//Person p2 = new Person("wangwu",30);

		//p2.setName("wangcai");
		//p2.setName("Сǿ");
		//System.out.println(p2.getName());
		//p2.speak();
		
		Person zhangsan=new Person();
		Person lisi=new Person();
		//System.out.println("zhangsan.name="+zhangsan.name);
		//System.out.println("zhangsan.age="+zhangsan.age);
		zhangsan.setName("����");
		lisi.setName("��˹");
		
	}
}