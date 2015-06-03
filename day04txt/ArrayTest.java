
/*
������Ϊ������Ӧ�ã�
��һ������˼�룺ָ��˼�롣


*/
class  ArrayTest
{

	/*
	��ӡ����Ĺ���
	*/
	public static void daYin(int[] arr,int start)
	{
		for(int x=start; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]);
		}
	}
	public static void main(String[] args) 
	{
		//toBin(6);
//		toHex2(58);

		toBin2(-6);
	}

	/*
	ʮ����-->�����ơ�
	*/

	public static void toBin(int num)
	{
		int[] arr = new int[32];
		int pos = arr.length;
		while(num>0)
		{
			arr[--pos] = num%2;
			num = num /2;
		}
		System.out.println("pos="+pos);
		daYin(arr,pos);
	}

	/*
	ʮ����-->ʮ�����ơ�
	��16����16������ʮ��ʮ������֮���ת����ʽ�����������鷳��
	
	���֣������Ƶ�ÿ��λ����һ����ʮ������λ��
	���Բ��ϻ�ȡÿ��λ���Ӷ��Ϳ��Ի�ȡʮ�����Ʊ�����ʽ��
	*/
	public static void toHex(int num)
	{
		
		char[] arr = new char[8];
		int pos = arr.length;

		for(int x=0; x<8; x++)
		{
			int temp = num & 15;
			if(temp>9)
				//System.out.print((char)(temp-10+'A')+",");
				arr[--pos] = (char)(temp-10+'A');
			else
				//System.out.print(temp+",");
				arr[--pos] = (char)(temp+'0');

			num = num >>> 4;
		}

		for(int x=pos;x<arr.length; x++)
		{
			System.out.print(arr[x]+"...");
		}
	}
	/*
	�����
	���ֹ��ɡ�
	ÿ��&15��ֵ����������Ϊ�Ǳ�ȥ��ʮ�����Ʊ���Ԫ�ء�

	*/

	public static void toHex2(int num)
	{
		//����һ��ʮ������Ԫ�ر�
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		//��ʱ����������ÿ�β���Ľ����
		char[] arr = new char[8];

		int pos = arr.length;

		while(num!=0)
		{
			int temp = num & 15;

			arr[--pos] = chs[temp];
			
			num = num >>> 4;
		}
		for(int x=pos;x<arr.length; x++)
		{
			System.out.print(arr[x]+",");
		}
	}
	/*
	ͨ��������ʮ����--�����ơ�
	*/
	public static void toBin2(int num)
	{

		if(num==0)
		{
			System.out.println("0");
			return ;
		}
		char[] chs = {'0','1'};

		char[] arr = new char[32];

		int pos = arr.length;

		while(num!=0)
		{
			int temp = num & 1;
			arr[--pos] = chs[temp];

			num = num >>> 1;
		}

		for(int x=pos;x<arr.length; x++)
		{
			System.out.print(arr[x]+" ");
		}
	}
	
}









/*

1����ȡ����ĸ�������λ����Ӧ��ʮ������Ԫ�ء� 6

{0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f};


  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,1,0,1,1,0
 &0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1 =15.
 ------------------------------------------------------------------
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0 ==6

2����ȡ���ĸ�������λ����Ԫ�����ݽ����޷�������(��Ϊ�и����������)��λ����ʱ�ͽ���һ����λ��Ϊ�����λ��

 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,1,0,1,1,0
&0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1
 ------------------------------------------------------------------
 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1 ==  13    -10=3+'a' = (char)100 > d   -->  d   a=10  b=10+1






0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0


*/