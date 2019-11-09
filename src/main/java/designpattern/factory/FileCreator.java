package designpattern.factory;

import config.DBConfigModel;

public class FileCreator implements Creator {

	public DBConfigModel createConfig() {
		
		String host = "192.168.0.1";
		String port = "3306"; 
		String user = "admin";
		String password = "123123";
		String name = "FileDatabase";
		
		return new DBConfigModel(host, port, user, password, name);
	}

}
