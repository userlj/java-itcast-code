/*
���ϣ�����һ��������
1�����ڴ洢����ġ�
2���������ĳ����ǿɱ�ġ�

��Ϊװ����������ڲ������ݽṹ��ͬ��
��Щ�����ܺܶ��У������˲��ϵĳ�ȡ�����γ�����ϵ��

�����ϵ���ǳ�֮Ϊ���Ͽ�ܡ�

������ѧϰһ����ϵ��ʱ��
��Ҫ��ȷ����ϵ�Ļ������ܡ�


��ʾCollection�еķ�����
*/

import java.util.*;

class ArrayListDemo
{
	public static void main(String[] args)
	{
		//1,ͨ��Collection��������󣬴���һ����������ʵ���϶����д�Ŷ���Ԫ�ص�����(��ַ)
		ArrayList al = new ArrayList();

		//2,����Collection�Ĺ��Է������һЩԪ�ء�
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");


		ArrayList al1 = new ArrayList();
		al1.add("qq1");
		al1.add("qq2");
		al1.add("qq3");
		//al1.add("abc1");
		
		//���һ��Ԫ�ء�
		//al.addAll(al1);

		//3,ɾ��һ��Ԫ�ء�
		al.remove("abc3");


		//4,������
		//boolean b = al.retainAll(al1);
		//System.out.println("b="+b);


		//5����ռ��ϡ�
		//al.clear();
		//��ȡ���ϵĳ��ȡ�
		

		//6,�ж�һ��Ԫ�ء���ʵ�õĻ���equals�������ж�Ԫ���Ƿ���ͬ��

		//boolean b = al.contains("abc22");
		//System.out.println("b="+b);

		//System.out.println(al.size());
		
		iteratorDemo();
		

		//System.out.println(al.toString());//[abc1, abc2, abc4]
		/*
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+"..");
		}
		al.retainAll(al1);
		Iterator it1 = al.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next()+"--");
		}
		*/

	}

	public static void iteratorDemo()
	{
		ArrayList al = new  ArrayList();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");

		
		/*
		ʲô�ǵ�������
		��������ȡ��������Ԫ�صĶ���
		�ö�����Ϊÿһ�����������ݽṹ��ͬ������ʵ�ַ�ʽҲ��һ��������
		�������������е����ݣ�������ͨ���ڲ�����ʵ�֣�Ҳ���ǽ����������ڲ���װ��
		����ֻҪͨ��iterator()������ȡ�ö��󼴿ɲ��������е�Ԫ�ء�

		����������ͬ������Ϸ���е�ץ�����޵���Ϸ�������������Ǹ���Ϸ���е��Ǹ����ӣ�

		*/
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


		for(Iterator it1 = al.iterator(); it1.hasNext(); )
		{
			System.out.println(it1.next());
		}


//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//.NoSuchElementException
	}
}

/*
��������������A B
�ֱ�����������Ԫ�ء�

Ҫ�󣺻�ȡA�����е���B����������Ԫ�أ�

����ЩԪ�ش�ӡ��


*/