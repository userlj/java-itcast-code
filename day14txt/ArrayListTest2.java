/*
��ϰ������һ�����ܣ�����ȥ��ArrayList���ظ���Ԫ�ء�
1�������ַ���Ԫ�ض���
2�������Զ�����󣬱���Person����

˼·��
1������һ�����������ڴ洢���ظ���Ԫ�ء�
2����ԭ�������б�����
3���ڱ��������н����жϣ���������Ԫ���Ƿ����������д��ڣ�
4��������ڣ��Ͳ����룬������롣
5�����ظ����������ɡ�
*/


import java.util.*;
class  ArrayListTest2
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
//		list.add("abc1");
//		list.add("abc2");
//		list.add("abc1");
//		list.add("abc2");

		list.add(new Student("lisi1",21));
		list.add(new Student("lisi2",22));
		list.add(new Student("lisi1",21));
		list.add(new Student("lisi2",22));
		list.add(new Student("lisi2",22));

		System.out.println(list);

		list = getSingleList(list);
		System.out.println(list);

	}

	public static List getSingleList(List  list)
	{
		//����һ���µ�������
		List newList = new ArrayList();

		for(Iterator it = list.iterator(); it.hasNext(); )
		{
			Object obj = it.next();
			if(!(newList.contains(obj)))
				newList.add(obj);

		}
		return newList;

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
	/*
	Ϊ�˽���ѧ���������еĶ����Ƿ���ͬ�ıȽ���Ϊ��Ҫ��дObject���е�equals������
	*/
	public boolean equals(Object obj)
	{
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
