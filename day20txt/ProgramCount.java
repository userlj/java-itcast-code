/*
��ϰ����¼һ���������еĴ�����������ָ������ʱ���ó���Ͳ������ڼ��������ˡ�
	  ͨ�����������ʹ�ô������޶���

˼·��
1����Ҫ�����������
	���ǳ����������Ժ󣬳�������ڴ��б������
	��ô�´������У��������ͻ�ԭ��
	��βſ��Լ�¼סÿһ�μ������ı仯�أ�
	��ô���Խ��ü������ı仯�־û��洢һ�¡�
	���ʱ��Ϊ����ȷ�����ֵ���ص㣬���Ը���ֵ������ơ�
	��������� ����=ֵ ����ʽ�����Ǽ�ֵ�ԡ�
	
2���ļ��е�����Ҫ��ȡ�ͱ���Ҫʹ��������

3��Ҫ������ֵ��Ҫʹ��Map���ϡ�

4�����Ժ������ϵ�map���Ͼ���Properties��

5��ͨ��Properties���ϵ�load�����������ݽ��м��ء�

6�������ݽ����޸ĺ����´洢��

7��Ҳ���ǣ����ÿһ��������ʱ����Ҫ�ȶ�ȡ�������ļ����Ի�ȡ�Ĵ��������жϣ�
	��������������˳������򣬾ͶԸô������������´洢��


*/
import java.io.*;
import java.util.*;
class  ProgramCount
{
	public static void main(String[] args) throws IOException
	{
		int count = 0;
		Properties prop = new Properties();


		/*
		��Ϊ��һ������ʱ�����ļ��ǲ����ڵġ�
		���Իᷢ��FileNotFoundException�쳣��

		��ʹ������ļ������ļ���һ��Ҳû�ж�Ӧ ����
		
		���ԣ������������һ�¡�

		�Ը��쳣���д���
		�ڴ�������и�����ָ���ü���ֵ��
		*/
		
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("time.ini");			
			prop.load(fis);
		}
		catch (FileNotFoundException e)
		{
			//�ļ���Ȼ�����ڣ����ǿ����ȸ����Ͻ��м�ֵ�ԵĶ��壬
			//�Ա��������ȡָ����ֵ���㡣
			prop.setProperty("cishu",count+"");
		}


		String value = prop.getProperty("cishu");
		count = Integer.parseInt(value);

		if(count==5)
		{
			System.out.println("���ô����ѵ�����Ǯ��");
			//return ;
			System.exit(0);
		}
		count++;
		prop.setProperty("cishu",count+"");

		FileOutputStream fos = new FileOutputStream("time.ini");

		prop.store(fos,"");


		fos.close();
		if(fis!=null)
			fis.close();


	}

	public static void method()throws IOException
	{
		int count = 0;
		//1,����һ��Properties���ϡ�
		Properties prop = new Properties();

		//2,�����ȡ�������ָ���ļ��������
		FileInputStream fis = new FileInputStream("time.ini");

		//3,ͨ��Properties���ϵ�load���������ݼ��ؽ����ϡ�
		prop.load(fis);

		//4,ȡ��ָ��������Ӧ��ֵ��
		String value = prop.getProperty("cishu");

		//5,��ֵ����������
		count = Integer.parseInt(value);
		count++;
		//6,���������count�������´洢��
		prop.setProperty("cishu",count+"");

		//7,�������е����ݳ־û��洢��time.ini�ļ��С�
		FileOutputStream fos = new FileOutputStream("time.ini");

		prop.store(fos,"");


		//8,�ر���Դ��
		fos.close();
		fis.close();

	}
}

