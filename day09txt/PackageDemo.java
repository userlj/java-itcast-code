/*
�����ļ�ϵͳ�ж�Ӧ�ľ����ļ��С�
���ã�
1��������з������
2�������ṩ�˶�������ռ䡣

�ô����������ļ�class����Դ�ļ�java����롣


���ڳ����е����֣�ͨ��package�ؼ��������塣
*/


/*


������һ����packa�е�DemoA�ࡣ



��һ����ʾ��
PackageDemo.java:24: �Ҳ�������
���ţ� �� DemoA
λ�ã� �� mypack.PackageDemo
                DemoA d = new DemoA();
                ^
PackageDemo.java:24: �Ҳ�������
���ţ� �� DemoA
λ�ã� �� mypack.PackageDemo
                DemoA d = new DemoA();
                              ^
2 ����

ԭ�򣺱����õ�DemoA�������д����Ϊ�ǰ���.������packa.DemoA

--------------------------------------

�ڶ�����ʾ��
PackageDemo.java:38: ����� packa ������
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:38: ����� packa ������
                packa.DemoA d = new packa.DemoA();
                                         ^
2 ����

ԭ��
��packa�����ڵ�ǰĿ¼�£���Ҫָ��classpath����jvmȥָ��·������packa����
F:\java40\day09>set classpath=c:\myclass

--------------------------------------
��������ʾ��
PackageDemo.java:52: packa.DemoA �� packa �в��ǹ����ģ��޷����ⲿ������ж����
�з���
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:52: packa.DemoA �� packa �в��ǹ����ģ��޷����ⲿ������ж����
�з���
                packa.DemoA d = new packa.DemoA();
                                         ^
2 ����

ԭ����Ҫ�ڰ����ⱻ���ʣ�����public���Σ�ҪȨ���㹻��


--------------------------------------
���ĸ���ʾ��
PackageDemo.java:53: show() �� packa.DemoA �в��ǹ����ģ��޷����ⲿ������ж���
���з���
                d.show();
                 ^
1 ����

�����ʵ����еĳ�Ա��ֻ�й��вſ��Ա����ʡ�


*/



package mypack;

import packa.*;
import packa.haha.*;//�����Ӱ��е��ࡣ


/*
packa
	|-DemoA.class
	|-haha
		|-ZZ.class
*/

class  PackageDemo
{
	public static void main(String[] args) 
	{
		DemoA d = new DemoA();
		d.show();
		ZZ z = new ZZ();
		//System.out.println("Hello package!");

		//packb.DemoB d1 = new packb.DemoB();
		//d1.func();
	}
}


