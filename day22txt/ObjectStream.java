import java.io.*;


/*
ObjectInputStream

ObjectOutputStream

����ֱ�Ӳ������������

������ɶ���־û��洢��


����̬���εĳ�Ա�����ǲ��ᱻ���л��ġ�

transient:�����ó�Ա�����������л���


���л��ӿ��Ǹ��ඨ��һ��UID.�������һ����ʶ��
�������ʶ��ͨ���������л���Ա������ǩ�����������һ��long��ֵ��

ֻҪ�����л��ĳ�Ա�иı䣬��ô��UID�ͻ�ı䡣

��ôͨ��ԭ��class�ļ����ɵĶ��󱻳־û���

class�ļ������ñ�������µ�UID�ǣ�ȡ��ԭ���ĳ־û�����ͻᷢ��InvalidClassException��


��Ȼ����ͨ���ֶ�����ʽ������ָ��UID������jvm�Ͳ����ڸ������UID��

���Ը������������ñ䣬UID����ͬһ����






*/


class ObjectStream 
{
	public static void main(String[] args) throws IOException,ClassNotFoundException
	{
		//writeObj();

		readObj();
	}

	public static void readObj()throws IOException,ClassNotFoundException
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));

		Student stu = (Student)ois.readObject();
		Student stu1 = (Student)ois.readObject();

		System.out.println(stu.getName()+"::"+stu.getAge());
		System.out.println(stu1.getName()+"::"+stu1.getAge());

		ois.close();
	}

	public static void writeObj()throws IOException
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));

		Student stu = new Student("lisi",99);
		Student stu1 = new Student("wangwu",49);

		oos.writeObject(stu);
		oos.writeObject(stu1);

		oos.close();
	}
}

