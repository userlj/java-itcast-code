import java.io.*;



/*

�������Ļ������ɣ�


1����ȷ����Դ������Ŀ�ģ����ݻ㣩��
	��ʵ��������ȷ��Ҫʹ�������������������

2����ȷ�����������Ƿ��Ǵ��ı����ݡ�
	�����ʹ���ַ�����
	�������ʹ���ֽ�����

InputStream OutputStream Reader  Writer

Դ�豸������System.in ��Ӳ��File���ڴ档
Ŀ���豸������̨System.out��Ӳ��File���ڴ档









1,���󣺽�����¼������ݴ洢��һ���ļ��С�
	
	1����ȷԴ�豸:����¼�롣System.in.
	2����ȷĿ���豸��Ӳ���ϵ��ļ���File

	3����ȷ�����������Ƿ��Ǵ��ı����ǣ���
		ʹ���ַ�����

	����Դ������¼����ͨ��System.in��ɣ���Ϊ�������Ǵ��ı����ݣ�
		��ôӦ�����ַ�������Reader��
		System.in���ֽڶ�ȡ����Ϊ�˷��������Щ�ֽ��ı����ݡ�
		����ת�����ַ�����Ȼ��Ϊ����߲���Ч�ʣ�ʹ�����ַ���ȡ���Ļ�������

		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

	����Ŀ�ģ�ȷ�������������Ϊ���������ı����ַ������Writer.
			��Ȼ�豸��һ��Ӳ���ϵ��ļ���ʹ��FileWriiter��
			Ϊ����߲���Ч�ʡ�ʹ���ַ������������
		BufferedWriter bufw = new BufferedWriter(new FileWriter("a.txt"));
	
	��������
		����ȡ�����ַ����ݰ���ָ���ı���utf-8����ʽ��ŵ�һ���ļ��С�
		
		Ŀ�Ļ���Ӳ���ϵ��ļ��������漰���˱��롣Ҫ�õ��ַ����е�ת������
		��Ϊת������ֻ�ܽ����ֽ����������Ҫʹ�ÿ��Բ������ļ����ֽ��������FileOutputStream��
		Ϊ�����Ч�ʣ����뻺������
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt"),"utf-8"));


		

2,���󣺽�һ���ı��ļ��е����ݱ�ɴ�дչʾ�ڿ���̨�ϡ�
		Դ��һ��Ӳ���ϵ��ļ���
			�����Ǵ��ļ����ݡ�
			��ȷ��Ҫʹ��Reader��
			��Ϊ���������ļ���FileReader��
			Ϊ�����Ч�ʡ�ʹ�����ַ���ȡ���Ļ�������

		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));

		�������󣻽�ָ���ı��ļ����ݰ���ָ��������ʽ��ȡ��
			�漰���˱���ת������Ҫʹ��ת�������ֽ�ת�ַ�ʹ��InputStreamReader
			,��ת��������Ҫ�����ֽڶ�ȡ������Ҫ�����ļ�������ʹ��FileInputStream.
			Ϊ�����Ч�ʡ�ʹ�����ַ���ȡ���Ļ�������

		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt"),"UTF-8");

		
		Ŀ�ģ�����̨��System.out.
			ȷ��ʹ���������
			���������ݶ��Ǵ��ı���ʹ�á�Writer��

			����System.out��������PrintStream�����ֽ����������ô��ʱΪ��ʹ���ַ�������������ַ����㡣
			�����ֽ����������ת����ʹ��ת��������Ϊ�ַ����ֽڡ�OutputStreamWriter��
			Ϊ�����Ч�ʡ�ʹ�����ַ������������

		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));



	



*/
class  TransStreamDemo2
{
	public static void main(String[] args) throws IOException
	{

		//1,��ȡ����¼�����ݣ�һ�ж�ȡ�ܷ��㣬ʹ��readLine������
		//��Ҫ������¼����ֽ���ת�����ַ�����Ȼ����ͨ���ַ����Ļ�������readLine������ȡһ�����ݡ�
		
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(new FileInputStream("TransStreamDemo.java")));

		String line = null;

		
		//OutputStream out = System.out;//PrintStream ps = System.out;  PrintStream extends OutputStream		

		//OutputStreamWriter osw = new OutputStreamWriter(out);

		///BufferedWriter bufw = new BufferedWriter(osw);

		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("abc.txt")));
											



		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();

		}

		bufw.close();
		bufr.close();
	}
}


/*
1,���ı��ļ���ӡ�ڿ���̨�ϡ�

2��������¼������ݴ洢��һ���ļ��С�


*/