
package entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AbAbonent_QNAME = new QName("http://www.example.com/abonent", "ab.abonent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AbAbonentType }
     * 
     */
    public AbAbonentType createAbAbonentType() {
        return new AbAbonentType();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link ClientsType }
     * 
     */
    public ClientsType createClientsType() {
        return new ClientsType();
    }

    /**
     * Create an instance of {@link ClientType }
     * 
     */
    public ClientType createClientType() {
        return new ClientType();
    }

    /**
     * Create an instance of {@link FullNameType }
     * 
     */
    public FullNameType createFullNameType() {
        return new FullNameType();
    }

    /**
     * Create an instance of {@link EmployeeType }
     * 
     */
    public EmployeeType createEmployeeType() {
        return new EmployeeType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link EmployeesType }
     * 
     */
    public EmployeesType createEmployeesType() {
        return new EmployeesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbAbonentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/abonent", name = "ab.abonent")
    public JAXBElement<AbAbonentType> createAbAbonent(AbAbonentType value) {
        return new JAXBElement<AbAbonentType>(_AbAbonent_QNAME, AbAbonentType.class, null, value);
    }

}
