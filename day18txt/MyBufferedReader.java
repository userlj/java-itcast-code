import  java.io.*;


/*
Reader
	|--FileReader
	|--BufferedReader

֮����û����MyBufferedReader�̳�Reader��
����ΪReader���г��󷽷�����ʦ����ȥ��д��

��ʵӦ������Ҫ�̳еġ�
��Ϊװ����ͱ�װ�������Ƕ�������ͬ�Ĺ��ܣ���������ͬһ��������߽ӿڡ�


*/
class MyBufferedReader //extends Reader
{
	private Reader r;
	MyBufferedReader(Reader r)
	{
		this.r = r;
	}

	/*
	1,ͨ��FileReader��read������һ�ζ�һ���ַ���
	2�������ַ�������ʱ�洢��������Ϊ�˷��㣬ѡ��StringBuilder��
	3���Զ����ַ������жϣ�����ǻس������ͽ�StringBuilder�Ѵ洢���ַ�����ַ������ء�
	*/
	public String myReadLine()throws IOException
	{
		//1,������ʱ�洢StringBuilder��
		StringBuilder sb = new StringBuilder();

		//2,ʹ��FileReader��read����һ�ζ�һ���ַ�����Ҫѭ����ȡ��
		int ch = 0;

		while((ch=r.read())!=-1)
		{
			if(ch=='\r')
				continue;
			if(ch=='\n')
			{
				return sb.toString();
			}
			else
				sb.append((char)ch);
		}

		if(sb.length()!=0)
			return sb.toString();

		return null;
	}

	public void myClose()throws IOException
	{
		r.close();
	}
}