import java.util.*;

class  CalendarDemo
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		
		c.set(2012,0,1);

		//c.add(Calendar.YEAR,-2);//��ָ����ʱ������е������ʱ������ƫ�ơ�
		c.add(Calendar.DAY_OF_MONTH,-1);


		//System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");

		getDays(2015);
	}
	/*
	���幦�ܣ���ȡָ����Ķ����ж����졣
	˼·�����ǽ������3��1����ǰһ�졣���Ƕ��µ����һ�졣

	*/
	public static void getDays(int year)
	{
		Calendar c = Calendar.getInstance();

		c.set(year,2,1);
		c.add(Calendar.DAY_OF_MONTH,-1);

		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");
	}

}
