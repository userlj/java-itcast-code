/*
�����Ӧ�á�

����
���ֶ���������Ĺ��ܺܳ��ã����ҹ��ܺܶ࣬Ϊ�˱��ڸ��á�
java���Ƿ����ṩ�������ķ����أ�no��
���ǿɲ������Լ�ʵ����Щ���ܲ���Щ���ܰ��ն����˼�붼������һ�������У�
�»���ʹ�ù��ܵ�ʱ��ֻҪ�ҵ��������ָ�Ӹ�����������Ϳ����ˡ�

�����ǶԸ��������������
�����һ������Ĺ��ߡ�
*/

/**
����һ������������Ĺ����ࡣ
@author ����
@version V1.1

*/
public class ArrayTool
{
	
	/**
	��ȡ���ֵ��
	@param arr ����һ��int�����顣
	@return ���ظ���������ֵ��
	*/
	public  int getMax(int[] arr)
	{
		int max = arr[0];
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>max)
				max = arr[x];
		}
		return max;
	}

	/**
	ѡ������
	@param arr ����һ��int�����顣
	*/
	public  void sort(int [] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}

	/**
	��ӡ����
	*/
	public void printArray(int[] arr)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]);
		}
	}
	/*����һ��show����*/
	public void show(){}

	/**
	����һ��method������
	*/
	private void method(){}
}