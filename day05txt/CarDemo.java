class Car
{
	int luntai = 4;
	String color = "red";
	public void run()
	{

		System.out.println(luntai+"...."+color);
	}
}



class CarDemo
{
	public static void main(String[] args) 
	{
		//�������� ������������ʼ��ֵ��

		Car c1 = new Car();//�����ͱ���һ��ָ�����
		//c1.color = "blue";//������.�����Ա��
		//c1.run();

		Car c2 = new Car();
		//c2.color = "bule";
		//c.run();


		show(c1);
		show(c2);


		new Car();//����������ʵ���Ƕ����һ�ּ�д��ʽ��
		/*
		1�����Է�������һ�ε��õ�ʱ�����ʹ����������
		2���������������Ϊʵ�ʲ������д��ݡ�
		*/
//		Car c = new Car();
//		c.run();
//		c.luntai = 3;
//		c.run();
//
//		new Car().luntai = 6;
//		new Car().run();
//		new Car().run();

		//Car c1 = new Car();
		show(new Car());

	}
	public static void show(Car c)//Car c = c1;//Car c = new Car();
	{
		c.luntai = 3;
		c.color = "black";
		c.run();
	}
}

