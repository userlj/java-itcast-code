
/*
�Զ���һ���ֽ����Ļ�������


*/
import java.io.*;
class MyBufferedInputStream
{
	private InputStream in;

	private byte[] buf = new byte[1024];
	private int pos = 0,count =0;


	MyBufferedInputStream(InputStream in)
	{
		this.in = in;
	}
	/*
	��ȡһ���ֽڡ�


	�ʣ�Ϊʲô�ֽ�����read��������һ����ȡ�ֽڣ�����ֵ����ȷʵint�����أ�
	��Ϊ�����ļ������У����׳�������8��������1���������8��������1�Ǹ���-1.
	�����-1���ֺ�read�����Ķ��������ı�ʾ��ͬ��

	��ô���ֶ�ȡ���ݹ����У���ǰֹͣ�������

	���ԶԶ������ֽ����ݽ�����������ͨ������ԭ�ֽ����ݣ�������λ��0�ķ�ʽ�����⸺���ĳ��֡���

	b&255  ����  b&0xff


	��write����Ҳ����һ��int�����ݣ�����ֻд���int�����һ��8λ��Ҳ����ֻдһ���ֽڡ�


	��˵������read�������ֽ����ݽ���������������ǰ��ֹ��
			write��ǿ��ת����
	*/
	public int myRead()throws IOException
	{
		//1,��countΪ0ʱ��ͨ�������󷽷���ȡ���ݲ����� ��������(byte����)�С�
		if(count==0)
		{
			count = in.read(buf);
			if(count<0)
				return -1;
			pos = 0;
			byte b = buf[pos];
			pos++;
			count--;
			return b&255;
		}
		else if(count>0)
		{
			byte  b = buf[pos];
			pos++;
			count--;
			return b&0xff;
		}
		return -1;
	}

	public void myClose()throws IOException
	{
		in.close();
	}

}
/*

11111111   111111111111111111




00000001  -1 :ȡ����+1
ȡ����11111110
��+1��11111111

byte b = -1; b & 255 = 

int x = b;

byte : -1  11111111
int����-1  11111111 11111111 11111111 11111111
00000000 00000000 00000000 11111111 = 255

*/
