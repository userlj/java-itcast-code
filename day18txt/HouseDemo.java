/*
���ӣ�ƽ����¥����

House
	|--PingFang
	|--LouFang


׼���Է��ӽ���װ�ޡ�

	1����ƽ��������԰���ʽ�Ĵ��졣
	2����¥������ŷʽ���Ĵ��졣
�����ü̳еķ�ʽ����ɡ�
House
	|--PingFang
		|--TianYuanPingFang
	|--LouFang
		|--OuShiLouFang

	
����ϵ���е�ӷ�ף���Ϊ��ƽ����Ҫ�ĳ�ŷʽʱ����Ҫ�������ࡣ

׼���Ż�һ�¸���ϵ��
�뿴�¼���
HouseDemo2.java

*/
abstract class House
{
	abstract void show();
}

class PingFang extends House
{
	public void show()
	{
		System.out.println("ƽ��");
	}
}

class TianYuanPingFang extends PingFang
{
	public void showTianYuan()
	{
		super.show();
		System.out.println("��԰���");
	}
}

class LouFang extends House
{
	public void show()
	{
		System.out.println("¥��");
	}
}
class OuShiLouFang extends LouFang
{
	public void showOuShi()
	{
		super.show();
		System.out.println("ŷʽ���");
	}
}



class  HouseDemo
{
	public static void main(String[] args) 
	{
		PingFang p = new PingFang();
		///p.show();

		TianYuanPingFang t = new TianYuanPingFang();
		t.showTianYuan();


		LouFang l = new LouFang();
		//l.show();
		OuShiLouFang o = new OuShiLouFang();
		o.showOuShi();
	}
}
