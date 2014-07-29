package parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;


class SAXHandler extends DefaultHandler {

    List<Employee> empList = new ArrayList<>();
    Employee emp = null;
    String content = null;
    @Override

    public void startElement(String uri, String localName,

      String qName, Attributes attributes)

            throws SAXException {

        if (qName.equals("employee")) {
            emp = new Employee();

            emp.id = attributes.getValue("id");


        }

    }

    @Override

    public void endElement(String uri, String localName,
      String qName) throws SAXException {
        if (qName.equals("employee")) {
            empList.add(emp);

        } else if (qName.equals("surname")) {
            emp.surname = content;

        } else if (qName.equals("firstName")) {
            emp.firstName = content;

        } else if (qName.equals("middlename")) {
            emp.middlename = content;

        }

    }

    @Override

    public void characters(char[] ch, int start, int length)
     throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();

    }

}
