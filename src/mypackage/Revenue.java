package mypackage;


public class Revenue {
	

	private double add[]= new double[100];
	
	public double myRevenue (double total_cost) {
		
		
		for (int index=0; index < add.length; index++)
		{
			if(add[index] != 0.0 ) {
				continue;
			}
			else {
				add[index] = total_cost;
				System.out.println(index +"\t"+ total_cost);
				break;
			}
	    }
		return total_cost;
	}
}
