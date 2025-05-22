package fr.univrouen.rss25sb.rss25sb.util;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

public class XsltTransformer {
    public static String transformToHtml(Object xml, String xsltPath) throws Exception {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(new StreamSource(XsltTransformer.class.getResourceAsStream(xsltPath)));
        StringWriter writer = new StringWriter();
        transformer.transform(new StreamSource(new StringReader(xml.toString())), new StreamResult(writer));
        return writer.toString();
    }
}