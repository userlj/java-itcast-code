/*
�����ֵ���Ϸ
1������һ���������
2����ȡ����¼�����ݣ���ת����һ��������
3�����бȽϡ��ظ��ù��̡�

*/
import java.io.*;
import java.util.*;
class  GuessNumber
{

	private int ranNumber;
	GuessNumber()
	{
		Random r = new Random();
		ranNumber = r.nextInt(100)+1;
	}

	/**
	��������Ϸ.
	*/
	public  void play()
	{
		boolean b = false;

		System.out.println("��Ϸ��ʼ��������1~100֮������֣�");
		while(!b)
		{
			try
			{
				int num = getNumber();
				if(num>=1&& num<=100)
					b = compare(num);
				else
					System.out.println("��������ֳ�����Χ,���������룺");

			}
			catch (IOException e)
			{
				System.out.println(e.toString());
				return ;
			}
			catch (NumberFormatException e )
			{
				System.out.println("�������˷Ƿ����ݣ�����������:");
			}
			
		}
	}

	/*
	��ȡ����¼�����ݡ�
	*/
	private int getNumber()throws IOException,NumberFormatException
	{
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));

		String line = bufr.readLine();
		return Integer.parseInt(line);
	}

	/*
	�������ݱȽϵķ�����
	*/
	private boolean compare(int num)
	{
		boolean b = false;
		if(num>ranNumber)
			System.out.println("���ˣ�����");		
		else if(num<ranNumber)
			System.out.println("С�ˣ�����");
		else
		{
			System.out.println("���ˣ���ϲ");
			b = true;
		}
		return b;		
	}


	public static void main(String[] args) 
	{
		new GuessNumber().play();
	}
}
