
/*
Math:
�����еķ������Ǿ�̬��

ceil();
floor();
round():
pow():
random():��ȡ�������Ҳ����ʹ��java.util.Random������ɡ�


��ϰ��������������������Ļ�ȡ��

*/

import java.util.*;
class  MathDemo
{
	public static void main(String[] args) 
	{
//		System.out.println(Math.ceil(-12.3));
//		System.out.println(Math.floor(12.3));
//		System.out.println(Math.pow(10,3));//10��3�η���
		

		Random r = new Random();

		for(int x=0; x<10; x++)
		{
			//double d = Math.random()*6+1;

			//System.out.println((int)d);

			int num = r.nextInt(6)+1;
			System.out.println("num="+num);
		}
	}
}
