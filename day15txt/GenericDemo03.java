
/*
�����ࡣ


*/

class Student
{
}
class Worker
{
}
//����һ������������������Ϊ�������չ�ԡ�ʹ��Object���������е��������
/*class Tool
{
	private Object obj;
	public void setObj(Object obj)
	{
		this.obj = obj;
	}
	public Object getObj()
	{
		return obj;
	}
}
*/
//jdk1.5�Ժ󣬳��ַ��͡��������ֹ������������¡�
/*
�ù�������Ҫ����ʲô���͵Ķ���ȷ��������һ�����Ͳ�����
ʹ���ߣ�����ʲô�������ͣ���ô�����в����ľ���ʲô���͵Ķ���

ʲôʱ��ʹ�÷����ࣿ
�����в����������������Ͳ�ȷ����ʱ��
�Ϳ���ʹ�÷����ࡣ
*/
class Tool<Q>
{
	private Q obj;
	public void setObj(Q obj)
	{
		this.obj = obj;
	}
	public Q getObj()
	{
		return obj;
	}
}

class  GenericDemo03
{
	public static void main(String[] args) 
	{
		Tool<Student> t = new Tool<Student>();

		t.setObj(new Worker());//����ʧ�ܡ�
		Student s = t.getObj();//������ǿת���鷳

		//Tool t = new Tool();
		//t.setObj(new Worker());
		//Student s = (Student)t.getObj();
	}
}
