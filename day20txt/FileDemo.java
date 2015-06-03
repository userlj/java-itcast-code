import java.io.*;
/*
ͨ�������������ѧϰ��

�������������豸�ϵ����ݵġ�

�����Ҫ�������ڵ��ļ����в�����
�����жϸ��ļ��Ƿ���ڡ����߽��ļ�ɾ���Ȳ�����

Ϊ�˲����ļ������ļ��С�

io�����ṩ��һ��File����
File�����������ļ�ϵͳ�е��ļ��Լ��ļ��С����ļ������ļ��з�װ���˶���



*/

import java.io.*;
import java.util.*;
class FileDemo 
{
	public static void main(String[] args) throws IOException
	{
		method_5();
	}

	//��ʾFile��Ĺ��캯����
	public static void method_1()
	{
		//�ڽ���File�����ʼ��ʱ�����Խ����е��ļ������ļ��з�װ�ɶ���
		//Ҳ���Խ������ڵ��ļ������ļ��з�װ�ɶ���

		File file = new File("c:\\haha.txt");


		//��c:\\a.txt�ļ���װ���˶���
		File f = new File("c:\\a.txt");

		//ͨ������������ɡ�
		File f1 = new File("c:\\","a.txt");

		File f2 = new File("c:\\");

		File f3 = new File(f2,"a.txt");

		
		//���κ�ϵͳƽ̨�¶���Ŀ¼�ָ������Զ����ȡ��ϵͳ�ķָ�����
		File f4 = new File("c:"+File.separator+"abc"+File.separator+"a.txt");


	}


	public static void method_2()throws IOException
	{
		File file = new File("c:\\demo.txt");

		//��ʾcreateNewFile():��ָ��Ϊλ�ô����ļ���������ļ��Ѿ����ڣ� ���ᴴ����
		boolean b = file.createNewFile();
		System.out.println("create:"+b);
		
		

		//file.deleteOnExit();//����jvm����jvm�˳�ʱ�������ļ�ɾ����//�����Ƿ����쳣�������������



		//��ʾdelete();����ɾ���ļ������ļ��У��������true��ɾ���ɹ���ע�⣺���߻���վ��
		//boolean b1 = file.delete();
		//System.out.println("delete:"+b1);

		//��ʾexists();�ж��ļ������ļ����Ƿ���ڡ�
		boolean b2 = file.exists();
		System.out.println("exists:"+b2);


	}

	public static void method_3()
	{
		File file = new File("time.ini");

		//1��ȡȥ�ļ������ļ��е����ơ�
		String name = file.getName();
		System.out.println("name="+name);

		//2,��ȡ�ļ������ļ��еĸ�Ŀ¼��
		String parent = file.getParent();
		System.out.println("parent="+parent);

		//3,��ȡ�ļ��ľ���·����
		String absPath = file.getAbsolutePath();
		System.out.println("absPath="+absPath);
		

		//4,��ȡ�ļ������·����
		String path = file.getPath();
		System.out.println("path="+path);



		/*
		���ۣ����file�����з�װ��·����һ������·����
		����File���з�װ���ļ������ļ��������·�����Ǿ���·����
		getAbsolutePath():���صĶ��Ǿ���·����
		getPath():���ص���File�����з�װ��·����
		
		getParent();�����װ�������·�����÷�������null��
		*/
		
	}

	public static void method_4()
	{
		File file = new File("c:\\c.txt");

		boolean b = file.isFile();

		System.out.println("file:"+b);

		boolean b1 = file.isDirectory();
		System.out.println("directory:"+b1);


		//isHidden():�ж��ļ������ļ����Ƿ������ء�ͨ��ϵͳ�ļ��������صġ������ڻ�ȡ�ļ�ʱ��������Ҫ��ȡ���صġ�



		/*
		ע�⣺�ڽ����ļ������ļ����ж�ʱ������Ҫ���жϸ��ļ������ļ����Ƿ���ڡ�

		if(file.exists())
		{
			 if( file.isFile())
		}
		*/


		File dir = new File("c:\\kk\\a\\c\\d\\x\\s\\a\\w\\e\\t");
		//dir.mkdir();//�����ļ��С�
		dir.mkdirs();//�����༶Ŀ¼��

		File f1 = new File("c:\\haha.txt");
		File f = new File("d:\\demo.txt");
		boolean b2 = f1.renameTo(f);

		System.out.println("rename:"+b2);

		//renameTo��������ͬһĿ¼��������ɶ��ļ������������ڲ�ͬĿ¼�£�������ɶ��ļ��ƶ���

	}

	public static void method_5()
	{
		File[] roots = File.listRoots();//�г����������̷���

		for(File root : roots)
		{
			//System.out.println(root);
		}

		
		//��ʾlist������
		File dir = new File("c:\\");

		String[] names = dir.list();//�г�ָ��Ŀ¼�µ�ǰ���ļ����Լ��ļ������ơ�
		for(String name : names)
		{
			//System.out.println(name);
		}

		File file = new File("c:\\");

		//System.out.println(file.getAbsolutePath());

		String[] javas = file.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{

				//System.out.println(dir+"--"+name);
				/*
				if(name.endsWith(".java"))
					return true;
				return false;
				*/
				File f = new File(dir,name);
				//System.out.println(f.getAbsolutePath()+"..."+f.isFile());
				return f.isFile() && name.endsWith(".java");
			}
		});
	

		/*
		������:
		����ָ����������ȡ���ݡ���ʵ�������Զ�����accept������ֻҪ����Ϊtrue�Ķ���Ϊ����������

		*/
		System.out.println("len:"+javas.length);

		//System.out.println(Arrays.toString(javas));
		for(String java : javas)
		{
			System.out.println(java);
		}
		

		/*
		ע�⣺list����listFiles������ȡ�Ķ��ǵ�ǰĿ¼�µ��ļ������ļ��У����������ļ������ļ��С�

		*/
	}

}
/*

File(String parent,String child)
{
	this(new File(parent),child);

}

File(File parent ,String child)
{
	
}


FileWriter(String filename)
{
	File f = new File(filename);
	if(f.exists())
		f.delete();
	f.createNewFile();
}


File  getAbsoluteFile()
{

	String path = getAbsolutePath();
	return new File(path);
}
*/