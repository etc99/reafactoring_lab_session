package lanSimulation.internals;

public class Printer extends Node {

	public Printer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Printer(String name, Node nextNode) {
		super(name, nextNode);
		// TODO Auto-generated constructor stub
	}
	
	public void printOn(StringBuffer buf){
		buf.append("Printer ");
		buf.append(getName_());
		buf.append(" [Printer]");
	}

	public void printHTMLOn(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(getName_());
		buf.append(" [Printer]");
	}
	
	public void printXMLOn(StringBuffer buf) {
		buf.append("<printer>");
		buf.append(getName_());
		buf.append("</printer>");
	}
}
