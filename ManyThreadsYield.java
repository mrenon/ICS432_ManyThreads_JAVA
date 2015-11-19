class RunThreadYield implements Runnable{

	private String threadName;
	
	RunThreadYield(String name){
		threadName = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10000; i++){
			if(threadName.matches("a") || threadName.matches("e") || threadName.matches("i")
			|| threadName.matches("o") || threadName.matches("u")){
				
				System.out.println(threadName);
				Thread.yield();
			}
			else{
				System.out.println(threadName);
			}
			    
		}
	}	
}

public class ManyThreadsYield{

	public static void main(String[] args){
		(new Thread(new RunThreadYield("a"))).start();
		(new Thread(new RunThreadYield("b"))).start();
		(new Thread(new RunThreadYield("c"))).start();
		(new Thread(new RunThreadYield("d"))).start();
		(new Thread(new RunThreadYield("e"))).start();
		(new Thread(new RunThreadYield("f"))).start();
		(new Thread(new RunThreadYield("g"))).start();
		(new Thread(new RunThreadYield("h"))).start();
		(new Thread(new RunThreadYield("i"))).start();
		(new Thread(new RunThreadYield("j"))).start();
		(new Thread(new RunThreadYield("k"))).start();
		(new Thread(new RunThreadYield("l"))).start();
		(new Thread(new RunThreadYield("m"))).start();
		(new Thread(new RunThreadYield("n"))).start();
		(new Thread(new RunThreadYield("o"))).start();
		(new Thread(new RunThreadYield("p"))).start();
		(new Thread(new RunThreadYield("q"))).start();
		(new Thread(new RunThreadYield("r"))).start();
		(new Thread(new RunThreadYield("s"))).start();
		(new Thread(new RunThreadYield("t"))).start();
		(new Thread(new RunThreadYield("u"))).start();
		(new Thread(new RunThreadYield("v"))).start();
		(new Thread(new RunThreadYield("w"))).start();
		(new Thread(new RunThreadYield("x"))).start();
		(new Thread(new RunThreadYield("y"))).start();
		(new Thread(new RunThreadYield("z"))).start();
	}
}
