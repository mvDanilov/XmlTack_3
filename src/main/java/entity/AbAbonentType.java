
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ab.abonentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ab.abonentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employees" type="{http://www.example.com/abonent}employeesType"/>
 *         &lt;element name="clients" type="{http://www.example.com/abonent}clientsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ab.abonentType", namespace = "http://www.example.com/abonent", propOrder = {
    "employees",
    "clients"
})
public class AbAbonentType {

    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected EmployeesType employees;
    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected ClientsType clients;

    /**
     * Gets the value of the employees property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeesType }
     *     
     */
    public EmployeesType getEmployees() {
        return employees;
    }

    /**
     * Sets the value of the employees property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeesType }
     *     
     */
    public void setEmployees(EmployeesType value) {
        this.employees = value;
    }

    /**
     * Gets the value of the clients property.
     * 
     * @return
     *     possible object is
     *     {@link ClientsType }
     *     
     */
    public ClientsType getClients() {
        return clients;
    }

    /**
     * Sets the value of the clients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientsType }
     *     
     */
    public void setClients(ClientsType value) {
        this.clients = value;
    }

}
