/*
ͨ��LinkedListģ��һ�����г�����

˼·��
Ҫ�Զ��н����������������Ƚ��ȳ������ݽ����װ���������С�
�ײ�ʹ�õľ���LinkedList����


�ص㣬һ��Ҫ��д��


*/
import java.util.*;
class DuiLie
{
	private LinkedList link ;

	DuiLie()
	{
		link = new LinkedList();
	}
	/*
	���Ԫ�صķ�����
	*/
	public void myAdd(Object obj)
	{
		link.addLast(obj);
	}

	/*
	��ȡ�ķ���
	*/
	public Object myGet()
	{
		return link.removeFirst();
	}

	/*
	�жϷ�����
	*/
	public boolean isNull()
	{
		return link.isEmpty();
	}
}


class  LinkedListTest
{
	public static void main(String[] args) 
	{

		DuiLie dl = new DuiLie();
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		while(!dl.isNull())
		{
			System.out.println(dl.myGet());
		}
	}
}


