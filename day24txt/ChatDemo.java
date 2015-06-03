/*
����
����һ��dos����������

1������������������������պͷ��͡�
2�����պͷ��Ͷ���Ҫͬʱ���С����ʹ�õ��˶��̼߳�����
	һ���߳̿��ƽ��գ�һ���߳̿��Ʒ��͡�
3����ȻҪ����Ⱥ�ġ���ô��Ҫʹ��socket���������������ʹ��Udp��ɡ�


*/

import java.net.*;
import java.io.*;

class ChatSend implements Runnable
{
	private DatagramSocket ds;
	ChatSend(DatagramSocket ds)
	{
		this.ds = ds;
	}
	public void run()
	{
		BufferedReader bufr = null;
		try
		{
			bufr = new BufferedReader(new InputStreamReader(System.in));

			String line = null;

			while((line=bufr.readLine())!=null)
			{
				if("886".equals(line))
					break;

				byte[] buf = line.getBytes();

				DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.255"),9002);

				ds.send(dp);
			}

			ds.close();
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}


class ChatRece implements Runnable
{
	private DatagramSocket ds;
	ChatRece(DatagramSocket ds)
	{
		this.ds = ds;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf,buf.length);

				ds.receive(dp);

				String ip = dp.getAddress().getHostAddress();
				String data = new String(dp.getData(),0,dp.getLength());

				System.out.println(ip+"::"+data);
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
		}
	}
}

class  ChatDemo
{
	public static void main(String[] args) throws Exception
	{

		DatagramSocket send = new DatagramSocket();
		DatagramSocket rece = new DatagramSocket(9002);

		new Thread(new ChatSend(send)).start();
		new Thread(new ChatRece(rece)).start();


	}
}
