package lanSimulation.internals;

public class Workstation extends Node {

	public Workstation(byte type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	public Workstation(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
		// TODO Auto-generated constructor stub
	}
	
	public void printOn(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(getName_());
		buf.append(" [Workstation]");
	}
	
	public void printHTMLOn(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(getName_());
		buf.append(" [Workstation]");
	}
	
	public void printXMLOn(StringBuffer buf) {
		buf.append("<workstation>");
		buf.append(getName_());
		buf.append("</workstation>");
	}

}
