/**
 * Program 1.2
 */
package com.mnl;

import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class DatabaseUI extends Frame implements ActionListener {

	
	static Button btn_action=new Button("Submit");
	static TextField txt_input_query = new TextField(40);
	static TextArea txt_output=new TextArea(10,50);
	static Label display=new Label();

	static Panel p = new Panel();
	
	public DatabaseUI() {
		setLayout(new FlowLayout());
		display.setText("Enter your SQL query");
		add(p);
		p.add(display);
		p.add(txt_input_query);
		p.add(btn_action);
		p.add(txt_output);
		btn_action.addActionListener(this);
		setVisible(true);
	}

	public static void main(String args[]) {
		 DatabaseUI db = new DatabaseUI();
	}	
	
	public void ConnectToDB() {
		try {
		String input = txt_input_query.getText();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // initialise the driver
		String url ="jdbc:mysql://localhost:3306/test_database_java";
		Connection connex = DriverManager.getConnection(url,"test_code","test_code");
		System.out.println("connection Established");
		Statement st = connex.createStatement();
		ResultSet rst = st.executeQuery(input);
		//ResultSetMetaData rstmd = rst.getMetaData();
		String output ="";
		while(rst.next()) {
		int id = rst.getInt("empno");
	    String str1 = rst.getString("empname");
	    String str2 = rst.getString("salary");
	    output = "| Employee Number: "+id+"Employee Name: "+str1+"Salary: "+str2+" |";
		}	
		txt_output.setText(output);
		}
		catch(SQLException e){
			System.out.println("Error: "+e);
		}
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		if(s=="Submit") {
		ConnectToDB();
		}	
	}
}