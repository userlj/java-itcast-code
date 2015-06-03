/*
��ָ��Ŀ¼�µ�����java�ļ�(������Ŀ¼�е�java�ļ�)�ľ�··���洢��һ���ı��ļ��С�

˼·��
1���ȶ�ִ��Ŀ¼���еݹ������
2��������������������file����洢��һ����ʱ�����С�
3���������е��ļ����в�������file�����·��д�뵽һ���ļ��С�


*/

import java.io.*;
import java.util.*;
class  JavaFileList
{
	public static void main(String[] args) throws IOException
	{
		List<File> list = new ArrayList<File>();
		FilenameFilter filter = new MyFilter();
		File dir = new File("F:");
		File destFile = new File("javalist.txt");

//		System.out.println(list.size());

		listFile(dir,filter,list);

		write2File(list,destFile);

//		System.out.println(list.size());
//		for(File f : list)
//		{
//			System.out.println(f);
//		}
	}

	public static void listFile(File dir,FilenameFilter filter,List<File> list)
	{
		File[] files = dir.listFiles();

		for(int x=0; x<files.length; x++)
		{
			if(files[x].isDirectory())
				listFile(files[x],filter,list);
			else
			{
				if(filter.accept(dir,files[x].getName()))
				{
					list.add(files[x]);
				}
			}
		}
	}

	public static void write2File(List<File> list,File destFile)throws IOException
	{

		BufferedWriter bufw = new BufferedWriter(new FileWriter(destFile));

		for(File f : list)
		{
			bufw.write(f.getAbsolutePath());
			bufw.newLine();
			bufw.flush();
		}

		bufw.close();
	}
}
	
class MyFilter implements FilenameFilter
{
	public boolean accept(File dir,String name)
	{
		return name.endsWith(".class");
	}
}