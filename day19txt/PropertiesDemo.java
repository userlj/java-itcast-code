/*
Map
	|--Hashtable
		|--Properties

�ü����еļ�ֵ�Զ����ַ�����

�ü��Ͽ��Խ��豸�ϵ�ָ����ʽ��Ϣ�洢�����ϣ������Խ������е���Ϣ���г־û��洢��
ͨ�����ڶԼ�ֵ����ʽ�������ļ����в������൱���á�����

*/
import java.util.*;
import java.io.*;
class PropertiesDemo 
{
	public static void main(String[] args) throws IOException
	{
		//sysPropList();
		//loadFile();
		myLoad();
	}
	/*
	��Ӳ�����ļ��ļ�ֵ��������Ϣֱ�Ӵ洢�������С�

	*/
	public static void loadFile()throws IOException
	{
		//1,����һ������������ļ��϶���Properties��
		Properties prop = new Properties();
		System.out.println(prop.size());

		FileInputStream fis = new FileInputStream("user.txt");

		//3,ʹ��Properties ���ϵ�load�������������ݴ洢�������С�

		prop.load(fis);

		//�������еļ���Ӧ��ֵ�������޸ġ�
		prop.setProperty("wangwu","20");


		//���޸ĺ���������´��뵽ԭ�ļ��С�
		FileOutputStream fos  = new FileOutputStream("user.txt");

		prop.store(fos,"haha");

		System.out.println(prop);
		fos.close();
		fis.close();

	}


	public static void sysPropList()throws IOException
	{
		Properties prop =System.getProperties();
		
//		prop.list(System.out);// Ŀ���ǿ���̨��
		//�����ǣ���jvm��������Ϣ�洢��һ���ļ��С�
		prop.list(new PrintStream("jvm.ini"));
	}

	public static void sysProp()
	{
		Properties prop =System.getProperties();

		Set<String> keys = prop.stringPropertyNames();

		for(String key : keys)
		{
			System.out.println(key+":"+prop.getProperty(key));
		}
	}

	/*
	load��������ԭ��
	��ʵ����ͨ������ȡָ���ı�������Ϣ��
	��������һ�е�������Ϊ�ַ������� �Ⱥ� ���и
	�����и����ַ��������е�Ԫ����Ϊ��ֵ����Properties���ϡ�

	*/
	public static void myLoad()throws IOException
	{
		BufferedReader bufr = new BufferedReader(new FileReader("user.txt"));

		String line = null;

		Properties prop = new Properties();

		while((line=bufr.readLine())!=null)
		{
			String[] arr = line.split("=");
			prop.setProperty(arr[0],arr[1]);


		}
		bufr.close();
		System.out.println(prop);
	}
}
