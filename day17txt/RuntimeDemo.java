/*
Runtime��û�й��췽���ṩ��
˵�����಻����ֱ��ʵ������

�������л��зǾ�̬�ķ���������Ҫ��������òſ���ִ�еġ�
��ô������һ���о�̬�����ر������ķ�����

�÷�������getRuntime();
*/

class RuntimeDemo 
{
	public static void main(String[] args) throws Exception
	{
		//��ȡRuntime����ͨ��getRuntime��̬��ȡ��
		Runtime r = Runtime.getRuntime();

		//Process p = r.exec("winmine.exe");//��ʵ�ҵ���Path·���µ�Ŀ¼��

		r.exec("notepad.exe SystemDemo.java");//��һ�����򲢹���һ�������øó���������ļ���


		//Thread.sleep(8000);
		//p.destroy();
	}
}

/*
//�������ģʽ��
class Demo
{
	private static Demo d = new Demo();
	private Demo(){}
	void show(){}

	static Demo getInstance()
	{
		return d;
	}
}
*/