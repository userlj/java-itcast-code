
/*
PrintWriter
�ַ���ӡ����
	������ʵ����ʱ���յĲ������ͣ�
	1���ַ���·����
	2��File����
		���ڽ����ַ���·����File���󣬶�����ָ���ַ���(�����)��
	3���ֽ��������OutputStream
	4���ַ��������Writer.
		���ڽ������������������ԣ����Լ�����һ�������Զ�ˢ�¡�
		���Զ�ˢ��ֻ������������Ч��println,printf,format.


�������ʹ�ô�ӡ������Ҫ�Զ�ˢ�£�����Ҫ����ת����

	PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("a.txt"),"utf-8"),true);

	�����������Ч�ʡ���Ҫʹ�ô�ӡ������
	PrintWriter out = 
		new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt"),"utf-8")),true);





PrintWriter out = response.getWriter();

out.println("<html>");
out.println("</html>");
*/

import java.io.*;
class  PrintWriterDemo
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter out = new PrintWriter(System.out,true);

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());
			//out.flush();
		}

		out.close();
		bufr.close();
	}
}
