import java.net.*;

/*


udpЭ�飺
1�����������ӡ�
2�����ɿ�Э�飬���׶�����
3���ٶȿ졣
4������������ƣ�64k���ڡ�

ͨ�������죬������Ƶ���貨��




����һ��upd�ķ��Ͷˡ�
���ڷ������ݡ�

1,����updsocket����
2�������ݷ�װ�����ݰ���
3��ͨ��socket�����send�����������ݰ�������
4���ر���Դ��
*/

class  SendDemo
{
	public static void main(String[] args) throws Exception
	{

		//1,����udpsocket����
		DatagramSocket ds = new DatagramSocket();

		//2,�����ݷ�װ�����ݰ���Ҫʹ��DatagramPacket����
		//2.1�Ƚ�Ҫ���͵����ݱ���ֽ����顣��ָ�����͵�Ŀ�ĵغͶ˿ڡ�
		//2.2����Щ��Ϣ��Ϊ�������ݸ����ݰ�����Ĺ��캯����

		byte[] buf = "������յ���������Ϣ����ϲ�㣬�����ȥ�Է��ˡ�".getBytes();


		InetAddress ip = InetAddress.getByName("192.168.1.255");

		DatagramPacket dp = new DatagramPacket(buf,buf.length,ip,9527);
		while(true)
		{
		//3,ʹ��Socket�����send���������ݰ����ͳ�ȥ��
		ds.send(dp);
		}

		//4,�ر���Դ��
		//ds.close();


	}
}



/*
����udp�Ľ��նˡ�

1������udp���ն˷��񣬱���Ҫ����һ���˿ڣ���ΪҪ��ȷ���ĸ��˿������������ɸ�Ӧ�ó���������ġ�
2������һ���յ����ݰ������ڴ洢���յ����ݣ�
	���ֽ����ݴ洢�����ݰ������У�����ʹ�����ݰ�����ķ�����ȡ��ͬ��������Ϣ��
3��ʹ��Socket�����receive���������յ������ݴ洢�����ݰ��С�
4��ͨ�����ݰ��ķ�����ȡָ��������Ϣ��
5���ر���Դ��

*/
class ReceDemo
{
	public static void main(String[] args)throws Exception
	{
		//1,����updsocket���񣬼���һ���˿ڡ�
		DatagramSocket ds = new DatagramSocket(9527);

		while(true)
		{
		//2,����һ��ִ�д�С�����ݰ������ڴ洢���ݣ��Ա��ȡ��
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);

		//3,ʹ��socket��receive���������ݴ洢�����ݰ��С�
		ds.receive(dp);

		//4,ͨ�����ݰ�����ķ�����ȡ���е����ݡ�
		String ip = dp.getAddress().getHostAddress();

		String data = new String(dp.getData(),0,dp.getLength());

		int port = dp.getPort();

		System.out.println(ip+":"+data+"::"+port);
		}
		//5,�ر���Դ��
		//ds.close();


	}
}