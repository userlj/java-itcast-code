/*
final
1��final���������࣬��Ա�����Ժ���Ϊ�����ֲ�������
2����final���ε��಻���Ա��̳С�
3����final���εķ��������Ա����ǡ�
4����final���εı�����һ��������ֻ�ܸ�ֵһ�Ρ�
5���ڲ����ھֲ�ʱ��ֻ�ܷ��ʱ�final���εľֲ�������



*/
class Test
{
	void show(){}
}
class SubTest extends Test
{
	public static final int x = 9;
	public static final double PI = 3.14;
	SubTest()
	{
		//x = 10;
	}
	SubTest(String s)
	{
		//x = 9;
	}
	void show(){}
}

class  FinalDemo
{
	public static void main(String[] args) 
	{
		new SubTest();
		new SubTest("haha");
	}
}
