/*

���飺
ʲôʱ��ʹ�����飺
��Ԫ�ؽ϶�ʱ��Ϊ�˷��������ЩԪ�أ����Ƚ�����ʱ�洢��
��ʹ�õ������������顣

�ô���
���Զ�Ԫ�ؽ��б�ţ����������

�ص㣺
�����ǹ̶����ȵġ�

*/

class  ArrayDemo
{
	public static void main(String[] args)
	{

		int[] x = new int[3];

		//System.out.println(x.length);

		//int[] y = x;//x �� y �����������͵ı�����ͬʱָ����ͬһ������ʵ�塣
		//x = null;



		//ArrayIndexOutOfBoundsException: 3����Ǳ�Խ���쳣��
		//�����ʵ������в����ڵĽǱ�ʱ���ͻᷢ�����쳣��

		/*
		NullPointerException:��ָ���쳣��
		�������ͱ���Ϊnull�����ڲ���ʵ��ʱ���ͻᷢ����

		*/


		//����ĵ�һ������������������
		for(int a=0; a<x.length; a++)
		{
			System.out.println("x["+a+"] = "+x[a]+" ;");//x[0] = 0;
		}


		//�������һ�ֶ�����ʽ��
		int[] arr = {3,1,6,9};
		int[] arr1 = new int[]{3,1,6,9};

		for(int a=0; a<arr.length; a++)
		{
			System.out.println("arr["+a+"] = "+arr[a]+" ;");//x[0] = 0;
		}


	}
}
