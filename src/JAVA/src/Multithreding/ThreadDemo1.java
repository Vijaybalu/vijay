package Multithreding;

public class ThreadDemo1 implements Runnable{
	String name;
	ThreadDemo1(String name){
		this.name = name;
	}
public void run() {
	
	for(int i=1;i<=5;i++) {
		try {
		Thread.sleep(1000); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(name +":"+i);
	}
    }

	public static void main(String[] args) {
		ThreadDemo1 td = new ThreadDemo1("thread1");
		ThreadDemo1 td1 = new ThreadDemo1("thread2");
		Thread t = new Thread(td);
		Thread t1 = new Thread(td1);
		t.start();
		t1.start();
	}
	}
