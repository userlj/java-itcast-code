import java.util.*;
/*
Arrays�������еķ������Ǿ�̬�ġ�
���ڲ��������ݵĹ����ࡣ

*/

class  ArraysDemo
{
	public static void main(String[] args) 
	{

		//�����ɼ��ϡ�
		String[] arr = {"ab","ccx","qq"};
		List<String> list = Arrays.asList(arr);


		/*
		ע�⣺
		�����ɼ���ʱ��������ʹ�ü��ϵ���ɾ������Ԫ�ؽ��в�����
		��Ϊ����ĳ����ǹ̶��ģ��ᷴ����֧�ֲ����쳣��UnsupportedOperationException
		

		����ת���ɼ��ϵ�Ŀ���ǣ�ʹ�ü��ϵ�˼��������顣
		���磺contains��indexOf��isEmpty.....
		*/
		list.add("kk");//UnsupportedOperationException
		System.out.println(list);



//		int[] arr = {3,1,5,7};
//		System.out.println(Arrays.toString(arr));
//
//		String s = arrayToString(arr);
//		System.out.println(s);

	}
	public static String arrayToString(int [] arr)
	{
		StringBuilder sb = new StringBuilder();
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				sb.append(arr[x]+", ");
			else
				sb.append(arr[x]);
		}
		return sb.toString();
	}
}
