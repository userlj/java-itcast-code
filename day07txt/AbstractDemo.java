/*
�����ࣺ
�������������ϳ�ȡ��
�÷���û�����壬��Ҫ��abstract�ؼ������Ρ�
���󷽷�һ�������ڳ������С�

��������ص㣺
1�������಻������new�ؼ���ʵ������
2����������Ҫ�����ิд���еĳ��󷽷��󣬸�����ſ���ʵ��������������໹�ǳ����ࡣ


*/

abstract class Test
{
	abstract void show();
}

class TestA extends Test
{
	void show()
	{
		System.out.println("Testa show");	
	}
}


class TestB extends Test
{
	void show()
	{
		System.out.println("Testb show");
	}
}
class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
ͨ��ѧԱ��ʾ�������ֳ��󷽷��ĳ��ֿ���ǿ������ȥ��ĳЩ�¡�


*/
abstract class XueYuan
{
	void ˯��()
	{
	
	}

	abstract void ѧϰ����();
	
}

class YuRe extends XuYaun
{
	void ѧϰ����()
	{
		System.out.println("java se");
	}
}

class JiuYe extends XuYuan
{
	void ѧϰ����()
	{
		System.out.println("java ee");
	}
	
}

class ChongCi extends XuYuan
{
	void ѧϰ����()
	{
		System.out.println("java ee");
	}
}


/*
1��������һ����һ�����ࡣ
	abstract class A
	{
		abstract void show();
	}
	abstract class B extends A
	{}
	class C extends B//B����һ�����ࡣ
	{
		void show(){}
	}



2�����������Ƿ��й��캯����
	�й��캯����������Ĺ��캯������������г�ʼ����

3���������пɲ����Բ�������󷽷���
	���Եġ�ֻ��һ�����壬���ø���ʵ������

4������ؼ��ֺ���Щ�ؼ��ֲ����Թ��档
	abstract  class Demo
	{
		 abstract  void show();
	}

	1,final.//
	2,private 
	3,static

*/