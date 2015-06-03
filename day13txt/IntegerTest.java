/*
"23 8 100 -1 74 5"���ַ����е���ֵ�������������һ���µ��ַ�����

˼·��
1����ȡ�ַ��������е���ֵ��
2������ֵ���뵽int�����С�
3����int�����������
4�����������ַ�����

���裺
1��ʹ��String���split�������ݿո�����ַ����г��ַ������顣
2�����ַ���������int���顣
3��ͨ��ѡ�������int�����������
4��ͨ��StringBuilder��int�������ַ�����


*/
import java.util.*;

class  IntegerTest
{
	public static void main(String[] args) 
	{
//		String s = numberStringSort("23 8 100 -1 74 5");
//		System.out.println(s);

		if(args.length!=2)
		{
			System.out.println("�����������󡣳������");
			return ;
		}

		//ͨ������������ֵ����ʽ��ɻ����εĶ�����
		int row = Integer.parseInt(args[0]);
		int col = new Integer(args[1]).intValue();

		StringBuilder sb = new StringBuilder();

		for(int x=0; x<row; x++)
		{
			for(int y=0; y<col; y++)
			{
				sb.append("*");
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

	/*
	���ַ����е���ֵ��������
	*/
	public static String numberStringSort(String str)
	{
		String[] arr = getStringArray(str);//i

		int[] nums = getIntArray(arr);

		sortNums(nums);

		return toString(nums);
	}

	/*
	���ַ��������и
	*/
	private static String[] getStringArray(String str)
	{
		return str.split(" ");//
	}
	/*
	���ַ���������int���顣
	*/
	private static int[] getIntArray(String[] arr)
	{
		int[] nums = new int[arr.length];

		for(int x=0; x<arr.length; x++)
		{
			nums[x] = Integer.parseInt(arr[x]);
		
		}
		return nums;
	}
	/*
	��int�����������
	*/
	private static void sortNums(int[] arr)
	{
		Arrays.sort(arr);	
	}

	/*
	������ת���ַ�����
	*/
	private static String toString(int[] arr)
	{
		StringBuilder sb = new StringBuilder();

		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				sb.append(arr[x]+",");
			else
				sb.append(arr[x]);
		}
		return sb.toString();
	}
}