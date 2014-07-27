
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullName" type="{http://www.example.com/abonent}fullNameType"/>
 *         &lt;element name="address" type="{http://www.example.com/abonent}addressType"/>
 *         &lt;element name="order" type="{http://www.example.com/abonent}orderType"/>
 *         &lt;element name="telephone">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="33-33-33"/>
 *               &lt;enumeration value="44-44-44"/>
 *               &lt;enumeration value="11-11-11"/>
 *               &lt;enumeration value="55-55-55"/>
 *               &lt;enumeration value="66-66-66"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Ivan@mail.ru"/>
 *               &lt;enumeration value="Petr@mail.ru"/>
 *               &lt;enumeration value="Fedr@mail.ru"/>
 *               &lt;enumeration value="Vlad@mail.ru"/>
 *               &lt;enumeration value="Zhid@mail.ru"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientType", namespace = "http://www.example.com/abonent", propOrder = {
    "fullName",
    "address",
    "order",
    "telephone",
    "mobilePhone",
    "email"
})
public class ClientType {

    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected FullNameType fullName;
    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected AddressType address;
    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected OrderType order;
    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected String telephone;
    @XmlElement(namespace = "http://www.example.com/abonent")
    protected String mobilePhone;
    @XmlElement(namespace = "http://www.example.com/abonent", required = true)
    protected String email;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link FullNameType }
     *     
     */
    public FullNameType getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullNameType }
     *     
     */
    public void setFullName(FullNameType value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
