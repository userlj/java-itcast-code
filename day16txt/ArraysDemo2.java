import java.util.*;
class  ArraysDemo2
{
	public static void main(String[] args) 
	{
		int[] arr = {3,1,4};
		
		/*
		�������е�Ԫ���Ƕ���ʱ��asList�Ὣ��Щ������Ϊ�����е�Ԫ�ش��ڡ�

		�������е�Ԫ���ǻ�����������ʱ��asList�Ὣ�������͵����������ΪԪ�ش��ڡ�
		*/
		List<int[]> list = Arrays.asList(arr);
		System.out.println(list.get(0));
	}
}
