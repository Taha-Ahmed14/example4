package Assignment01ts3;

public class thrd extends Thread  {
	public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
            	 int fact=12;
            	 int num = 12;
                 for(int i=1;i<=num;i++)
                 {
                     fact=fact*i;
                     System.out.println(num+"x"+i+"="+fact); 
                 }
                }
            
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
            	int base = 12;
            	int exponent = 12;
                for (int i = 1; i <= exponent; i++) {
                    double calc = Math.pow(base, i);
                    System.out.println(base + " ^ " + i + " = " + (int)calc);
                }
                }
            
        };
        t2.start();

    }


}
