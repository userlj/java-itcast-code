
/*
�����������͵Ķ����װ�ࡣ

�������������ͱ���˶���
Ϊ�˶������Ĺ�����������Щ�����������͡�

byte	--> Byte
short	--> Short
int		--> Integer
long	--> Long
float	--> Float
double	--> Double
boolean	--> Boolean 
char	--> Character


��װ��Ĺ��ܣ�
ͨ�����ڻ����������ַ���֮���ת����

toBinrayString(num):��ȡһ�������Ķ����Ʊ�����ʽ��
Integer.toBinaryString(6);// 110;

int parseInt(numstr,radix)����ָ�����еı�����ʽת��ʮ���ơ�
Integer.parseInt("110",2);// 6

����Character���⡣
����7������parse������
XXX parseXXX(XXXstr);


�����������ֽ��ַ���ת�������ֵķ�ʽ.

static int parseInt(str):

new Integer(str).intValue();

*/
class IntegerDemo 
{
	public static void main(String[] args) 
	{

		Integer i1 = new Integer("123");
		Integer i2 = new Integer(123);

		System.out.println(i1==i2);//false ��ֵַ��ͬ��
		System.out.println(i1.equals(i2));//true Integer�Ƚϵ�����������Ƿ���ȡ�



		//��ν�һ���ַ���ת��һ�������أ�
		//�ڶ����ֽ���ת��ʱ�����뱣֤�����ָ�ʽ���ַ��������򣬻ᷢ�������ʽ�쳣NumberFormatException;
		Integer i = new Integer("234");
		int x = i.intValue();

		System.out.println(x+5);

		


		int num = Integer.parseInt("110",2);



		System.out.println(num+2);

		//Integer i = new Integer(6);
		


//		System.out.println(Integer.toBinaryString(6));
//		System.out.println(Integer.MAX_VALUE);

	}
}
