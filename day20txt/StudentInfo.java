import java.io.*;
import java.util.*;

/*
��ϰ��
ͨ������¼��ѧ����Ϣ��
��Ϣ���������������ĳɼ�����ѧ�ɼ���Ӣ�ĳɼ���

����Щ��Ϣ���մӸߵ��͵�˳������һ���ļ��С�


˼·��
1����ȡ����¼����Ϣ��
2������ȡ��һ����¼��Ϊ�˷����������
	���ü�¼�е���Ϣ����װ��Student����
3����ѧ��������뼯���б��ڲ�������Ҫ����
4���������е���Ϣ���뵽�ļ��С�

���裺
1������ѧ����
	����ѧ����Ψһ�Ե��жϡ�
	��ѧ�����������ĸ����ϲ�ȷ������Ҫ����equals hashCode compareTo��
2��ͨ��BufferedReader+System.in.���ϻ�ȡ����¼�롣
3����ÿ������һ������split�и����װ��Student����
4�����������TreeSet���ϡ�
5�������ü��ϣ�����Ϣд�뵽�ļ��С�FileWriterBufferedWriter��


lisi,20,20,20

*/

class Student implements Comparable<Student>
{
	private String name;
	private int cn,en,ma;
	private int sum;
	Student(String name,int cn,int en,int ma)
	{
		this.name = name;
		this.cn = cn;
		this.en = en;
		this.ma = ma;
		sum = cn+en+ma;
	}

	public boolean euqals(Object obj)
	{
		if(this==obj)
			return true;
		if(!(obj instanceof Student))
			return false;
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.sum==s.sum;
	}
	public int hashCode()
	{
		return name.hashCode()+sum*34;

	}
	
	public int compareTo(Student s)
	{
		if(this.sum>s.sum)
			return 1;
		if(this.sum==s.sum)
			return this.name.compareTo(s.name);
		return -1;
	}
	public int getSum()
	{
		return sum;
	}
	public String getName()
	{
		return name;
	}
}

class InfoTool
{
	public static Set<Student> getInfoSet()throws IOException
	{
		return getInfoSet(null);
	}
	

	public static Set<Student> getInfoSet(Comparator<Student> comp)throws IOException
	{
		BufferedReader bufr = 
			new BufferedReader(new InputStreamReader(System.in));


		TreeSet<Student> ts = null;
		if(comp==null)
			ts = new TreeSet<Student>();
		else
			ts = new TreeSet<Student>(comp);

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			String[] arr = line.split(",");
			Student s = new Student(arr[0],Integer.parseInt(arr[1])
				,Integer.parseInt(arr[2])
				,Integer.parseInt(arr[3]));

			ts.add(s);
		}
		return ts;
	}

	public static void write2File(Set<Student> infoSet)throws IOException
	{
		BufferedWriter bufw = 
			new BufferedWriter(new FileWriter("stuinfo.txt"));

		Iterator<Student> it = infoSet.iterator();
		while(it.hasNext())
		{
			Student stu = it.next();
			bufw.write(stu.getName()+"\t"+stu.getSum());
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
	}
}


class  StudentInfo
{
	public static void main(String[] args) throws IOException
	{

		Comparator<Student> comp = Collections.reverseOrder();
		Set<Student> infoSet = InfoTool.getInfoSet(comp);

		InfoTool.write2File(infoSet);
	}
}
