/*
��������Ϊ���������Ч�ʶ����ڵġ�

Ҳ���ǻ������ڽ���ʱ����ʼ�������б���Ҫ����������

��ʾ�ַ�����д�뻺������

1������д��������
2���������������󣬲���д����������Ϊ�������ݸ������������캯����
3��ʹ�û������ķ����������ݡ�
4���رջ�������

ǿ������ʹ�û�����ʱ��һ��Ҫ�ǵ�ʹ��flushˢ�¡�

*/
import java.io.*;
class  BufferedWriterDemo
{
	public static void main(String[] args)throws IOException 
	{
		FileWriter fw = new FileWriter("buf.txt");

		BufferedWriter bufw = new BufferedWriter(fw);

		for(int x=0; x<4; x++)
		{
			bufw.write("abcd"+x);
			bufw.newLine();
			bufw.flush();
		}

		bufw.close();
	}
}
