/*
Collection�С�
������Ϊ���������ķ�����
1�����ӣ�
	add(obj)
2��ɾ����
	remove(obj)
	clear();
3���жϡ�
	isEmpty()
	contains(obj)
4��������
	size()
5��ȡ����
	iterator();
	��Ϊ������ȡ��Ԫ�ط�ʽ����Ҫ�����п��ܲ�ֻһ������ô����Щ���������˶���ķ�װ��
	��Ϊ������һ���ڲ�������ڣ�Ҳ����ͨ���ڲ���������ȡ����ʽ��
	���ڸ�ȡ����ʽ��ÿһ�������������ʵ�ֵģ���������ÿһ�����������ݽṹ�����ġ�
	����װ�ˣ���������Ҫ���ģ�����ͨ��һ��������ȡ���ڲ�����󼴿ɡ�
	�÷�������iterator��
	��ÿһ����������ȡ����ʽ������ÿһ�������߱��÷�������Щȡ����ʽ������һ�µģ�
	��ʵ�ֲ�ͬ������ȡ��һ���ӿ�Iterator
	�൱��ȡ�������޵ļ��ӡ�



Collection
	|--List������(���ȡ����˳����һ�µ�)���нǱ꣬���ظ���
		|--ArrayList���ײ����������ݽṹ����ѯ���ٶȺܿ죬�߳��ǲ���ȫ�ġ��ɱ������ԭ��50%�ӳ���
		|--LinkedList���ײ����������ݽṹ����ɾ���ٶȵĿ죬�߳��ǲ���ȫ�ġ�
		|--Vector���ײ�������ṹ�����۲�ѯ������ɾ�������߳��ǰ�ȫ�ġ�100%�ӳ�����ArrayList�����
	|--Set�����򣬲������ظ���



�ڶ�list����Ԫ�ؽ��е��������У���������ֵ�������Ķ�Ԫ�صĲ�������Ϊ�������ײ�����ȫ������
java���׳�һ���쳣�������޸��쳣��java.util.ConcurrentModificationException

��Ҫ�ڵ��������в���Ԫ�أ�����ͨ��List���ϵ�ListIterator �б����������ɡ�

������ֻ֧���ڵ���������ɾ��������

�����������ӽӿ�ListIterator��
��֧���ڵ��������У����Ԫ�غ��޸�Ԫ�صĶ�����


*/
import java.util.*;
class  ArrayListDemo3
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");
		
		ListIterator li = al.listIterator();

		System.out.println(li.hasPrevious());
		//System.out.println(li.previous());
		while(li.hasNext())
		{
			String s = (String)li.next();
			if(s.equals("abc2"))
				//li.add("haha");
				li.set("qq");
			System.out.println("next::"+s);
		}



		while(li.hasPrevious())
		{
			System.out.println("previous::"+li.previous());
		}

//		System.out.println(li.hasPrevious()+"....");
//		System.out.println(li.previous()+"...");
		/*
		Iterator it = al.iterator();
		while(it.hasNext())
		{		
			String s = (String)it.next();
			if(s.equals("abc2"))
				al.add("haha");
			System.out.println(s);			
		}
		*/
		System.out.println(al);
	}
}
