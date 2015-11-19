class RunThread implements Runnable{

	private String threadName;
	
	RunThread(String name){
		threadName = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10000; i++){
			System.out.println(threadName);
		}
	}	
}

public class ManyThreads{

	public static void main(String[] args){
		(new Thread(new RunThread("a"))).start();
		(new Thread(new RunThread("b"))).start();
		(new Thread(new RunThread("c"))).start();
		(new Thread(new RunThread("d"))).start();
		(new Thread(new RunThread("e"))).start();
		(new Thread(new RunThread("f"))).start();
		(new Thread(new RunThread("g"))).start();
		(new Thread(new RunThread("h"))).start();
		(new Thread(new RunThread("i"))).start();
		(new Thread(new RunThread("j"))).start();
		(new Thread(new RunThread("k"))).start();
		(new Thread(new RunThread("l"))).start();
		(new Thread(new RunThread("m"))).start();
		(new Thread(new RunThread("n"))).start();
		(new Thread(new RunThread("o"))).start();
		(new Thread(new RunThread("p"))).start();
		(new Thread(new RunThread("q"))).start();
		(new Thread(new RunThread("r"))).start();
		(new Thread(new RunThread("s"))).start();
		(new Thread(new RunThread("t"))).start();
		(new Thread(new RunThread("u"))).start();
		(new Thread(new RunThread("v"))).start();
		(new Thread(new RunThread("w"))).start();
		(new Thread(new RunThread("x"))).start();
		(new Thread(new RunThread("y"))).start();
		(new Thread(new RunThread("z"))).start();
	}
}
