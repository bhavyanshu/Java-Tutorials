package com.mnl;

import java.rmi.*;

/**
 * RMI Program 4.1
 * Server interface
 */
public interface ServerInterface extends Remote {  
	double total_cost(double unit_price, double quantity) throws RemoteException;
}
