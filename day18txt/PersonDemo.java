/*
BuffereReader�ĳ�����Ϊ�����Reader��Ч�ʡ�
��read������������ǿ��

��ʵ������õ���һ�����ģʽ��װ�����ģʽ��

�����еĶ���Ĺ��ܽ�����ǿ��



װ�κͼ̳���ʲô�����أ�


Writer	
	|--FileWriter
		|--BufferedFileWriter��
	|--DataWriter
		|--BufferedDataWriter��
	|--MediaWriter
		|--BufferedMediaWriter.


��Ȼ�������������ܶ�����Բ���ָ�����ݣ�����Ч���е�͡�
��ô����ʱ����Ҫ���һ�²���Ч�ʣ��뵽�˻��弼����

��Ҫ���FileWriter����Ч�ʡ�ֻ��Ҫ����һ��FileWriter���������
����дwrite���������뻺��������ɡ�

���ڽ����ļ̳���ϵ�Ѿ����Խ���ʹ�á�

����һЩС���⣺����ÿһ�����������ʵ���ܶ�����ͬ�ġ�
ֻ�Ǹ�ÿһ��������뻺�弼����
��������ƣ�������ϵ��ĺ�ӷ�ס�

�Ż���
���Խ����弼��������ȡ���з�װ��
Ҫ������˭��˭�ͻ�����������ɡ�
��������Ƶ������ϵ���ļ򵥡�
�������������û����չ�ԡ�
���Writer�������µ����ࡣ
��ô��Ҫ��BufferedWriter�м����޸ģ����һ���µĹ��캯����

BufferedWriter��

class BufferedWriter
{
	BufferedWriter(FileWriter fw)
	{
		
	}
	BufferedWriter(DataWriter fw)
	{
		
	}
	BufferedWriter(MediaWriter fw)
	{
		
	}
}


������ʱ���������ö�̬�����ԡ�
class BufferedWriter
{
	private Writer w;
	BufferedWrier(Writer w)
	{
		this.w = w;
	}
	public void write()
	{}
}

��Ȼ����װ�����ã����������Ǿ��й�����ϵ�еĹ��ܡ�

��ôBufferedWriter����Writer�е�һԱ����ϵ���¡�

Writer
	|--FileWriter
	|--DataWriter
	|--MediaWriter
	|--BufferedWriter

�����ϵ��Ծ���ܶ࣬��ԭ����ϵ�����Ż�����ʵ���Ƕ��������Ĺ��ܽ�����ǿ��
��ô�����Ʒ�ʽ������֣�װ�����ģʽ��


*/
class Person
{
	void chifan()
	{
		System.out.println("chifan");
	}
}

/*
Ϊ�˲����ı�ԭ�еĴ��롣
��Ҫ��ǿchifan���ܡ�
��ô�Ͷ���һ���࣬��ԭ�ж������װ�Ρ�

*/
class NewPerson
{
	private Person p;
	NewPerson(Person p)
	{
		this.p = p;
	}
	public void newChifan()
	{
		System.out.println("��һ��");
		p.chifan();
		System.out.println("������");
	}
}




class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		
		//NewPerson np = new NewPerson(p);
		//np.newChifan();

		p.chifan();
	}
}
