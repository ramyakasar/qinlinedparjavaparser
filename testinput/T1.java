class T1 {
	public static void main(String[] args) {
		try {
			 A x;
			 A y;
			 T1 z;
			 
			 x = new A();
			 y = new A(); 
			 z = new T1(); 
			 x.start();
			 x.f1 = z;
			 y.start();
			 y.join();
			 x.join();
			 
			}catch (Exception e) {
					
			} 
	}
}
	 
class A extends Thread{
		T1 f1;
		
		public void run() {
			try {
				A a;
				T1 b;
				a = this;
				b = new T1();
				a.f1 = b;
			}catch(Exception e) {
				
			}
		}
	}

