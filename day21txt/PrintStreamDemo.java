/*
PrintStream.

�ֽڴ�ӡ��
	��ʼ��ʱ�����Խ����������ݡ�
	1��File����
	2���ַ���·����
	3���ֽ��������


print(int):print��һ��������4���ֽڽ��д�ӡ��
write(int):��һ�����������8λд�룬Ҳ�����ڲ���ǿ�ƶ�����

*/
import java.io.*;
class  PrintStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("c:\\ps.txt");
		//�ڶ�����ʱ��һ���ᴴ��һ��Ŀ�ĵ��ļ���
//		PrintStream ps = new PrintStream(f);

		//��Ŀ�ĸĳ��˿���̨��
//		PrintStream ps = new PrintStream(System.out);


		ps.println("haha");
		ps.println("heihei");
		ps.close();
	}
}
