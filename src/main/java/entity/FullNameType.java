
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Kanatov"/>
 *               &lt;enumeration value="Ivanov"/>
 *               &lt;enumeration value="Petrov"/>
 *               &lt;enumeration value="Sidorov"/>
 *               &lt;enumeration value="Sholohov"/>
 *               &lt;enumeration value="Zhidov"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="firstname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Talgat"/>
 *               &lt;enumeration value="Ivan"/>
 *               &lt;enumeration value="Petr"/>
 *               &lt;enumeration value="Fedor"/>
 *               &lt;enumeration value="Vladimir"/>
 *               &lt;enumeration value="Artur"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="middlename">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Zhaksiadamov"/>
 *               &lt;enumeration value="Ivanovich"/>
 *               &lt;enumeration value="Petrovich"/>
 *               &lt;enumeration value="Vladimirovich"/>
 *               &lt;enumeration value="Abramovich"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullNameType", namespace = "http://www.example.com/abonent", propOrder = {
    "surname",
    "firstname",
    "middlename"
})
public class FullNameType {

    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected String surname;
    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected String firstname;
    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected String middlename;

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

}
