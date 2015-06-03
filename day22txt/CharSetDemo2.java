/*
String���漰�ı���ķ�����
1�����캯����String(byte[]):���롣
2��byte[] getBytes():���롣

�ַ���--->�ֽ����� �����롣
�ֽ�����--->�ַ��� �����롣

��java���ַ���Ĭ�Ͼ���GBK.

*/


class CharSetDemo2 
{
	public static void main(String[] args) throws Exception
	{
		demoEncoding1();
	}
	public static void demoEncoding1()throws Exception
	{
		String s = "���";
		//ʹ��gbk�����ַ����ı���
		byte[] bys = s.getBytes("gbk");

		//����ʱ��ʹ���˴�������iso8859-1.
		String s1 = new String(bys,"ISO8859-1");

		System.out.println("s1="+s1);

		//�ѳ������룬��ô�����
		
		//1,��������°��ս��������һ�Σ�Ϊ�˻�ȡԭ�ֽ����֡�
		byte[] bys1 = s1.getBytes("iso8859-1");

		//2,��ԭ�ֽ����֣�����ָ���������롣
		String s2 = new String(bys1,"gbk");

		System.out.println("s2="+s2);

	}

	public static void demoEncoding()throws Exception
	{
		String s = "���";

		byte[] bys = s.getBytes("UTF-8");

		//showBys(bys);

		String s1 = new String(bys,"utf-8");

		System.out.println("s1="+s1);
	}

	public static void showBys(byte[] by)
	{
		for(byte b : by)
		{
			System.out.print(Integer.toHexString(b)+"..");
		}
	}
}
