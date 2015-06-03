/*

ԭ��ϵ��
House
	|--PingFang
	|--LouFang
�¼���

���۽�ƽ���������԰����ŷʽ�����Ƕ�ƽ��һ��װ�ޡ�
����װ��Ҳ������¥����

���ֽ���װ�޶���ã���Ҫ��ʲô���ӽ��и�װ�ޣ����뼴�ɡ�
House
	|--PingFang
	|--LouFang
	|--TianYuan
	|--OuShi
	
�����ʹ����װ�����ģʽ����ϵ��

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


class LouFang extends House
{
	public void show()
	{
		System.out.println("¥��");
	}
}


class TianYuan extends House
{

	private House h;
	TianYuan(House h)
	{
		this.h = h;
	}
	public void show()
	{
		System.out.println("��԰���");
	}

	public void showTianYuan()
	{
		h.show();
		this.show();
	}

}


class OuShi extends House
{
	private House h;
	OuShi(House h)
	{
		this.h = h;
	}
	public void show()
	{
		System.out.println("ŷʽ���");
	}

	public void showOuShi()
	{
		h.show();
		this.show();
	}

}

class  HouseDemo2
{
	public static void main(String[] args) 
	{
		PingFang p = new PingFang();
		LouFang l = new LouFang();

		OuShi o = new OuShi(new TianYuan(p));
		o.showOuShi();

		//TianYuan t = new TianYuan(l);
		//t.showTianYuan();

		//OuShi o = new OuShi(l);
		//o.showOuShi();

		
	}
}
