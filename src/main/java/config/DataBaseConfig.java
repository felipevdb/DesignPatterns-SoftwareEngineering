package config;

public class DataBaseConfig{

	String host;
	String port;
	String user;
	String password;
	String name;
	
	public DataBaseConfig(String host,	String port,String user,String password,String name) {
		this.host = host;
		this.port = port;
		this.user = user;
		this.password = password;
		this.name = name;
	}

}
