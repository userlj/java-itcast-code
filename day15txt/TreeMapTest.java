/*
��ϰ��
ÿһ��ѧ�������Լ��Ĺ����ء�
ѧ���͹�����֮�������ӳ���ϵ��
ѧ�����Լ������������䡣
��������String��ʾ��

����Student��
ֵ��String��
��HashMap�����д���ѧ������Ӧ�Ĺ����ء�
ͨ������ȡ����ʽ�����ݴ�ӡ��

Ҫ�󣺰�ѧ���������������

*/
import java.util.*;

class TreeMapTest 
{
	public static void main(String[] args) 
	{
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new CompareByName());
		tm.put(new Student("lisi1",21),"����");
		tm.put(new Student("lisi2",27),"�Ϻ�");
		tm.put(new Student("lisi3",22),"���");
		tm.put(new Student("lisi4",29),"�Ͼ�");
		tm.put(new Student("lisi5",23),"����");
		tm.put(new Student("lisi5",23),"����");

		

		Set<Map.Entry<Student,String>> entrys = tm.entrySet();
		Iterator<Map.Entry<Student,String>> it = entrys.iterator();

		while(it.hasNext())
		{
			Map.Entry<Student,String> me = it.next();
			Student stu = me.getKey();
			String addr = me.getValue();
			System.out.println(stu.getName()+":"+stu.getAge()+":"+addr);
		}

	}
}

class CompareByName implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		int num = s1.getName().compareTo(s2.getName());
		if(num==0)
		{
			if(s1.getAge()>s2.getAge())
				return 1;
			if(s1.getAge()<s2.getAge())
				return -1;
			return 0;
		}
		return num;
	}
}



class Student implements Comparable<Student>
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student s)
	{
		if(this.age>s.age)
			return 1;
		if(this.age<s.age)
			return -1;
		return this.name.compareTo(s.name);
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int hashCode()
	{
		return name.hashCode()+age*27;

	}
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(!(obj instanceof Student))
			return false;
		Student s = (Student)obj;

		return this.name.equals(s.name) && this.age==s.age;
	}
	public String toString()
	{
		return name+"::"+age;
	}
}

