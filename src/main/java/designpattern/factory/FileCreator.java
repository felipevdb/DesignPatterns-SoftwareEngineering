package designpattern.factory;

import config.DataBaseConfig;

public class FileCreator implements Creator {

	public DataBaseConfig createConfig() {
		
		String host = "192.168.0.1";
		String port = "3306"; 
		String user = "admin";
		String password = "123123";
		String name = "FileDatabase";
		
		return new DataBaseConfig(host, port, user, password, name);
	}

}
