import java.io.*;


/*
DataInputStream
DataOutputStream

IO�����ר�����ڲ������������������ݵĶ���

readInt

writeInt


���ڲ���UTF���ݡ�
����������ʹ�õ���utf-8�޸ĵ����
���Ըö���д��������ʹ�ó�����utf-8����ǽ����������ġ�
ֻ��ʹ�ö����readUTF�ſ��Ի�ȡ��

Ҳ����������������ͨ���ɶ�ʹ�á�

����Ҳ�ǶԻ������������ǿ��


*/


class  DataStream
{
	public static void main(String[] args) throws IOException
	{
		
		//writeData();
		//readData();

		//writeUTF();

		readUTF();
	}

	public static void readUTF()throws IOException
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("utf.txt"));

		String str = dis.readUTF();

		System.out.println("str="+str);

		dis.close();
	}

	public static void writeUTF()throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("utf.txt"));

		dos.writeUTF("���");

		dos.close();
	}

	public static void readData() throws IOException
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

		int num = dis.readInt();

		System.out.println("num="+num);

		boolean b = dis.readBoolean();
		System.out.println("b="+b);

		dis.close();
	}

	public static void writeData()throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

		dos.writeInt(1234);

		dos.writeBoolean(false);

		dos.close();
	}
}
