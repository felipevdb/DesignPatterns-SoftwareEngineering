package htmlTags;

public interface ITag {
	
	ITag add(ITag tag);
	
	ITag removeAll(ITag tag);
	
	String toHTML();

}
