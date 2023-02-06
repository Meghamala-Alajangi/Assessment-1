package Assessment;

import java.util.*;

public class TShirts {

	public static void main(String[] args) {
		String[] cart = {"round-neck","collared","hooded","round-neck","round-neck"};
		double cost = 0;
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == "round-neck") {
				cost = cost + 200;
			}
			else if(cart[i] == "collared") {
				cost = cost + 250;
			}
			else if(cart[i] == "hooded") {
				cost = cost + 300;
			}
			else {
				
			}
		}
		if(cart.length > 10) {
			cost = cost - (cost*(0.2));
		}
		else if(cart.length >= 5 && cart.length <= 10) {
			cost = cost - (cost*(0.1));
		}
		else {
			
	    }
		System.out.println("Final price is Rs. "+cost);
	}
}
