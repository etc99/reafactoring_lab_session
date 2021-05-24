package lanSimulation.internals;

public class Workstation extends Node {

	public Workstation(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Workstation(String name, Node nextNode) {
		super(name, nextNode);
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
