/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirduran
 */

/**
 *
 * @author bekirduran
 */

public class MyDequeTester {
    public static void check(Integer x, Integer y) {
	if (x.equals(y)) 
	    System.out.println("Success!");
	 else 
	     System.out.println("********* Failure: value was "+x);
    } 

    public static void main(String [] args) throws Exception {
	
	int tmp;
	MyDeque<Integer> dq = new MyDeque<Integer>();

	System.out.println("Pushing 100");
	dq.push(100);

	System.out.println("Pushing 150");
	dq.push(150);
	
	System.out.println("Pushing 200");
	dq.push(200);

	//System.out.println("The deque is currently: "+dq);

	System.out.println("Popping... Should be 200");
	
	tmp = dq.pop();
	check(tmp, 200);
	
	System.out.println("Ejecting... Should be 100");
	tmp = dq.eject();
	check(tmp, 100);

	System.out.println("Injecting 1000");
	dq.inject(1000);
	
	System.out.println("Ejecting... should be 1000");
	tmp = dq.eject();
	check(tmp, 1000);
        

	System.out.println("Ejecting... should be 150");
	tmp = dq.eject();
	check(tmp, 1000);
	
	// Begin stress testing

	for (int i=0; i<250000; i++) {
	    dq.push(i);
	    dq.inject(-i);
	}

	System.out.println("Stress testing complete. If that didn't take too "+
			   "long, your class is efficiently coded");
    }
}
