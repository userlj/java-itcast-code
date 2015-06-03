import java.util.*;
/*
���÷�����
��Tree���Ͻ����������ת��
//��Ĭ��˳��Ҳ������Ȼ˳�������ת��
Comparator reverseOrder();

//��ָ���ıȽ�����˳�������ת��
Comparator reverserOrder(Comparator);
*/
class  CollectionsDemo4
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts= new TreeSet<Integer>(Collections.reverseOrder());
		ts.add(6);
		ts.add(2);
		ts.add(7);
		ts.add(1);
		
		System.out.println(ts);

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		Collections.shuffle(al);
		System.out.println("al:"+al);

	}
}


/*
�ַ������г����ɴ�С������
ֻҪ����һ���Ƚ�������С��������ͨ����ת�Ϳ�����ɸö�����

TreeSet ts = new TreeSet(new StrCompareByLen());//�ǰ����ַ���������С�����˳��



TreeSet ts = new TreeSet(Collections.reverseOrder(new StrCompareByLen());//�ǰ����ַ��������ɴ�С��˳��

*/
/*

//synchronizedList������ԭ��


class Collections 
{
	public static List synchronizedList(List list)
	{
		return SynList(list);
	}

	static class SynList 
	{
		private List list;
		private Object lock = new Object();
		
		SynList(List list)
		{
			this.list = list;
		}

		public void add(E e)
		{
			synchronized(lock)
			{
				list.add(e);
			}
		}
		public void remove(E e)
		{
			synchronized(lock)
			{
				list.remove(e);
			}
		}
	}
}
*/


public static int halfSearch(List<String> list,String key)
{
	int max,min,mid;
	max = list.size()-1;
	min = 0;

	while(min<=max)
	{
		mid = (max+min)/2;

		String midStr = list.get(mid);
		
		int num = key.compareTo(midStr);
		if(num>0)
			min = mid + 1;
		else if(num<0)
			max = mid - 1;
		else
			return mid;


	}
}

public static int halfSearch(List<String> list,String key,Comparator<String> comp)
{
	int max,min,mid;
	max = list.size()-1;
	min = 0;

	while(min<=max)
	{
		mid = (max+min)/2;

		String midStr = list.get(mid);
		
		int num = comp.compare(key,midStr);
		if(num>0)
			min = mid + 1;
		else if(num<0)
			max = mid - 1;
		else
			return mid;


	}

	return -(min+1)-1;
}
