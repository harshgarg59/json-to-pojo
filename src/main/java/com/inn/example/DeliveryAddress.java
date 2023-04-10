
package com.inn.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AddressLine",
    "City",
    "State",
    "PinCode",
    "ContactNumber"
})
public class DeliveryAddress {

    @JsonProperty("AddressLine")
    private Object addressLine;
    @JsonProperty("City")
    private Object city;
    @JsonProperty("State")
    private Object state;
    @JsonProperty("PinCode")
    private Object pinCode;
    @JsonProperty("ContactNumber")
    private Object contactNumber;

    @JsonProperty("AddressLine")
    public Object getAddressLine() {
        return addressLine;
    }

    @JsonProperty("AddressLine")
    public void setAddressLine(Object addressLine) {
        this.addressLine = addressLine;
    }

    public DeliveryAddress withAddressLine(Object addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    @JsonProperty("City")
    public Object getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(Object city) {
        this.city = city;
    }

    public DeliveryAddress withCity(Object city) {
        this.city = city;
        return this;
    }

    @JsonProperty("State")
    public Object getState() {
        return state;
    }

    @JsonProperty("State")
    public void setState(Object state) {
        this.state = state;
    }

    public DeliveryAddress withState(Object state) {
        this.state = state;
        return this;
    }

    @JsonProperty("PinCode")
    public Object getPinCode() {
        return pinCode;
    }

    @JsonProperty("PinCode")
    public void setPinCode(Object pinCode) {
        this.pinCode = pinCode;
    }

    public DeliveryAddress withPinCode(Object pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    @JsonProperty("ContactNumber")
    public Object getContactNumber() {
        return contactNumber;
    }

    @JsonProperty("ContactNumber")
    public void setContactNumber(Object contactNumber) {
        this.contactNumber = contactNumber;
    }

    public DeliveryAddress withContactNumber(Object contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("addressLine", addressLine).append("city", city).append("state", state).append("pinCode", pinCode).append("contactNumber", contactNumber).toString();
    }

}
