class  SearchArray
{
	public static void main(String[] args) 
	{
		/*int[] arr = {4,1,3,2,7};
		
		int index = getIndex(arr,3);
		if(index==-1)
			System.out.println("��Ԫ�ز�����");
		else
			System.out.println("��Ԫ�صĽǱ��ǣ�"+index);
			*/

		int[] arr = {1,3,4,5,7,9,10};

		int index = halfSearch2(arr,4);
		System.out.println("index="+index);
	}

	public static int halfSearch2(int[] arr,int key)
	{
		int max,min,mid;//���Ƕ�������������¼��ͷβ���м�Ǳ�ֵ��
		min = 0;
		max = arr.length-1;

		while(min<=max)
		{
			mid = (max+min)/2;
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return -1;
	}

	/*
	�۰���ҡ������Ƕ������������в��ҡ�
	*/

	public static int halfSearch(int[] arr,int key)
	{
		int max,min,mid;
		min = 0;
		max = arr.length-1;
		mid = (max+min)/2;

		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;
			//System.out.println("max="+max+",min="+min);
			if(min>max)
				return -1;
			mid = (max+min)/2;
		}
		return mid;
	}

	/*
	�������е�Ԫ�ؽ��в��ң���ȡ��Ԫ�ص�һ���������г��ֵ�λ�á�
	*/
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]==key)
			{
				return x;
			}
		}
		return -1;
	}
}
