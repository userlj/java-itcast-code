import java.util.*;


/*
���ͣ�
JDK1.5�汾�Ժ���ֵ�һ����ȫ���ơ�

�ô���
1,������ʱ�ڳ��ֵ����⣨ClassCastException��ת�Ƶ��˱���ʱ�ڡ�
2,������ǿ��ת�����鷳��


���͵ĸ�ʽ��
ͨ��<>��ָ��������Ԫ�ص����͡�

*/
class GenericDemo01
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		//al.add(123);

		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s.length());
		}
	}
}