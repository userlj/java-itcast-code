import java.io.*;

/*
File��Ӧ�á�
��ȡָ��Ŀ¼�����е��ļ����Լ��ļ���������Ŀ¼�е����ݡ�


����ַ����ݹ顣
1���ݹ���Ǻ��������������
2����ʹ�õݹ�ʱ��һ��Ҫע���޶�������
�����ڴ������

��ʹ�õݹ�ʱ���������ô������࣬���򳬳�jvm���ڴ淶Χ��һ���ᵼ���ڴ������


2,����
	ɾ��һ�������ݵ�Ŀ¼��
	ԭ������windows��ɾ����Ҫ��ɾ���ļ������������ݺ󣬲ſ��Բ������ļ��С�

	Ҳ������Ҫ��������ɾ��

	ɾ������Ҫ���ã�




*/

import java.io.*;

class  FileDemo2
{
	public static void main(String[] args) 
	{
		File dir = new File("f:\\java40");

		//getAll(dir,0);

		deleteAll(dir);



		FileReader fr = new FileReader("c:\\a.txt");

		File f = new File("c:\\a.txt");
		if(f.exists())
			FileReader fr = new FileReader(f);



	}

	public static void deleteAll(File dir)
	{
		File[] files = dir.listFiles();

		for(int x=0;x<files.length; x++)
		{
			if(files[x].isDirectory())
				deleteAll(files[x]);
			else
				System.out.println(files[x]+".."+files[x].delete());
		}
		System.out.println(dir+".."+dir.delete());
	}

	public static void getAll(File dir,int level)
	{
		System.out.println(getLevel(level)+dir.getName());
		level++;
		File[] files = dir.listFiles();
		for(int x =0; x<files.length; x++)
		{
			if(files[x].isDirectory())
				getAll(files[x],level);
			else
				System.out.println(getLevel(level)+files[x].getName());
		}
	}
	
	public static String getLevel(int level)
	{
		StringBuilder sb =  new StringBuilder();

		for(int x=0; x<level; x++)
		{
			sb.append("|--");
		}
		return sb.toString();
	}

	public static void toBin(int num)
	{
		if(num>0)
		{
			toBin(num/2);
			System.out.print(num%2);
		}
	}

	public static int getSum(int n)
	{

		if(n==1)
			return 1;
		return n+getSum(n-1);
	}
}
