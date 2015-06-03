/*
ת������

InputStreamReader:���ֽ�ת���ַ���
OutputStreamWriter�����ַ�ת���ֽڡ�

�ص㣺��������ָ�������


*/

import java.io.*;

class  TransStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		//�ֽڶ�ȡ����(System.inĬ���Ǽ����豸��)
		//InputStream in = System.in;

		//��Ҫʹ��readLine��������ȡ����¼��һ�С�
		//���÷�����BufferedReader���з�����
		//�����BufferedReader��readLine�������Բ�������¼����ֽ�������?
		//��ô���Խ��ֽ�ת���ַ����Ϳ���ʹ�ø÷�����
		//��ʱ��Ҫ�õ���ת������
		//InputStreamReader isr = new InputStreamReader(in);
		


		//BufferedReader bufr = new BufferedReader(isr);

		//���ݴ���ϲ������ݴ��롣������Ҫ��ס��ֻҪһ�ᵽ����¼�룬��Ҫʹ�øô��롣

		BufferedReader bufr = 
			new BufferedReader(new InputStreamReader(System.in));




		//�ڼ���¼��ʱ��ͨ����Ҫ�Զ���һ�½�����ǡ�

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			System.out.println(line.toUpperCase());
		}

		bufr.close();


	}

	/*
	��ȡ����¼���һ�����ݣ��������жϣ������over�����������
	���򣬴�ӡһ�����ݵĴ�д��ʽ��
	���ִ����readLine������ԭ������ƣ�
	��Ȼio�����������ķ������ɲ���ֱ��ʹ���أ�

	*/
	public static void readIn()throws IOException
	{
		StringBuilder sb = new StringBuilder();

		while(true)
		{
			int ch = System.in.read();
			if(ch=='\r')
				continue;
			if(ch=='\n')
			{
				String s = sb.toString();
				if("over".equals(s))
					return ;
				System.out.println(s.toUpperCase());
				sb.delete(0,sb.length());
			}
			else
				sb.append((char)ch);
		}
	}
}

