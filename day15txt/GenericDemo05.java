/*
��̬����������ʹ�����ж���ķ��͡�
��Ϊ���еķ�����Ҫ�ڶ����ʼ����ʱ��ָ���������͡�
����̬�����������ڡ�

�ھ�̬�����϶��巺�ͣ�һ��Ҫд��static�ؼ��ֵĺ��档
����ֵ���͵�ǰ�ߡ�

*/
class Utils
{
	
	 static <Z> void method(Z z)
	{
		System.out.println("method:"+z);	
	}
}


class  GenericDemo05
{
	public static void main(String[] args) 
	{
		Utils.method("haha");
		Utils.method(123);
	}
}
