package com.mnl;

/**
 * Main client
 * 
 */

import java.net.*;
import java.rmi.*;

public class ClientExample {
	public static void main(String args[]) {
		try {
			String addServerURL = "rmi://" + args[0] + "/Calculator";
			ServerInterface ServerIntf = (ServerInterface) Naming
					.lookup(addServerURL);
			System.out.println("Price of 1 unit: " + args[1]);
			double d1 = Double.valueOf(args[1]).doubleValue();
			System.out.println("Total number of Units: " + args[2]);

			double d2 = Double.valueOf(args[2]).doubleValue();
			System.out.println("Total cost is: "
					+ ServerIntf.total_cost(d1, d2));
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}

/**
 * Output -> $ java com.mnl.ClientExample 127.0.0.1 65.5 15 Price of 1 unit:
 * 65.5 Total number of Units: 15 Total cost is: 982.5
 */
