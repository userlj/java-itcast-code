
/*
��ʾDate����
*/
import java.util.*;
import java.text.*;
class  DateDemo
{
	public static void main(String[] args) 
	{
		
		Date d = new Date();
		System.out.println(d);//Fri Oct 15 10:22:56 CST 2010

		//������ʱ�����������������
		//��Ҫָ��һ����ʽ����ʾʱ�䡣
		/*
		����ʽ���õ�date�����ϡ�
		���裺
		1���Ƚ���ʽ��װ��DateFormat������SimpleDateFormat�����С�
		2��ʹ��format��ʽ��������ʽdate����(����ʽ���õ�date������)

		*/

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��EE hh:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);

	}
}
