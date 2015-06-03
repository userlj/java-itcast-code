/*
��ʾTreeSet���ϵĵڶ��ֱȽϷ�ʽ��

���Ԫ�������߱��Ƚ��ԡ�
����Ԫ������߱��ıȽ��Բ�������Ҫ�ġ�

��ʱֻ���õڶ��ַ�ʽ����
����������߱��Ƚ��ԡ�
��ʵ���Ƕ���һ����ʵ��Comparator�ӿڣ�����compare������
�������������Ϊ�������ݸ�TreeSet���ϵĹ��캯����

��Ԫ������߱��Ƚ��ԣ���ʱ��Ȼ����Ҳ��ΪĬ������
����ͨ�����캯����TreeSet����ָ���˱Ƚ���ʱ���ԱȽ����ıȽϷ�ʽΪ����


*/
import java.util.*;
class  TreeSetDemo2
{
	public static void main(String[] args) 
	{

		TreeSet ts = new TreeSet(new MyCompare());

		ts.add(new Person(30));
		ts.add(new Person(35));
		ts.add(new Person(30));
		ts.add(new Person(32));
		ts.add(new Person(29));
		System.out.println(ts);
	}
}


class MyCompare  implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;

		if(p1.getAge()>p2.getAge())
			return 1;
		if(p1.getAge()<p2.getAge())
			return -1;
		return 0;
	}
}

class Person implements Comparable
{
	private int age;
	Person(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	public int compareTo(Object obj)
	{
		Person p = (Person)obj;
		if(this.age>p.age)
			return -1;
		if(this.age<p.age)
			return 1;
		return 0;
	}
	public String toString()
	{
		return "person:"+age;
	}
}

/*
��ҵ��
���ַ������г�������

*/