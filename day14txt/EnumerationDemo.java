/*
ö�ٺ͵����Ĺ������ظ��ġ�
ͨ������ʾ��������ʾ��

�������Ҫ���д��
*/
import java.util.*;
class  EnumerationDemo
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc2");

		//ͨ��ö��ȡ��arrayList�е�Ԫ�ء�
		/*
		arrayList��û�з���ֱ�ӻ�ȡ��ö�ٽӿڵĶ���
		��ô�����ǿ����Լ�����ö�ٽӿڵĶ���
		*/

		final Iterator it = al.iterator();
		Enumeration en = new Enumeration()
		{
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public Object nextElement()
			{
				return it.next();	
			}
		};
		

		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
}
