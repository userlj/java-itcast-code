/*
������ʽ

��ר�����ڲ����ַ����Ĺ���
��Щ������һЩ��������ɵġ�


���ܣ�
1��ƥ�䡣ʹ�õ���String���е�matches������


2���иʹ�õ�String��split������

3���滻��

4�����ҡ�
	1�����������ͨ��Pattern���е�static����complie����װ��Pattern����
	2��ͨ��Pattern����matcher�������ַ������������ȡƥ��������
	3��ͨ��ƥ�����ķ����������ַ������磺find�Ƿ��ҵ���groupȡȥƥ�����ַ�����



��ʵString�����й�������ʽ�ķ������ײ㶼���Ƚ��������������װ��Pattern����
Ȼ��ͨ��Pattern�����ȡMatcher�����ڵ���Matcher�ķ�����ɵġ�

*/
import java.util.regex.*;
import java.util.*;
import java.io.*;
class  RegexDemo
{
	public static void main(String[] args) throws IOException
	{
//		checkTel();
//		getWord();
//		splitStr();
//		replaceReg();

//		ipSort();
//		checkMail();

		getMail();
	}

	/*
	
	��ȡ�ļ��е�email��ַ��
	˼·��
	1����ȻҪ��ȡ��һ���ļ�����Ҫʹ���ַ�����FileReader��BufferedReader��
	2������һ�����ݣ��ͺ͹����������ȡ�������ַ��������е�email��ַ��
	3����email��ַ���д洢��

	*/
	public static void getMail()throws IOException
	{
		BufferedReader bufr = new BufferedReader(new FileReader("mail.txt"));
		
		String line = null;

		String mailreg = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";

		Pattern p = Pattern.compile(mailreg);

		

		while((line=bufr.readLine())!=null)
		{
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println(m.group());
			}

		}

	}


	
	public static void checkMail()
	{
		String  mail = "abc@sina.com.cn";

		String reg = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		
		//reg = "\\w+@\\w+(\\.\\w+)+";//����ʽУ�顣


		boolean b = mail.matches(reg);

		System.out.println("mail:"+b);
	}




	/*
	
	192.168.1.253 10.10.10.10 127.0.105.1 2.2.2.2 30.30.30.30
	����Щip��ַ����ip��ַ�ε�˳������

	*/

	public static void ipSort()
	{
		String ip = "192.168.1.253 10.10.10.10 127.0.105.1 2.2.2.2 30.30.30.30";

		//��㷽ʽ�����ǰ����ַ������ֵ�˳��Ƚϡ����Ǳ���Ҫ��֤ÿһ����ַ��λ������ͬ�ġ�
		//�����ڲ�����λ���ϲ��㣬���Ȱ����������������䡣

		ip = ip.replaceAll("(\\d+)","00$1");
		System.out.println(ip);//���ꡣ

		//�Բ���0��ip������ÿ�������λ�ı���
		ip = ip.replaceAll("0*(\\d{3})","$1");
		System.out.println(ip);//192.168.001.253 010.010.010.010 127.000.105.001 002.002.002.002 030.030.030.030

		//ͨ���ո�����и
		String[] arr = ip.split(" ");
		TreeSet<String> ts = new TreeSet<String>();
		
		for(String s: arr)
		{
			ts.add(s);
		}

		for(String s : ts)
		{
			System.out.println(s.replaceAll("0*([0-9]+)","$1"));
		}

	}

	//ʹ��ָ���ַ����滻���Ϲ�����ַ�����
	public static void replaceReg()
	{
		String str = "dfqqqghjzzkltpppyu";

		String s = str.replaceAll("(.)\\1+","$1");

		System.out.println(s);


	}


	//����ָ�������и��ַ�����
	public static void splitStr()
	{
		String str = "we.rw.er.ty";//

		str = "dfqqqghjzzkltpppyu";

		String reg = "\\.";//���� . ����������һ�������ַ������ֻ������ͨ�������ã�����Ҫת�塣
		
		reg = "(.)\\1+";// abzzzc
		String[] arr = str.split(reg);

		for(String s : arr)
		{
			System.out.println(s);
		}
	}




	/*
	��ȡ�ַ�����ָ���ĵ��ʡ�

	˼·��
	��Ҫ��ȡָ�����ʣ�ʹ��ƥ���ǲ����Եģ���Ϊ����Ҫ��Ľ������boolean�࣬���Ǻܶ൥���ַ�����

	��ʱ��Ҫʹ��������ʽ����Pattern��
	*/
	public static void getWord()
	{
		String str ="da jia ming tian fang jia le ,shuang!";

		String reg = "\\b[a-z]{4}\\b";
		
		//1,��������ʽ��װ��Pattern��ʹ��Pattern������ compile������
		Pattern p = Pattern.compile(reg);

		//2,�����������ַ������й�����ʹ�õ�matcher�������÷����᷵��һ��ƥ��������Matcher��
		Matcher  m = p.matcher(str);
		
		//3,ʹ��ƥ���������find����ȥ���Ƿ��з��Ϲ�������ݡ�ͨ��group��ȡ���ҵ����ַ�����
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

	//У��绰��
	public static void checkTel()
	{
		String tel = "15800190000";
		String telreg = "1[35]\\d{9}";

		System.out.println(tel.matches(telreg));



	}


	//��ʾ�����ʡ�
	public static void checkStr()
	{
		String str = "acccb";

		String strreg1 = "ac{3}b";//true
		String strreg2 = "ac*b";//true, * c����0�λ��߶�ζ����ԡ�
		String strreg3 = "ac?b";//false, ? ��ʾ c����1�λ���0�Ρ�
		String strreg4 = "ac+b";//true ��+ ��ʾ c����1�λ��߶�Ρ�
		System.out.println("str="+str.matches(strreg1));
		System.out.println("str="+str.matches(strreg2));
		System.out.println("str="+str.matches(strreg3));
		System.out.println("str="+str.matches(strreg4));
	}

	public static void checkQQByReg()
	{
		String qq = "12345678";
		String qqreg = "[1-9]\\d{4,14}";
		boolean b = qq.matches(qqreg);
		System.out.println("qq:"+b);

//		Pattern p = Pattern.compile(qqreg);
//		Matcher m = p.matcher(qq);
//		boolean b2 = m.macthes();
	}

	/*
	�ж�һ��QQ�ţ�Ҫ��5~15��������0��ͷ�����붼�����֡�
	*/

	public static void checkQQ(String qq)
	{
		

		int len = qq.length();

		if(len>=5 && len<=15)
		{
			if(!qq.startsWith("0"))
			{
				try
				{
					long num = Long.parseLong(qq);
					System.out.println(num);
				}
				catch (NumberFormatException e)
				{
					System.out.println("fifa qq");
				}
				
			}
			else
				System.out.println("no 0 start");
		}
		else
			System.out.println("qq len nono");
	}
}
