class Q2 extends Thread { 
static int i = 0; 
public void run() { 
System.out.println("running..." + i++); 
} 
public static void main(String args[]) { 
Q2 t1 = new Q2(); 
Q2 t2 = new Q2(); 
Q2 t3 = new Q2(); 
Q2 t4 = new Q2(); 
Q2 t5 = new Q2(); 
System.out.println("Name of tl:" + t1.getName() + i++); 
System.out.println("Name of t2:" + t2.getName() + i++); 
System.out.println("id of tl:" + t1.getId() + ++i); 


t1.start(); 
t2.start(); 
t3.start(); 
t4.start(); 
t5.start(); 
t1.setName("STIW3054"); 
System.out.println("After changing name of tl:" 
+ t1.getName() + --i); 
System.out.println("i = " + i); 



System.out.println("i = " + i); 
System.out.println("i = " + i); 

}
        }