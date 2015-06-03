/*
��ʾTreeSet���ϡ�

Treeset:�ײ����ݽṹ�Ƕ�������
TreeSet���Ͽ��Զ�Set�����е�Ԫ�ؽ�������

����TreeSet�����е�Ԫ����Ҫ�߱��Ƚ��ԡ�
������Ƚ�������Ҫʵ��һ��Comparable�ӿڡ�


TreeSet������α�֤Ԫ��Ψһ�Ե��أ�
�ȽϷ�����return 0.

TreeSet���ϵĵ�һ�ֱȽϷ�ʽ��
��Ԫ������߱��Ƚ��ԣ���дComparable�ӿ��е�comparTo������


*/

import java.util.*;

class  TreeSetDemo
{
	public static void main(String[] args) 
	{
		TreeSet ts =new TreeSet();

		ts.add(new Student("lisi1",29));
		ts.add(new Student("lisi2",28));
		ts.add(new Student("lisi3",22));
		ts.add(new Student("lisi4",25));

		System.out.println(ts);
	}
}
class Student implements Comparable
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object obj)
	{
		
		System.out.println(this+"..compareTo...."+obj);
		Student s = (Student)obj;
		if(this.age>s.age)
			return 1;
		if(this.age==s.age)
		{
			/*
			int num = this.name.compareTo(s.name);
			if(num>0)
				return 1;
			if(num<0)
				return -1;
			return 0;
			*/
			return this.name.compareTo(s.name);

		}
		return -1;
		
		//return 1;//����ʹTreeSet���ϳ����������������˳���ȡ��˳��һ�¡�
	}

	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return "student:"+name+"--"+age;
	}

}

/*
��ѧ������TreeSet���ϡ�
Ҫ������������

*/