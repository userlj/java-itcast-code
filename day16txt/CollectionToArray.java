/*
���ϱ�����顣
ʹ�õ�Collection�ķ���toArray();


*/
import java.util.*;
class  CollectionToArray
{
	public static void main(String[] args) 
	{

		ArrayList<String> al = new ArrayList<String>();

		al.add("a1");
		al.add("a2");
		al.add("a3");
		al.add("a4");


		/*
		���Ը�toArray��������һ��ָ�����͵����鼴�ɡ�
		���Ǹ����鵽�׶���೤�أ�
		�������ĳ���С���˼��ϵ�size����ôtoArray�������Զ��½�һ�����飬������Ϊ���ϵ�size��
		������ȴ��ڼ��ϵ�size�����Ը�����Ϊ����

		�ɴ˵ó����ۣ�����Ƕ���һ�����Ⱥͼ���sizeһ�µ����顣

		*/
		String[] arr = al.toArray(new String[al.size()]);
		System.out.println(Arrays.toString(arr));
	}
}
