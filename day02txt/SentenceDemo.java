/*
1����ȡ1~100֮��6�ı����ĸ�����
2��3000�����ӣ�ÿ���һ�룬�ʣ����������ӻ�С��5�ף�


int x = 1;
for(System.out.println("a");x<3; System.out.println("c"))
{
	System.out.println("d");
	x++;
}


boolean b = true;
if(b=false)
	System.out.println("a");
else if(b)
	System.out.println("b");
else if(!b)
	System.out.println("c");
else
	System.out.println("d");


int x = 3;
switch(x)
{
	default:
		x+=3;
	case 1:
		x+=4;
	case 2:
		x+=5;
}
System.out.println("x="+x);



int x = 1,y = 1;

if(x++==2 && ++y==2)
{
	x = 5;
}
System.out.println("x="+x+",y="+y);


------------------------------
int x = 1,y = 1;

if(++x==2 | y++==2)
{
	x = 5;
}
System.out.println("x="+x+",y="+y);


*/



class  SentenceDemo
{
	public static void main(String[] args) 
	{

		//1����ȡ1~100֮��6�ı����ĸ�����
		/*
		˼·��
		1������1~100��Щ����ʹ��for��䣬��Ϊ������ֻΪѭ�����ڡ�
		2���ڱ����Ĺ������޶�������
		3���������������ģ�Ҫ���м�������ʵ����һ��������������
		
		��ʵ����Ǽ�����˼�롣

		*/

		int count = 0;

		for(int x=1; x<=100; x++)
		{
			if(x%6==0)
				count++;
		}
		System.out.println("count="+count);


		//2��3000�����ӣ�ÿ���һ�룬�ʣ����������ӻ�С��5�ף�
		
		int day = 0;
		for(int x=3000; x>=5; x/=2)
		{
			day++;
		}
		/*
		for(int x=3000; x>=5; day++)
		{
			x/=2;
		}
		*/
		System.out.println("day="+day);


		int y = 1;
		for(System.out.println("a");y<3; System.out.println("c"))
		{
			System.out.println("d");
			y++;
		}

		//a,d,c,d,

	}
}

