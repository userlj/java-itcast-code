import java.io.*;

/*
ByteArrayInputStream
ByteArrayOutputStream

������������Ӧ���豸�����ڴ档

��ʵ���Ƿ�װ���ֽ����顣��δ���õײ���Դ�����Զ�д����û���쳣�׳���Ҳ���ùرա�

��Ȼ�ǲ������飬ֱ����forѭ�����Զ���ָ�벻�Ϳ�������

Ҫ��ȷ���������е����ݣ���ʵ����ֻ�����֣�һ������һ����ȡ������Ƕ����ݵĶ�д������

��������������ĳ��֣���������з�װ������ֱ����IO���Ķ�д˼��������顣



CharArrayReader CharArrayWriter


��Щֱ�Ӳ��������ݵ���������ص㣺
���ڶ�ȡ�����ڳ�ʼ����ʱ�򣬶���Ҫ������Դ��
ByteArrayInputStream��Ҫ�ڹ����Ǵ���һ���ֽ���������Դ��
CharArrayReader��Ҫ�ڹ����Ǵ���һ���ַ���������Դ��

�����ǵ�������п��Բ���Ҫ�����������Ϊ����������ڲ����ֱ��װ�˿��Ա䳤�ȵ��ֽڻ����ַ����顣


*/
class  ByteArrayStream
{
	public static void main(String[] args) 
	{
		
		//��������Դ���ڴ档
		ByteArrayInputStream bis  = new ByteArrayInputStream("abcde".getBytes());


		//����Ŀ��,�ڴ档
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		int ch = 0;
		while((ch=bis.read())!=-1)
		{
			bos.write(ch);
		}

		System.out.println(bos.toString());
	}
}
