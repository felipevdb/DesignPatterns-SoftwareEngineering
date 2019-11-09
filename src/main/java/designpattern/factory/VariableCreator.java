package designpattern.factory;

import config.DBConfigModel;

public class VariableCreator implements Creator {
	
	VariableCreator(){
		System.setProperty("host", "796.654.35.8");
		System.setProperty("port", "1521"); 
		System.setProperty("user", "admin"); 
		System.setProperty("password", "password"); 
		System.setProperty("name", "VariableDatabase"); 
	}

	public DBConfigModel createConfig() {
		
		String host = System.getProperty("host");
		String port = System.getProperty("port"); 
		String user = System.getProperty("user");
		String password = System.getProperty("password");
		String name = System.getProperty("name");;
		
		return new DBConfigModel(host, port, user, password, name);
	}

}
