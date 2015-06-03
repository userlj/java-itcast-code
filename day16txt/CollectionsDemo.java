/*
Collections:
���Ͽ�ܵĹ����ࡣ
������ķ������Ǿ�̬�ġ�

*/
import java.util.*;

/*
��ʾCollections�е�
sort
max
������
*/
class  CollectionsDemo
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("cccc");
		al.add("abcde");
		al.add("aa");
		al.add("abc");
		al.add("abc");

		System.out.println(al);

		//��list���Ͻ�������//��ʵʹ�õĶ����compareTo������

		//Collections.sort(al);

		//����ָ���ıȽ�������list���ϵ�����
		Collections.sort(al,new StrCompareByLen());

		System.out.println(al);

		//��ȡ����Ԫ����Ȼ���������Ԫ�ء�
//		String max = Collections.max(al);

		//��ȡ��ָ���Ƚ���������Ԫ�ء�
		String max = Collections.max(al,new StrCompareByLen());
		System.out.println("max="+max);
	}
}


class StrCompareByLen implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}
