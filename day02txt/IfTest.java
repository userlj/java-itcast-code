/*

��ϰ������һ�����򣬸����Զ��������ֵ����ӡ��ֵ��Ӧ���������ڡ�


*/


class  IfTest
{
	public static void main(String[] args) 
	{

		int x = 12;

		if(x<1 || x>12)
			System.out.println(x+"�²�����");
		else if(x>=3 && x<=5)
			System.out.println(x+"���Ǵ���");
		else if(x>=6 && x<=8)
			System.out.println(x+"��������");
		else if(x>=9 && x<=11)
			System.out.println(x+"��������");
		else
			System.out.println(x+"���Ƕ���");



		/*
		if(x==3 || x==4 || x==5)
			System.out.println(x+"���Ǵ���");
		else if(x==6 || x==7 || x==8)
		*/
	}
}
