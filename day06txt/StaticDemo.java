/*
static����̬���η���
�����������еĳ�Ա���������߳�Ա������

�����εĳ�Ա�����ܱ���������⣬�����Ա����������á�

����̬���ε����ݱ�����������
��ˮ�������ӡ�


static���ص㣺
1��static������ļ��ض����أ����������ʧ����ʧ��
	Ҳ����˵static�������������
2�������ڶ�����ڡ�

3�������ж���������

4������ֱ�ӱ��������á�

��Ա�������Ŷ���Ľ��������ڣ����Ŷ��󱻻��ն���ʧ��



��̬ʹ�õ�ע�����
1����̬����ֻ�ܷ��ʾ�̬��Ա���Ǿ�̬�������Է��ʾ�̬�������Ǿ�̬������
2����̬�����в����Ա�дthis����super�ؼ��֡�
3���������Ǿ�̬�ġ�




*/

class Person
{
	String name;//��Ա������Ҳ��ʵ��������
	static String country = "CN";//��̬������Ҳ���������
	Person(String name)
	{
		this.name= name;
	}
	public native void show()
	{
		System.out.println(this.name);
	}
}


/*
�������Ǳ�jvm�����õģ�
��ôjvm���׸�main������ʲô���Ĳ����أ�

��ӡargs����ǣ�[Ljava.lang.String;@119298d
һ�������Ľ������֪����argsֵ����null������ָ����һ������ʵ�塣

������ӡһ�¸�����ʵ��ĳ��ȡ�
����Ϊ0.

��ô������jvm���ݵ��Ǿ��� new String[0];
*/
class  StaticDemo
{
	public static void main(String[] args) //String[] args  = new String[0];
	{
		//for(int x=0; x<args.length; x++)
			//System.out.println(args[x]);//
		Person p = new Person("lisi");

		p.show();


		String[] arr = {"kk","qq","oo","zz"};

		DemoMain.main(arr);

		//Person p = new Person();
		//System.out.println(p.country);

		//System.out.println(Person.country);//����.��̬��Ա

		//p.show();
		//Person.show();
		
	}

}

class DemoMain
{
	public static void main(String[] args)
	{
		for(int x=0; x<args.length; x++)
		{
			System.out.println(args[x]+"...");
		}
	}
}


/*

class Demo
{
	int x = 4;
	public static void main(String[] args) 
	{
		new Demo().show();		
	}
	public void show()
	{
		System.out.println(x);
	}
}
*/