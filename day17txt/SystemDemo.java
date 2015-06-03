/*
System:
	��������jvm�������з������Ǿ�̬�ġ�
	�ڲ���װ��һ��Properties����


Map
	|--Hashtable
		|--Properties

Properties:
	getProperty(key);
	setProperty(key,value);

System:
	static getProperty(key);
	static setProperty(key,value);

*/
/*
��ϰ1��
��ȡϵͳ������Ϣ��ͨ��entrySet��ȡ��ӡ��
��ϰ2��
��̬�ĸ�ϵͳ���һЩ������Ϣ��-D
*/
import java.util.*;
class  SystemDemo
{
	public static void main(String[] args) 
	{
		//ͨ��System���getProperties������ȡjvmϵͳ����ʱ��һЩ����������Ϣ��
		Properties prop = System.getProperties();
		
		//��ȡָ��������Ϣ��
		String sysname = prop.getProperty("os.name");
		System.out.println("name:"+sysname);

		System.setProperty("mykey","myValue");

		String myvalue = prop.getProperty("mykey");
		System.out.println("my:"+myvalue);


		//��ȡһ����ָ̬����������Ϣ��
		/*
		Ҫ���ȡ����̬��������Ϣ��
		��Ҫ������jvmʱ��ͨ����������������ɡ�
		java -Dhahakey=zzzz SystemDemo
		v=zzzz
		*/
		String v = System.getProperty("hahakey");
		System.out.println("v="+v);


		/*
		//��ȡϵͳ���л���������Ϣ��
		Set keys = prop.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			String key = (String)it.next();
			String value = (String)prop.get(key);
			System.out.println(key+":::"+value);
		}
		*/

	}
}
