package htmlTags;

public class Bold extends BaseTag {
	
	@Override
	public String toHTML(){
		
		StringBuilder html = new StringBuilder();
		html.append("<b>");
		html.append(super.toHTML());
		html.append("</b>");
		
		return html.toString();
	}

}
