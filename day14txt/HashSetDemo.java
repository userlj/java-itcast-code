/*
Set:���򣬲������ظ�
Set�ӿڵ��еķ�����Collectionһ�¡�
	|--HashSet:�ײ�������ǹ�ϣ��,����ж�Ԫ����ͬ�أ�ͨ������������ɡ�hashCode(),equals();
				��hashCodeֵ��ͬ��equals����trueʱ��hashset������Ϊ������Ԫ������ͬԪ�ء�ֻ�洢һ����
				����ԭ�����ж�hashCode������ֵ�������ͬ���Ż��ж�equals�����������ͬ���ǲ������equals������

	|--TreeSet:



HashSet�������ж�Ԫ���Ƿ���ͬ���ο�����hashCode�������ڲο�equals������
��ArrayList���ϣ����ж�ԭʼ�Ƿ���ͬ�ο�����equals��
*/
import java.util.*;
class  HashSetDemo
{
	public static void main(String[] args) 
	{

		HashSet hs = new HashSet();

		hs.add(new Student("lisi1",21));
		hs.add(new Student("lisi2",22));
		hs.add(new Student("lisi3",23));
		//hs.add(new Student("lisi4",24));
		//hs.add(new Student("lisi3",23));
		
		boolean b = hs.contains(new Student("lisi2",22));
		System.out.println("b="+b);

		hs.remove(new Student("lisi3",23));
		System.out.println(hs);
		/*
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+"...");
		}
		*/

	}
}
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
		System.out.println("hashcode---"+this);
		return name.hashCode()+age*27;
	}

	public boolean equals(Object obj)
	{
		System.out.println(this+"----equals---"+obj);
		if(!(obj instanceof Student))
			return false;
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.age==s.age;

	}
	public String toString()
	{
		return "student:"+name+"--"+age;
	}

}


/*

��HashSet�����д���һЩPerson����
ͬ����ͬ�������Ϊͬһ���ˡ�
1���ȴ��뼸��Ԫ�ز����д�ӡ��
2����������ظ�Ԫ�ء���ӡ��
3����֤Ԫ�ص�Ψһ�ԡ���ӡ��

*/