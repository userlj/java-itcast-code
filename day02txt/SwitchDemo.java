class  SwitchDemo
{
	public static void main(String[] args) 
	{

		int x = 4;

		switch(x)//byte, short, int ,char
		{
			default:
				System.out.println("d");
				break;
			case 1:
				System.out.println("c");
				break;

			case 3:
				System.out.println("a");
				break;
			
			case 2:
				System.out.println("b");
				break;		
			
		}


		int a = 4, b = 2;

		//�������޵�ֵ�����жϣ�ʹ��switch��������ʾ����Ŷ�ˡ�
		char ch = '+';
		switch(ch)
		{
			case '+':
				System.out.println(a+b);
			break;

			case '-':
				System.out.println(a-b);
			break;

			case '*':
				System.out.println(a*b);
			break;

			case '/':
				System.out.println(a/b);
			break;
			default:
				System.out.println("�޷�����");
			
		}


	}
}
