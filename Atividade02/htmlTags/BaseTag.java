package htmlTags;

import java.util.ArrayList;
import java.util.List;

public class BaseTag implements ITag {

	private List<ITag> tags;
	
	BaseTag(){
		this.tags = new ArrayList<ITag>();
	}

	public ITag add(ITag tag) {
		
		this.tags.add(tag);
		return this;
	}

	public ITag removeAll(ITag tag) {
	
		this.tags.clear();
		return this;
	}

	public String toHTML() {
		
		StringBuilder html = new StringBuilder();
		tags.forEach(item-> html.append(item));
		
		return html.toString();
	}
	
	
	
	
}
