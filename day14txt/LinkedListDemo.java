/*

��ʾLinkedList�����з���.
���з�����
addFirst():
addLast();
��jdk1.6,
offerFirst();
offerLast();


getFirst();
getLast();
jdk1.6
peekFirst();
peekLast();


removeFirst();
removeLast();
jdk1.6
pollFirst();
pollLast();


���ڻ�ȡ��ɾ�������������û��Ԫ�أ���ô�����NoSuchElementException��
����jdk1.6�����ʹ���·���peek��poll��
�������û��Ԫ�أ���ô��������쳣�����Ƿ���null.



LinkedList�ǿ���ģ��һЩ���������ݽṹ�ġ�

1����ջ:�Ƚ������
2������:�Ƚ��ȳ���
*/
import java.util.*;
class  LinkedListDemo
{
	public static void main(String[] args) 
	{
		LinkedList link = new LinkedList();
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");

		while(!link.isEmpty())
		{
			System.out.println("remove:"+link.removeFirst());
		}

		/*
		System.out.println("first:"+link.getFirst());//abc4
		System.out.println("last:"+link.getLast());
		
		System.out.println("removelast:"+link.removeLast());

		
		System.out.println(link);
		*/
	}
}


