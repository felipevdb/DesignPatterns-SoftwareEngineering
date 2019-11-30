package htmlTags;

public class Italic extends BaseTag {
	
	@Override
	public String toHTML(){
		
		StringBuilder html = new StringBuilder();
		html.append("<i>");
		html.append(super.toHTML());
		html.append("</i>");
		
		return html.toString();
	}

}
