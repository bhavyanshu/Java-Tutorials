package com.mnl;

/**
 * Main server
 *
 */

import java.net.*;
import java.rmi.*;

public class ServerExample {
	public static void main(String args[]) {
		try {
			ServerImplementation ServerImpl = new ServerImplementation();
			Naming.rebind("Calculator", ServerImpl);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}