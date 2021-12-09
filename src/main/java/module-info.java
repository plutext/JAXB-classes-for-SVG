module org.plutext.jaxb.svg11 {
	exports org.plutext.jaxb.svg11;

	requires java.xml;
	requires jakarta.xml.bind;
	
    opens org.plutext.jaxb.svg11 to jakarta.xml.bind, com.sun.xml.bind, org.eclipse.persistence.moxy, org.eclipse.persistence.core;

}