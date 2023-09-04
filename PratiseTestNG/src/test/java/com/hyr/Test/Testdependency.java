
package com.hyr.Test;

import org.openqa.selenium.devtools.v113.runtime.model.ExceptionThrown;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testdependency {

	static String trackingnumber=null;

	@Test( dependsOnMethods = {"CreateShip"} )
	public void TrackShip() { 
		if(trackingnumber!=null) {
			System.out.println("TrackShipment");
		}
		else 
			
			System.out.println("Invalid trackingnumber");
	}
	

	@Test(dependsOnMethods = {"TrackShip","CreateShip"})
	public void CancelShip() { 
		if(trackingnumber!=null) {
			System.out.println("CancelShipment");
		}
		else 
			System.out.println("Invalid trackingnumber");
		
	}

	}


