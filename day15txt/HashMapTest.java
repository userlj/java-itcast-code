
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



*/
import java.util.*;

class Student
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
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



class  HashMapTest
{
	public static void main(String[] args) 
	{
		HashMap<Student,String> hm = new HashMap<Student,String>();

		hm.put(new Student("lisi1",21),"����");
		hm.put(new Student("lisi2",27),"�Ϻ�");
		hm.put(new Student("lisi3",22),"���");
		hm.put(new Student("lisi4",29),"�Ͼ�");
		hm.put(new Student("lisi5",23),"����");
		hm.put(new Student("lisi5",23),"����");

		
		//keySet��
		Set<Student> keys = hm.keySet();
		Iterator<Student> it = keys.iterator();
		while(it.hasNext())
		{
			Student stu = it.next();
			String addr = hm.get(stu);
			System.out.println(stu.getName()+"--"+stu.getAge()+"--"+addr);
		}
		/*
		//entrySet.
		Set<Map.Entry<Student,String>> entrys = hm.entrySet();
		Iterator<Map.Entry<Student,String>> it1 = entrys.iterator();
		while(it1.hasNext())
		{
			Map.Entry<Student,String> me = it1.next();
			Student s = me.getKey();
			String a = me.getValue();
			System.out.println(s.getName()+".."+s.getAge()+".."+a);
		}
		*/
	}
}
