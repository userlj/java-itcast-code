/*
JDK1.5�汾���ֵ�����֮һ��
��ǿ��forѭ����

��ǿforѭ���ʹ�ͳforѭ����ʲô����

ͨ����ǿforѭ��ʹ��ʱ������Ҫ�б�������Ŀ�ꡣ

���飺�ڱ�������ʱ�����ǽ���ʹ�ô�ͳforѭ����
for
*/
import java.util.*;
class  ForeachDemo
{
	public static void main(String[] args) 
	{
		
		ArrayList<String> al = new ArrayList<String>();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");

		/*
		��ʽ��
		for(Ԫ������ ������ : �����Collection����)
		{
			ִ����䣻
		}
		*/
		for(String s : al)
		{
			System.out.println("foreach:"+s);
		}
		/*
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		/*
		for(Iterator<String> it = al.iterator(); it.hasNext(); )
		{
			
			System.out.println(it.next());
		}
		*/
		//foreach�������顣
		int[] arr = {4,1,7};
		for(int i : arr)
		{
			System.out.println("i="+i);
		}

		//foreach��α���map�أ�������ֱ�ӱ���map��Ҫ��map���ϱ��set���Ϻ󡣲ſ��Խ��б���

		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("01","lisi1");
		hm.put("02","lisi2");
		hm.put("03","lisi3");

		Set<String> keys = hm.keySet();
		for(String s : keys)
		{
			System.out.println(s+"="+hm.get(s));
		}
		//Set<Map.Entry<String,String>> entrys = hm.entrySet();
		//for(Map.Entry<String,String> me : entrys)

		for(Map.Entry<String,String> me : hm.entrySet())//����Set���ϡ�
		{
			System.out.println(me.getKey()+"=="+me.getValue());
		}
	}
}
