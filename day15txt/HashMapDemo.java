/*
Map���ϡ�

Map���ϵ��ص㣺
1��һ�δ���һ��Ԫ�أ����Լ�ֵ�Ե���ʽ���ڡ�����ֵ֮�������ӳ���ϵ��
2��һ��Ҫ��֤����Ψһ�ԡ�
Map
	|--HashMap:�ײ��ǹ�ϣ�����ݽṹ���߳��ǲ�ͬ���ģ����Գ���null����nullֵ��
	|--Hashtable���ײ��ǹ�ϣ�����ݽṹ���߳���ͬ���ģ������Գ���null����nullֵ����HashMap�����
	|--TreeMap�����Զ�map�����еļ���������

Map.Entry:�ӿ��еĽӿڣ��Ǽ�ֵӳ���ϵ�����͡�

*/
import java.util.*;
class  HashMapDemo
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();

		//1�����Ԫ�ء�put��
		hm.put(1,"lisi1");
		hm.put(2,"lisi2");
		hm.put(3,"lisi3");
		hm.put(4,"lisi4");

		System.out.println(hm.get(20));

		//ȡ��Map�����е�Ԫ�ء�ԭ����map����ת��set���ϡ�Ȼ����ʹ�õ�����ȡ����

		//ͨ��valuesȡ������ֵ��
		Collection<String> coll= hm.values();
		Iterator<String> it = coll.iterator();
		while(it.hasNext())
		{
			String value = it.next();
			System.out.println("value:"+value);
		}

		for(String str:coll){
			System.out.println("str:"+str);
		}


		//ʹ��entrySet��������ɡ�
		/*
		Set<Map.Entry<Integer,String>> entrySet = hm.entrySet();

		Iterator<Map.Entry<Integer,String>> it = entrySet.iterator();

		while(it.hasNext())
		{
			Map.Entry<Integer,String> me = it.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"::"+value);

		}
		*/

		//ʹ��keySet��������ɡ�
		/*
		Set<Integer> keySet = hm.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext())
		{
			Integer i = it.next();
			String value = hm.get(i);
			System.out.println("key="+i+",,value="+value);
		}
		*/



		/*
		//����������ͬ�ļ�����ô��ֵ���滻��ֵ�����������ͬ��put��������null��
		System.out.println(hm.put(5,"haha"));

		//2���жϡ�
		System.out.println(hm.containsKey(20));
		System.out.println(hm.containsValue("haha1"));


		//3,ɾ����remove(key);
		System.out.println(hm.remove(2));
		System.out.println(hm);
		*/

		//new Demo().show();
	}
}


interface MyMap
{
	public static interface MyEntry
	{
		void show();

	}
}

class Demo implements MyMap.MyEntry
{
	public void show()
	{
		System.out.println("my map.entry");
	}
}
