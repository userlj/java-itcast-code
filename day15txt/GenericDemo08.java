/*
�����漰��Сϸ�ڡ�

1�����巺�����Ҷ�һ�¡�
2���ڷ��ͷ����в�����ʹ�÷��Ͷ�������з�����

*/
import java.util.*;
class  GenericDemo08
{
	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<String>();

		al.add("haha");
		al.add("haha2");
		printElement(al);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(3);
		al1.add(4);

		printElement(al1);
//		al.add("haha");
//		al.add(123);
//
//		show("haha");
//		show(new Integer(1));
	}

	public static  void printElement(Collection<?> coll)
	{
		Iterator<?> it = coll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static <T> void show(T t)
	{
		t.toString();
	}
}

