import java.util.*;

/*

��ʾһ��sort max�����Զ���Ԫ�ء�

<T extends Object & Comparable<? super T>> 
:�÷������������ͱ�����Object�Լ�Comparable�ӿڵ������͡�

public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)


*/
class  CollectionsDemo2
{
	public static void main(String[] args) 
	{
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("haha1",30));
		al.add(new Person("haha2",35));
		al.add(new Person("haha3",32));

		Person p = Collections.max(al);
		System.out.println(p);
	}
}

class Person implements Comparable<Person>
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public int compareTo(Person p)
	{
		if(this.age>p.age)
			return 1;
		if(this.age<p.age)
			return -1;
		return this.name.compareTo(p.name);
	}
	public String toString()
	{
		return name+":"+age;
	}
}