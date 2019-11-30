package htmlTags;

public class Html extends BaseTag {
	
	@Override
	public String toHTML(){
		
		StringBuilder html = new StringBuilder();
		html.append("<html>");
		html.append(super.toHTML());
		html.append("</html>");
		
		return html.toString();
	}

}
