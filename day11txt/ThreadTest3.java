//д���������ִ�еĽ����������д���������̣�û�з������̲��÷֣���ֵ10�֣�

class MyThread extends Thread{
	public  void run(){
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("MyThread running");
	}
}



public class ThreadTest3{
	public static void main(String argv[]) {
		MyThread t = new MyThread();
		t.run();//���߳�ִ����t��run��������run�У�sleep3�롣 3��󣬴�ӡMyThread running
		t.start();//�������̡߳�
		System.out.println("Thread Test");
	  }
}
/*
���߳���ִ��runʱ��˯��3�룬3����ӡ"MyThread running"��

������һ���̺߳����߳��п��ܻ�����cpu��Դ��������ӡ"Thread Test"�����߳̽�����

����������һ���߳�ִ��run������˯��3�룬3����ӡ"MyThread running"��


��һ��������߳̿���һ���߳�ʱ�����߳�����ִ�У�����run����ʱ��˯��3�룬
�ڸ��߳�˯�߹����У�cpu�ᴦ�����̡߳���ӡ"Thread Test"�����߳̽�����
Ȼ����һ���߳�3���cpu������̴߳�ӡ"MyThread running"��

*/