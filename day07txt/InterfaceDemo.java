/*abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();

}
*/
//�ӿڿ������Ϊ��һ������ĳ����ࡣ
//�ӿ��еķ������ǳ���ġ�
//�ӿڿ��Զ���ı�����һ��������

/*
һ������븲�ǽӿ������еĳ��󷽷��󣬲ſ��Ա�ʵ���������򣬸�����һ�������ࡣ


java�в�֧�ֶ�̳У����Ǳ����˶�̳л��ƣ�ͨ����ʵ�ֵķ�ʽ�����֡�

��java�еĽӿ��ǿ��Զ�̳еġ�




ͨ�������������˵���ӿڵ��ص㣺
1���ӿ��ǹ��ܵ���չ��
2���ӿ���ʵ���Ƕ��Ⱪ¶�Ĺ���
3��������ź���ԡ�
4��һ����̳���һ�����ͬʱ����ʵ�ֶ���ӿڡ�//ͨ��ѧԱ��ĳ��̽ӿ�ʾ����ʾ��
	class Wangwu extends XuYuan implments ChouYan,HeJiu
	{
		public void ѧϰ����(){}
		public void smoke(){}
		public void jiu(){}
	}

*/
interface AbsDemo
{
	public static final int x = 3;
	public abstract void show1();
	public abstract void show2();
}

interface A
{
	void show4();
}

interface AbsDemo1 extends AbsDemo,A
{
	public void show3();
}

class SubDemo implements AbsDemo//,AbsDemo1
{
	public void show1(){}
	public void show2(){}
	public void show3(){}
	public void show4(){}
}


class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		SubDemo s = new SubDemo();
		System.out.println(s.x);
		System.out.println(SubDemo.x);
		System.out.println(AbsDemo.x);
	}
}
