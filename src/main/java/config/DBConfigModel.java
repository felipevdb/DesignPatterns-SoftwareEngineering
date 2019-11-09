package config;

public class DBConfigModel{

	String host;
	String port;
	String user;
	String password;
	String name;
	
	public DBConfigModel(String host,	String port,String user,String password,String name) {
		this.host = host;
		this.port = port;
		this.user = user;
		this.password = password;
		this.name = name;
	}

}
