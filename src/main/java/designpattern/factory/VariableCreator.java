package designpattern.factory;

import config.DataBaseConfig;

public class VariableCreator implements Creator {

	public DataBaseConfig createConfig() {
		
		DataBaseConfig config = new DataBaseConfig();
		
		return config;
	}

}
