/*
��ʾVector�����е�һЩ��������Щ��������һ���ص㣺����element������ʡ�.

Vector��֧��һ�����е�ȡ����ʽ��ö��(Enumeration)
���Ǻ��ź���Enumeration�����������������Ϊ�ӿ������Լ��������ƹ�������

*/
import java.util.*;
class  VectorDemo
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();

		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		//1,ȡ����ʽelementAt��
		for(int x=0; x<v.size(); x++)
		{			
			System.out.println("elementat::"+v.elementAt(x));
		}

		Enumeration en  = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println("en::"+en.nextElement());
		}

		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
