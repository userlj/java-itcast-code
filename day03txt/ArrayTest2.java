import java.util.*;
class  ArrayTest2
{
	public static void main(String[] args) 
	{
		int[] arr = {4,1,2,6,5,7,3};
		printArray(arr);
		//selectSort(arr);
		//bubbleSort(arr);
		Arrays.sort(arr);//����java�ṩ�����򷽷�������ʱ������㡣
		printArray(arr);

		
	}

	/*
	ð������:
	�ص㣺��������Ԫ�ؽ��бȽϣ���ѭ������һ�Σ�����������λ������ֵ��
	-x:���ϼ��ٲ��������Ԫ�ظ�����
	-1:����Ǳ�Խ�硣
	*/

	public static void bubbleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=0;y<arr.length-x-1; y++)
			{
				if(arr[y]>arr[y+1])
				{
					/*
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
					swap(arr,y,y+1);
				}
			}
		}
	}

	/*
	����ѡ������
	�ص㣺
	��ѭ������һ�Σ�����0�Ǳ�λ������ֵ��
	*/
	
	public static void selectSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					/*
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					*/
					swap(arr,x,y);
				}
			}
		}
	}

	/*
	���������Ԫ�ؽ��л�λ�Ĳ�����
	*/
	public static void swap(int[] arr,int x,int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
		
	/*
	��ӡ����Ԫ�ء�
	*/
	public static void printArray(int[] arr)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",,,");
			else
				System.out.println(arr[x]);
		}
	}
}
