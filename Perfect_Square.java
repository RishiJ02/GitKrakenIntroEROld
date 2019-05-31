public class Perfect_Square{
	public static void main(String[]args){
		PerfectSquare psobj = (int x)->{return (((double)Math.sqrt((double)x) % 1.0) == 0.0);};

		if(psobj.perfectSquare(16))
			System.out.println("yes");
		else System.out.println("no");
	}
}

interface PerfectSquare{
	boolean perfectSquare(int x);
}