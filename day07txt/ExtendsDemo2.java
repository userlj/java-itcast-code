
/*

������ʾ���Ӹ����г�Ա��������һ�㷽�����ص㡣

*/

class Fu
{
	//int x = 3;
	public  void show()
	{
		System.out.println("number--");
	}
}
/*
�����ඨ�����븸����һģһ���ķ�����ʱ���ͻᷢ��һ�����������ǣ���д����
����ֻ�����ں����ϡ�


����ʹ�õ�ע�����
1�����า�Ǹ���ʱ��Ȩ��һ��Ҫ���ڵ��ڸ���Ȩ�ޡ�
2����ֻ̬�ܸ��Ǿ�̬��

super:��this���÷�һ����
��֮ͬ���ǣ�
this�������������á�
super������Ǹ����������á�

*/
class Zi extends Fu
{
	//int x = 4;
	public void show()
	{
		super.show();
		System.out.println("name");
		System.out.println("photo");
	}
}

class  ExtendsDemo2
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
	}
}
