package Test;


public class Revenue {
	

	private int add[]= new int[100];
	
	public double myRevenue (double total_cost) {
		System.out.println("order\tRevenue");
		
		for (int index=0; index <add.length; index++)
		{
			add[index] = index;
			
	    }
		
		
		for (int index=0; index < add.length; index++)
		{
			
			System.out.println(add[index]+"\t"+ total_cost);
	    }
		return total_cost;
	
	}
}
