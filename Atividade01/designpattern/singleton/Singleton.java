package designpattern.singleton;

import config.DBConfigModel;
import designpattern.factory.Creator;
import designpattern.factory.FileCreator;
import designpattern.factory.MessagingCreator;
import designpattern.factory.VariableCreator;

public final class Singleton {
	
	private static Singleton uniqueInstance;
	public Creator creator;
	public DBConfigModel configModel;
	
	private Singleton(String type) {
		
		
		if(type == "file") creator = new FileCreator();
		else if (type == "messaging") creator = new MessagingCreator();
		else if (type == "variable") creator = new VariableCreator();
		
		configModel= creator.createConfig();
	}


	public static Singleton getInstance(String type) {
		
		if (uniqueInstance == null) uniqueInstance = new Singleton(type);
		
		return uniqueInstance;	
	}

}
