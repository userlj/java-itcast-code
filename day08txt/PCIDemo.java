/*

��������һ�����壬
�Ѿ�����ʹ�á�

������Ҫ�����֣�װһ��������


��ν���������
�������塣

��Ҫʹ�ú��ڳ��ֵ�һЩ�忨��ǰ����Ҫ����һ������
ֻҪ�Ƿ����˸ù���İ忨�������Ա�������ʹ�á�

PCI����һ�����ڳ��ְ忨���Ա�����ʹ�ù���
PCI�ĳ�����չ������Ĺ��ܡ�
PCI�ĳ��ֽ�����������������ܰ忨��ź���ԡ�



*/

interface PCI
{
	void open();
	void close();
}
class MainBoard 
{
	void usePCI(PCI p)//PCI p = new SoundCard();
	{
		p.open();
		p.close();		
	}
	void run()
	{
		System.out.println("��������");
	}
}


class SoundCard  implements PCI
{
	public void open()
	{
		System.out.println("sound open");
	}
	public void close()
	{
		System.out.println("sound close");
	}
}


class NetCard implements PCI
{
	public void open()
	{
		System.out.println("net open");
	}
	public void close()
	{
		System.out.println("net close");
	}
}

class  PCIDemo
{
	public static void main(String[] args) 
	{
		MainBoard mb = new MainBoard();
		mb.run();
		mb.usePCI(new SoundCard());
		mb.usePCI(new NetCard());

	}
}
