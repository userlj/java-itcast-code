class  Bin_HexDemo
{
	public static void main(String[] args) 
	{
		String s1 = toBinary(-6);
		String s2 = toHex(-58);
		System.out.println(s1);
//		System.out.println(s2);
		

//		System.out.println("num="+Integer.toBinaryString(-6));
	}

	/**
	ʮ����-->ʮ������
	*/
	public static String toHex(int num)
	{
		return trans(num,15,4);
	}

	/**
	ʮ����-->�����ƵĲ�����
	*/
	public static String toBinary(int num)
	{
		return trans(num,1,1);
	}

	/*
	����һ������ת�����ܵĺ�����
	*/
	private static String trans(int num,int base,int offset)
	{

		if(num==0)
			return "0";

		//1�� ����һ�����ñ��д洢��16�������ڽ��Ƶ�����Ԫ�ء�
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
		//2,������ʱ���������ڴ洢����Ľ����
		char[] arr = new char[32];

		//3,����ָ�롣������ĽǱ���в�����
		int pos = arr.length;

		//4,����ѭ�������ϵĽ���&���㣬�Լ�λ�����㡣�����
		while(num!=0)
		{
			//& ��ִ�л�������ȡ�����Ϊ���еĽǱꡣ
			int temp = num & base;

			//ͨ���ýǱ��ȡ����Ԫ�ء������뵽��ʱ�����С�
			arr[--pos] = chs[temp];

			//��num����ָ��λ��λ�ơ�
			num = num >>> offset;
		}

		/*//����ʱ�������б�����ӡ��
		for(int x=pos; x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
		*/
		return arrayToString(arr,pos);

		/*
		return new String(arr,pos,arr.length-pos);
		*/
	}

	/*
	int�������ַ�����
	*/
	public static String arrayToString(char[] arr,int start)
	{

		String str = "";
		for(int x=start; x<arr.length; x++)
		{
				str+=arr[x];
		}
		return str;

	}

}


