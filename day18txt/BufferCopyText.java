/*
ͨ������������ʽ�������ı��ļ���copy��

�ַ�����
	�ַ������ڲ����ı��ļ������������������������
	FileReader
	FileWriter
	Ϊ������ַ����Ĳ�����Ч�ʡ����������������Ҫ��������������ڡ�
	BufferedReader 
		|--LineNumberReader��
	BufferedWriter

*/
import java.io.*;
class  BufferCopyText
{
	public static void main(String[] args)throws IOException 
	{
		FileReader fr = new FileReader("buf.txt");
		BufferedReader bufr = new BufferedReader(fr);

		FileWriter fw = new FileWriter("bufcopy.txt");
		BufferedWriter bufw = new BufferedWriter(fw);

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			bufw.write(line);//������д�뵽��������
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		bufr.close();
	}
}
