import java.util.*;
/*
��ʾbinarySearch��
�÷�������֮����
��Ԫ�ز����ڵ�ʱ�򣬷��ص��Ǹ�Ԫ���ڼ����е�  -(����λ��+1)
*/
class  CollectionsDemo3
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("cccc");
		al.add("abcde");
		al.add("aa");
		al.add("abc");
		al.add("abc");
		
		System.out.println("ԭ���ϣ�"+al);
		//ʹ�ü��ϵĶ��ֲ��Ҷ�Ԫ�ؽ���λ�õĻ�ȡ��ǰ�᣺����Ҫ�Ƕ�����ļ��ϡ�

		//��Ĭ�Ϸ�ʽ������Ȼ˳��
//		Collections.sort(al,new StrCompareByLen());
//
//		System.out.println("�����"+al);
//
//		int index = Collections.binarySearch(al,"ccccc",new StrCompareByLen());
//		System.out.println("index="+index);


		//fill�����������������е�Ԫ���滻��ָ��Ԫ�ء�
		//Collections.fill(al,"zz");
		//System.out.println("fill:"+al);

		//replaceAll:
		//Collections.replaceAll(al,"aa","qq");
		//System.out.println("replaceAll:"+al);

		//reverse();��ת����Ԫ�ء�ͨ��swap��������ʾ������reverse��ʵ����ʵ����ͷβԪ�صĻ�����
//		Collections.reverse(al);
//		System.out.println("reverse:"+al);

		//swap():��list�����е�Ԫ�ؽ��л�λ��
		Collections.swap(al,0,2);
		System.out.println("swap:"+al);
	}
}
