
//import java.io.*;
class MySystem 
{
	public static void main(String[] args) 
	{

		/*
		�������ԭ��
		��ʵ��ͨ��System������еľ�̬����out������Ӧ�Ķ���PrintStream��
		��ʹ���˸ö���print������

		*/
		System.out.println("Hello World!");

		//PrintStream ps = System.out;

		//ps.println("hello");

//		MPrint p = MSystem.out;
//		p.print("hah");

		MSystem.out.print("haha");
	}
}


class MPrint
{
	public void print(String  s)
	{

	}
}

class MSystem
{
	static MPrint out = new MPrint();

}


