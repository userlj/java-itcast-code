/*
JDK1.5�����ԣ�
���Ա������

�����ԣ��������鴫�ݡ�
������һ��ע�����
�ɱ����������ڲ����б������档
*/
class  ParamDemo
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

//		int[] arr = {4,1,6};
//		showOld(arr);

//		int[] arr1 = {7,1,9,6,5};
//		showOld(arr1);
		
		show(4,1,6);//�ɱ�������Լ������������д��
		show(7,1,9,6,5);
		
	}

	public static void function(int i,int...  arr){}

	public static void show(int... arr)//...  ����ľ����������͡�
	{
		System.out.println(arr.length);
	}
	
	public static void showOld(int[] arr)
	{
		System.out.println(arr.length);
	}
}
