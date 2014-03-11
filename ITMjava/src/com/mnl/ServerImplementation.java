package com.mnl;

/**
 * Main Server Implementation
 *
 */
import java.rmi.*;
import java.rmi.server.*;

public class ServerImplementation extends UnicastRemoteObject implements
		ServerInterface {

	public ServerImplementation() throws RemoteException {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mnl.ServerInterface#total_cost(double, double)
	 */
	@Override
	public double total_cost(double unit_price, double quantity)
			throws RemoteException {
		// TODO Auto-generated method stub
		double cost = 0.0;
		cost = unit_price * quantity;
		return cost;
	}
}
