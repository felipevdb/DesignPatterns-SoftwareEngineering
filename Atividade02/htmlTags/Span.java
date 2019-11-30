package htmlTags;

public class Span extends BaseTag {
	
	String content;
	
	public Span(String content){
		this.content = content;
	}
	
	@Override
	public String toHTML(){
		
		StringBuilder html = new StringBuilder();
		html.append("<span>");
		html.append(super.toHTML());
		html.append(content);
		html.append("</span>");
		
		return html.toString();
	}

}
