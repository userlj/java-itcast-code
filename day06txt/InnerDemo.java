/*
�ڲ������ֱ�ӷ����ⲿ���еĳ�Ա��
���ⲿ������ڲ�����Ҫ�����ڲ������


����������������ġ�

�����������ﵱ�л��������ʱ��ͨ���ڲ�����������

���ڲ�����static��ʱ��
�����ڲ����зǾ�̬��Ա��new �ⲿ��.�ڲ���().show();
�����ʵ��ڲ����еĳ�Ա�Ǿ�̬��ʱ���ⲿ��.�ڲ���.show();

���ǲ����齫�ڲ��ඨ��ɾ�̬����Ϊ����ַ��ʾ����ԡ�
���ڲ�����Ҫ���徲̬��Աʱ���ڲ���һ��Ҫ����̬���Ρ�
ע�⣻ֻ���ڲ��ඨ�����ⲿ��ĳ�Աλ���ϣ��ſ��Ա�private static�ȳ�Ա���η������Ρ�


�Ǿ�̬���ڲ���֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա��
����Ϊ�ڲ���������ⲿ������á��ⲿ��.this;
*/

class Outer
{
	private  int x = 3;
	private int z = 9;
	class Inner
	{
		int x = 4;
		void show()
		{
			int x = 5;
			System.out.println(Outer.this.z);
		}
	}

	public void method()
	{
		System.out.println(this.z);
		Inner in = new Inner();
		in.show();
	}
}


class Outer2
{
	int x = 5;

	public void function(final int a)
	{
		final int z = 3;

		class Inner2
		{
			void show()
			{
				System.out.println(a);
			}
		}

		Inner2 i = new Inner2();
		i.show();
	}
	
}


class  InnerDemo
{
	public static void main(String[] args) 
	{
		Outer2 o = new Outer2();
		o.function(7);
		o.function(1);

		//Outer.Inner.show();
		//new Outer.Inner().show();

		//Outer out = new Outer();
		//out.method();
		//Outer.Inner in = new Outer().new Inner();//�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������
		//show();
	}
}
