/*
����
ͨ������¼�����ʽ����ѧ����Ϣ����ʽ������,��ѧ�ɼ�,���ĳɼ�,Ӣ�ĳɼ�

�����ѧ�����ְܷ��մӸߵ��͵Ĵ������򲢴洢��һ���ļ��С�

˼·��
1������¼���ȡѧ����Ϣ��
2������Ϣ�����и����Ϣ��װ��ѧ������
3��Ҫ����Ϣ������Ϣ������ѧ��������Ҫ��ѧ�����д洢��
4����������ѧ���������Ϣд�뵽�ļ��С�

���裺
1������¼�룺
	BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

2���ڶ���ÿһ���ַ���ʱ��ʹ��split(",")�Խ������ݽ����и�����ݷ�װ��ѧ�������С�

3����ѧ������洢���ĸ������У���Ҫ�������Դ洢��TreeSet�����С�

4������treeset���ϣ���treeset�����е�ѧ����Ϣд�뵽һ���ļ��С�
	BufferedWriter bufw = new  BufferedWriter(new FileWriter("info.txt"));




*/



import java.io.*;
import java.util.*;
class  StudentInfo
{
	public static void main(String[] args) throws IOException
	{
		Comparator<Student> comp = Collections.reverseOrder();
		
		Set<Student> stuSet = InfoTool.getStudents(comp);

		File destFile = new File("stuInfo.txt");
		InfoTool.write2File(stuSet,destFile);
	}
}
class MyCompare implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.getSum()>s2.getSum())
			return -1;
		if(s1.getSum()<s2.getSum())
			return 1;
		return s2.getName().compareTo(s1.getName());
	}
}

class InfoTool
{

	/*
	��ȡѧ������Set���ϡ���ָ���ıȽ�����
	*/
	public static Set<Student> getStudents()throws IOException
	{
		return getStudents(null);
	}
	/*
	��ȡ����¼����Ϣ����װѧ������洢��Set�����С�
	*/
	public static Set<Student> getStudents(Comparator<Student> comp)throws IOException
	{
		Set<Student> stuSet = null;

		if(comp==null)
			stuSet = new TreeSet<Student>();
		else
			stuSet = new TreeSet<Student>(comp);

		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;

			String[] arr = line.split(",");
			Student stu = new Student(arr[0],Integer.parseInt(arr[1])
											,Integer.parseInt(arr[2])
											,Integer.parseInt(arr[3]));
			stuSet.add(stu);
		}
		return stuSet;
	}

	/*
	�������е���Ϣ��д�뵽һ���ļ��С�
	*/

	public static void write2File(Set<Student> stuSet,File infoFile)throws IOException
	{
		BufferedWriter bufw = new BufferedWriter(new FileWriter(infoFile));

		for(Student stu : stuSet)
		{
			bufw.write(stu.getName()+"\t"+stu.getSum());
			bufw.newLine();
			bufw.flush();
		}

		bufw.close();
	}
}
class Student implements Comparable<Student>
{
	private String name;
	private int ma,cn,en;
	private int sum;
	Student(String name,int ma,int cn,int en)
	{
		this.name = name;
		this.ma = ma;
		this.cn = cn;
		this.en = en;
		sum = ma+cn+en;
	}
	public int compareTo(Student s)
	{
		if(this.sum>s.sum)
			return 1;
		if(this.sum<s.sum)
			return -1;
		return this.name.compareTo(s.name);
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(!(obj instanceof Student))
			return false;
		Student s = (Student)obj;

		return this.name.equals(s.name) && ma==s.ma && cn==s.cn && en==s.en;

	}
	public int hashCode()
	{
		return name.hashCode()+sum*28;
	}
	public String getName()
	{
		return name;
	}
	public int getSum()
	{
		return sum;
	}
}
	