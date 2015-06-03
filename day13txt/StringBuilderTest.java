/*
����ͻ�����������ʹ�á�


����
ͨ������¼�����ʽ��ȡ�ַ�����
���ж��ַ����Ƿ���over������ǣ���������¼�룬���������
������ǣ���ô�ʹ�ӡ��¼�����ݵĴ�д��ʽ��


��λ�ȡ����¼���أ�
System.out:ϵͳ�����
System.in������¼�롣


Ҫ��ȡ����¼������ݡ�����Ҫ�õ�һ�����ܡ�read();
д����System.in.read();//��read�����᷵�ض��������ݡ�int.

read()��һ�ζ�һ��������һ�Σ������¶�һ����



˼·��
1��ͨ������¼��System.in.read():��ȡ¼���ÿһ���ֽ����ݡ�
2��Ҫ����ȡ�����ݱ���ַ�������Ϊֻ�б���ַ����ſ��Ե���toUpperCase()������ȡ��д��
	Ҳ�ſ����ж��Ƿ���over��
3���Ƚ�����ÿһ���ֽ���ʱ�洢������Ϊ�������ֽڣ���ô���Զ�����ֽ�������д洢��
4�����ֽ��������ַ���������ת�������жϡ�

Сϸ�ڣ�
window�У��س������������ַ�����ʾ�ġ�\r\n




���ָó���һЩ�����ԣ��������¼����ֽڸ�������������ĳ��ȣ��ͻᶪʧ���ݡ�����Ǳ�Խ�硣

Ϊ�˽��������⣬���ǿ��Ի�һ����������ɣ�StringBuilder���ɱ䳤�ȵ�������

ע��һ�㣺���ǶԻ�����������ա�

Ҫ����������������еĹ���Ҫ���������Ҫ��д��




*/

class StringBuilderTest 
{
	public static void main(String[] args) throws Exception
	{
		//readInByArray2();
		readInByBuffer();
		
	}

	public static void readInByBuffer() throws Exception
	{
		//�ȶ���һ����������������Ŷ������ֽ����ݡ�
		StringBuilder sb = new StringBuilder();
		
		while(true)
		{
			int ch = System.in.read();
			if(ch=='\r')
				continue;
			if(ch=='\n')
			{
				//���������е����ݱ���ַ�����
				String s = sb.toString();
				if("over".equals(s))
					break;
				System.out.println("upper:"+s.toUpperCase());
				sb.delete(0,sb.length());
			}
			else
				sb.append((char)ch);
		}
	}


	/*
	��ȡ����¼�룬ʹ��������Ϊ��ʱ������
	*/
	public static void readInByArray()throws Exception
	{
		//System.out.println((int)'\r'+",,,"+(int)'\n');
		//����һ����ʱ���������ڴ洢ÿһ���ֽڡ�
		byte[] arr = new byte[200];
		int pos = 0;
		
		while(true)
		{
			//��ȡ����¼����ֽ�
			int ch = System.in.read();
			
			if(ch=='\r')
				continue;
			if(ch=='\n')//�ж��Ƿ��н�β��
			{
				//�������д�����ֽ����ݱ���ַ�������over���жϡ�
				String s = new String(arr,0,pos);
				if("over".equals(s))
					break;
				System.out.println(s.toUpperCase());
				pos = 0;
			}
			else
			{
				arr[pos++] = (byte)ch;
			}
		}
		/*
		*/
	}
	/*
	ʹ��switch�����ʽ��
	*/
	public static void readInByArray2()throws Exception
	{
		//System.out.println((int)'\r'+",,,"+(int)'\n');
		//����һ����ʱ���������ڴ洢ÿһ���ֽڡ�
		byte[] arr = new byte[200];
		int pos = 0;
		
		
		//��Ϊ�Ƕ����޵ļ���ֵ�����жϣ����Կ���ѡ����switch�������ɡ�
		while(true)
		{
			//��ȡ����¼����ֽ�
			int ch = System.in.read();
			
			switch(ch)
			{
				case '\r':
					break;
				case '\n':
					String s = new String(arr,0,pos);
					if("over".equals(s))
						return ;
					System.out.println(s.toUpperCase()+"....");
					pos = 0;
					break;
				default:
					arr[pos++] = (byte)ch;
			}


		}
		/**/
	}
}



