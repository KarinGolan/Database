package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import mypackage.Revenue;

public class RevenueTest {

	@Test
	public void test() {
		
		 double total_cost=10;
		 Revenue test=new Revenue();
		 
		 double output= test.myRevenue(total_cost);
		
	}

	}


