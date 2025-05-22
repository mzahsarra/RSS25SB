package fr.univrouen.rss25sb.rss25sb.util;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;

public class XsdValidator {
    public static boolean validate(String xml, String xsdPath) throws SAXException, IOException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(new StreamSource(XsdValidator.class.getResourceAsStream(xsdPath)));
        Validator validator = schema.newValidator();
        Source xmlSource = new StreamSource(xml);
        validator.validate(xmlSource);
        return true;
    }
}