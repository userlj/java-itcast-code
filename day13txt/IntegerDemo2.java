/*
JDK1.5�汾���ֵ������ԡ�
�Զ�װ����䡣


*/
class  IntegerDemo2
{
	public static void main(String[] args) 
	{
		//Integer i = new Integer(4);

		//Integer a = null;//Integer a = new Integer(4);//�Զ�װ�䡣
		
		//a = a + 3; //�Զ����䡣a.intValue() + 3;


		//��ʹ���Զ�װ��ʱ�����������byte��Χ�ڣ��Ͳ��Ὺ���µĿռ䡣
		Integer x = 127;
		Integer y = 127;
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		System.outl.println(a==b);//false
		System.out.println(x==y);//true; ���⡣
		System.out.println(x.equals(y));//true

	}
}

