class  IfDemo
{
	public static void main(String[] args) 
	{

		//if�ĵ�һ�ָ�ʽ
		int x = 4;
		/*if(x>1)
		{
			System.out.println("yes");
		}*/


		//if�ĵڶ��ָ�ʽ��
		/*if(x==3)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println("over");
		*/

		//if�ĵ����ָ�ʽ
		/*
		if(x>1)
		{
			System.out.println("a");
		}
		else if(x>2)
		{
		
			System.out.println("b");
		}
		else if(x>3)
		{
			System.out.println("c");		
		}
		else
		{
			System.out.println("d");			
		}
		*/

		int y;

		if(x>1)
			y = 100;
		else
			y = 200;

		//���� = ���������ʽ)?���ʽ1�����ʽ2��

		y = (x>1)?100:200;//��Ԫ����� �� ����

		System.out.println((x>1)?100:200);

		if(x>1)
			System.out.println("a");
		else
			System.out.println("b");


		/*
		ʲôʱ��ʹ����Ԫ�������
		��if else ���ִ�����н������ʱ������ʹ�ü�д��ʽ��
		����д��ʽ���ص㣺�����϶����н�����֡�

		*/
		
	}
}
