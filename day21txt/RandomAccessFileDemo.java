import java.io.*;

/*
RandomAccessFile

1���ö���ֻ���ڲ����ļ���
2��ͨ�����캯����ģʽ����ָ��Ҫ���ж���r������д(rw)��
3����������ڲ���װ���ֽ�����������������ͬʱ��װ��һ�����ӳ����ֽ����黺������
4���ڲ���ָ���������û������е����ݡ�
5���ö�������ֱ�Ӳ������������������ݵķ�������writeInt����readInt��




ע�⣺RandomAccessFile��ģʽΪrwʱ�������ļ���������ļ������ڣ��ᴴ�����ڽ���д�����ݵĲ�����
	����ļ��Ѵ��ڣ���ô���ڸ��ļ�����ԭ���ݵĲ�����
	���Զ����е����ݽ����޸ġ�

ͨ��seek()����ָ������Ҫ����������λ�ã������λ�����������ݣ���ô�������ݱ����ǵĲ�����
���ֹ��ܣ������ڶ����ݵ��޸ġ�

һ��Ӧ�ã����߳����ء�

����߳�ͬʱ��һ���ļ�д������ʱ��ֻҪÿһ���̸߳�������ݶβ�ͬ���Ͳ���������ݴ��������
���ҿ������Ч�ʡ�

����ע��:Ҫʹ�øö�����Ҫ��ȷ���ݶ����й���ġ�


*/

class  RandomAccessFileDemo
{
	public static void main(String[] args) throws IOException
	{
		//ͨ�����ཫһЩ������������Ϣд�뵽�ļ��С�


		File file = new File("info.txt");
		
//		randomWrite(file);

//		randomRead(file);
		randomWrite2(file);

	}



	/*
	ͨ��RandomAccessFile������ļ��Ĵ�������д�����ݡ�����+���䡣

	
	*/
	public static void randomWrite(File file)throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile(file,"rw");

		raf.write("����".getBytes());
		raf.writeInt(97);	
		raf.write("����".getBytes());
		raf.writeInt(98);	
		raf.write("����".getBytes());
		raf.writeInt(99);	
		
		raf.close();
	}

	/*
	��ȡ������
	*/
	public static void randomRead(File file)throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile(file,"r");
		//raf.write(3);//�ܾ�����

		//raf.seek(8*2);// �������е�ָ������Զ���ָ�����Ϳ��Ի�ȡִ�е�������Ϣ��

		raf.skipBytes(8*2);//ָ���������ֽ�����

		raf.seek(8);

		byte[] buf = new byte[4];
		raf.read(buf);
		String name = new String(buf);
		int age = raf.readInt();
		System.out.println(name+"::"+age);

		raf.close();


	}

	/*
	�޸��������ݡ�
	*/
	public static void randomWrite2(File file)throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile(file,"rw");

		raf.seek(8*1);
		raf.write("����".getBytes());
		raf.writeInt(65);	
		
		
		raf.close();
	}

}
