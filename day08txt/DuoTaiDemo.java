class Animal
{
	void chi()
	{
		System.out.println("ani chi");
	}
	void jiao()
	{
		System.out.println("chi jiao");
	}
}

class Dog extends Animal
{
	void chi()
	{
		System.out.println("gu tou");
	}
	void jiao()
	{
		System.out.println("wang wang");
	}
	void kanmen()
	{
		System.out.println("kanmen");
	}
}


class Cat extends Animal
{
	void chi()
	{
		System.out.println("yu");
	}
	void jiao()
	{
		System.out.println("miao miao");
	}
	void catchMouse()
	{
		System.out.println("catch mouse");
	}
}

/*
���ڳ�Ա������
1������ʱ�ڣ��ο��������ͱ��������������Ƿ��е��õķ�����
2������ʱ�ڣ��ο��ĵĶ���������ķ�����


��̬ǰ�᣺
1��������֮��Ҫ�й�ϵ��
2��ͨ�����и��ǲ�����

��̬�ڳ����е����֣�
������߽ӿڵ�����ָ����߽����Լ����������



�����ԣ�
������ʹ�����������еķ�����


��̬�ĺô���
��ǿ�˳������չ�ԡ�


instanceof:�����ж϶����Ƿ�������ָ������߽ӿڡ�

*/

class  DouTaiDemo
{
	public static void main(String[] args) 
	{
		
//		Animal d = new Dog();//��������ָ�����������
//		d.chi();
//		d.jiao();
//
//		Dog d1 = (Dog)d;
//		d1.kanmen();


		//d.kanmen();



//		Dog d = new Dog();
//		d.chi();
//		d.jiao();
//		d.kanmen();
		//show(new Dog());
		show(new Cat());

	}
	public static  void show(Animal a)
	{

		
		a.chi();
		a.jiao();
		if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.kanmen();
		}
		else if(a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
		}

	}

	/*
	public void show(Dog d)//Dog d = new Dog();
	{
		d.chi();
		d.jiao();
	}
	public void show(Cat d)
	{
		d.chi();
		d.jiao();
	}
	*/
}
