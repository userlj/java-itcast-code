/*
ʲôʱ��ʹ��Map�����أ�
�������Ƕ���������ӳ���ϵʱ�������ȿ���map���ϡ�


"zxcvbnxzcvbzxc"
��ȡ���ַ�����ÿһ����ĸ���ֵĸ�����a(2)b(3)....

˼·��
1�����ַ�������ַ�����
2�����������飬���������е��ַ���Ϊ��ȥ��map���ϡ���ȡ���Ӧ��ֵ��
	�����ֵΪnull����ô˵������ĸ��������map�����У���ô�ͽ�����ĸ��1���뼯�ϣ���ʾ����ĸ����1�Ρ�
	���ֵ��Ϊnull����ô����ֵȡ���󣬽���������������ĸ���������ֵ���´���map���ϣ�������ֵ�Ḳ�Ǿ�ֵ��
3��������map�����д���ľ���ÿһ����ĸ��Ӧ�Ĵ�����
4��������map���ɡ�

*/
import java.util.*;
class  CharCount
{
	public static void main(String[] args) 
	{
		String s = getCharCount("zxcvbnxzcvbzxc");
		System.out.println(s);//b(2)c(3)n(1)v(2)x(3)z(3)
	}

	public static String getCharCount(String str)
	{
		char[] chs = str.toCharArray();
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		int count = 0;
		for(int x=0; x<chs.length; x++)
		{
			Integer value = tm.get(chs[x]);//����ĸ��Ϊ����ȡ��Ӧ��ֵ��
			if(value!=null)//���ֵ���ڣ���count��¼������count���������ֵ�����ڡ�ֻ��count�������ɡ�
			{
				count = value;
			}
			count++;

			tm.put(chs[x],count);
			count = 0;
		}

		//System.out.println(tm);//{b=2, c=3, n=1, v=2, x=3, z=3}

		StringBuilder sb = new StringBuilder();

		Set<Character> keys = tm.keySet();
		Iterator<Character> it = keys.iterator();
		while(it.hasNext())
		{
			Character ch = it.next();
			Integer i = tm.get(ch);
			sb.append(ch+"("+i+")");
		}

		return sb.toString();

	}
}
