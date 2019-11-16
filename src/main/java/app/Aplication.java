package app;

import designpattern.singleton.Singleton;

public class Aplication {
	
	public static void main(String[] args){
		
		System.out.println("Atividade 01, 02 e 03 referentes a data 09/11/2019");
		System.out.println("\n");
		
		
		String tipoConfig = "variable";
		
		Singleton config = Singleton.getInstance(tipoConfig);
		config.configModel.showConfig();
		
		tipoConfig = "file";
		Singleton config2 = Singleton.getInstance(tipoConfig);
		config2.configModel.showConfig();
		
	}

}
