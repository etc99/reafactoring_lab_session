package lanSimulation.internals;

public class Printer extends Node {

	public Printer(byte type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	public Printer(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
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
