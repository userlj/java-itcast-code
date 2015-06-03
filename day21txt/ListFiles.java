import java.io.*;

class  ListFiles
{
	public static void main(String[] args) 
	{
		File dir = new File("f:\\demodir");

		new ListFiles().listDir(dir,0);
	}
	public void listDir(File dir,int level)
	{
		System.out.println(getLevel(level)+dir.getName());
		level++;
		File[] files = dir.listFiles();
		for(int x =0; x<files.length; x++)
		{
			if(files[x].isDirectory())//�������������Ŀ¼��
				listDir(files[x],level);//��ô���иù��ܵ��ظ�ʹ�á��ݹ顣
			else
				System.out.println(getLevel(level)+files[x].getName());
		}
	}

	//��Ҫ���г���Ŀ¼��һЩ��ι�ϵ��
	public String getLevel(int level)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("|--");
		for(int x=0; x<level; x++)
		{
			sb.insert(0,"|  ");
		}
		return sb.toString();
	}
}
