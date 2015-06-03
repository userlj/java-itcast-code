/*
Collection
	|--List:�б��е�Ԫ�ض��нǱꡣ����Ԫ��������ġ������ظ���
		|--ArrayList���ײ�ʹ�õ��������ݽṹ���ǲ�ͬ���ġ���ɾ���������ǲ�ѯ�ܿ졣
		|--LinkedList:�ײ����������ݽṹ����ɾ���ٶȺܿ졣��ѯ������
		|--Vector���ײ�ʹ�õ��������ݽṹ����ͬ���ġ���ArrayList�����������ɾ���ǲ�ѯ����������

	|--Set:Ԫ���ǲ������ظ�������Ԫ��������ġ�


��ʾ����ʾ����List�ӿ��е����з�����
����ͨ���Ǳ����Ԫ�صķ�����

*/
import java.util.*;
class  ArrayListDemo2
{
	public static void main(String[] args) 
	{

		ArrayList al = new ArrayList();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");

		System.out.println(al);
		System.out.println("-----------------------");
		//1,��ָ��λ�����Ԫ�ء�
		al.add(1,"haha");

		//2,�޸�ָ��λ�õ�Ԫ�ء�
		al.set(2,"qq");

		//3��ɾ��ָ��λ�õ�Ԫ�ء�
		al.remove(0);

		//4����ȡָ��Ԫ�ص�λ�á�
		int index = al.indexOf("qq");
		System.out.println("index="+index);

		//5,��ȡ���б�
		List ll = al.subList(1,2);
		System.out.println("ll:"+ll);


		//6,��ȡԪ�ء�
		for(int x=0; x<al.size(); x++)
		{
			System.out.println("get("+x+"):"+al.get(x));
		}


		System.out.println(al);

		
	}
}
