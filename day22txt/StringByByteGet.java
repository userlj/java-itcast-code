/*


ab���cллde
Ҫ���ǣ�����ָ�����ֽ�����ȡ�ַ���������ص��˰������������

*/

class StringByByteGet 
{
	public static void main(String[] args) 
	{
		String s = getByByte("ab���cллde",9);
		System.out.println(s);
	}

	public static String getByByte(String str,int len)
	{
		byte[] arr = str.getBytes();
		int count = 0;
		for(int x = len-1; x>=0; x--)
		{
			if(arr[x]<0)
				count++;
			else
				break;

		}

		if(count%2==0)
			return new String(arr,0,len);
		else
			return new String(arr,0,len-1);
	}
}
