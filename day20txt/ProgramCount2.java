
/*
�������д����жϵĵڶ��ַ�ʽ��
*/

import java.util.*;
import java.io.*;

class  ProgramCount2
{
	public static void main(String[] args) throws IOException
	{

		int count = 0;
		Properties prop = new Properties();

		File file = new File("time.ini");
		
		if(!file.exists())
			file.createNewFile();

		FileInputStream fis = new FileInputStream(file);

		prop.load(fis);

		String value = prop.getProperty("cishu");
		if(value!=null)
			count = Integer.parseInt(value);
		

		if(count==3)
		{
			System.out.println("ʹ�ô����ѵ�����Ǯ");
			System.exit(0);
		}
		count++;

		prop.setProperty("cishu",count+"");


		FileOutputStream fos = new FileOutputStream(file);

		prop.store(fos,"");

		fos.close();
		fis.close();
	}
}
