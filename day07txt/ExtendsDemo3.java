/*
�Ӹ����й��캯�����ص㡣(����ʵ��������)

֮���Ը��๹�캯�������У�����Ϊ������Ĺ��캯����һ����һ����ʽ����� super();

ΪʲôҪ���ø����еĹ��캯���أ�
��Ϊ����̳��˸��࣬Ҳ���ǻ�ȡ�˸����еĳ�Ա��
������ʹ�øó�Ա֮ǰ��Ӧ�ÿ�һ�¸���������ζԸó�Ա���г�ʼ���ġ�


���������еĹ��캯������Ĭ�Ϸ��ʸ����пղ����Ĺ��캯����
��Ϊÿһ�������һ�ж���super().����Ϊ������������һ��Ĭ�Ͽղ������캯����


��������û�пղ����Ĺ��캯��ʱ����������ڹ��캯���У�
ͨ��super�����ָ��Ҫ���ʵĸ����еĹ��캯����
����ͨ��this�����ָ��Ҫ���ʵı��๹�캯����

Ϊʲôsuper������this���Ҫ�������๹�캯���ĵ�һ���أ�
��Ϊ��ʼ������Ҫ��ִ�С�

*/

class SupClass //extends Object
{
	SupClass()
	{
		//super();
		System.out.println("sup run");
	}
	SupClass(int x)
	{
		System.out.println("hah");
	}
}

class SubClass extends SupClass
{
	SubClass()
	{
		//super();
		System.out.println("sub run");
	}
	SubClass(int x)
	{
		this();
		System.out.println("hehe");
	}
}

class  ExtendsDemo3
{
	public static void main(String[] args) 
	{
		SubClass sc = new SubClass(4);//sup run  sub run

	}
}

//.Ĭ�Ϲ��캯������Ȩ�޵ģ�Ȩ�޺��������Ȩ��һ�¡�
class Demo //extends Object
{
	// Demo(){//super();}
}