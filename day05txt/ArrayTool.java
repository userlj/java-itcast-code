/*
对象的应用。

需求：
发现对数组操作的功能很常用，而且功能很多，为了便于复用。
java中是否已提供了这样的方法呢？no。
我们可不可以自己实现这些功能并这些功能按照对象的思想都定义在一个事物中，
下回在使用功能的时候，只要找到该事物，并指挥该事物做事情就可以了。

可以是对该事物进行描述。
这就是一个数组的工具。
*/

/**
这是一个对数组操作的工具类。
@author 李四
@version V1.1

*/
public class ArrayTool
{
	
	/**
	获取最大值。
	@param arr 接收一个int型数组。
	@return 返回该数组的最大值。
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
	选择排序。
	@param arr 接收一个int型数组。
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
	打印数组
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
	/*这是一个show方法*/
	public void show(){}

	/**
	这是一个method方法。
	*/
	private void method(){}
}