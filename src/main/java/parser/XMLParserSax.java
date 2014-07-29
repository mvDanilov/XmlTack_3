package parser;


import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;



public class XMLParserSax {
        Employee emp = new Employee();

        public static void main(String[] args) throws Exception {

            SAXParserFactory parserFactor = SAXParserFactory.newInstance();
            SAXParser parser = parserFactor.newSAXParser();
            SAXHandler handler = new SAXHandler();

            parser.parse(ClassLoader.getSystemResourceAsStream("xml/Employee.xml"), handler);

            for ( Employee emp : handler.empList){
                System.out.println(emp);

            }

        }

    }



