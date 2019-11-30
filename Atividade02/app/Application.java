package app;

import htmlTags.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String teste;
		ITag html = new Html();
		
		html.add(new Bold()
				.add(new Italic()
				.add(new Span( " class= \"banana\""))));
		
		teste = html.toHTML();
		System.out.println(teste);
	}

}
