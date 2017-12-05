package mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FoodOrders {

	public static void main(String[] args )throws Exception, InterruptedException {
		System.out.println("order\tRevenue");
		Revenue revenueobject = new Revenue();
		ServerSocket listener = new ServerSocket(8090);
        try {
            while (true) {
                new SaveToDB(revenueobject, listener.accept()).start();
            }
        } finally {
            listener.close();
        }
	}
    private static class SaveToDB extends Thread {
        private Socket socket;
        Revenue revenueobject;
        public SaveToDB(Revenue revenueobject, Socket socket) {
            this.socket = socket;
           this.revenueobject = revenueobject;
        }
        
        public void run() {
            try {
            	BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                while (true) {
                    String input = in.readLine();
                    if (input == null || input.equals(".")) {
                        break;
                    }
                    double total_cost = Double.parseDouble (input);
                    
                    revenueobject.myRevenue(total_cost);            
            }
            }catch (IOException e) {
            }
        }       
    }
}

				
				

	

