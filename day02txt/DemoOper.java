class  DemoOper
{
	public static void main(String[] args) 
	{

		//int x = 3260;

		//x = x/1000*1000;


		//���� ++
		int a,b ;

		a = 4;
		//b = a++;//a = a+ 1;
		b = ++a;

		//��ֵ����
		
		int x = 3;

		x += 4;//x = x + 4;


		short s = 2;

		//s += 3;
		//s  = s + 2;

		System.out.println("s="+s);
//		System.out.println("a="+a+",b="+b);

		System.out.println(3!=4);

		

		int y = 4;

		//y>3 & y<6 = true;

		//&����
		true & true = true;
		true & false = false;
		false & true = false;
		false & false = false;

		//�ܽ�:ֻ�����߶�Ϊtrue�����Ϊtrue����Ϊfalse��

		// | ����
		true | true = true;
		true | false = true;
		false | true = true;
		false | false = false;

		//�ܽ᣺����ֻҪ��һ��true�������true�������߽����Ϊfalse�ǽ����false��

		// ^ ����
		true ^ true = false;
		true ^ false = true;
		false ^ true = true;
		false ^ false = false;

		//�ܽ᣺������ͬʱ�����Ϊfalse������Ϊtrue��




		y>3 & y<6 = true;
		y>3 && y<6 = true;

		y>5 & y<7 = false;
		y>5 && y<7 = false ;//�����Ϊfalseʱ���ұ߲����㡣��&ʱ���������߶����㣬˫&ʱ�����Ϊfalse���ұ߲����㡣
														 //��|ʱ���������߶����㣬˫|ʱ�����Ϊtrue���ұ߲����㡣
							
			



	}
}
