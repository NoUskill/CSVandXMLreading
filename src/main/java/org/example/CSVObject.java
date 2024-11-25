package org.example;

import org.w3c.dom.Element;

import java.util.Objects;

class CSVObject {
    public String city;
    public String street;
    public Integer house;
    public Integer floor;

    CSVObject(String[] arr) {
        city = arr[0];
        street = arr[1];
        house = Integer.parseInt(arr[2]);
        floor = Integer.parseInt(arr[3]);
    }

    CSVObject(Element eElement) {
        city = eElement.getAttribute("city");
        street = eElement.getAttribute("street");
        house = Integer.parseInt(eElement.getAttribute("house"));
        floor = Integer.parseInt(eElement.getAttribute("floor"));
    }

    public String toStringCSVObject() {
        String tempStr;
        tempStr = city + " " + street + " " + house.toString() + " " + floor.toString();
        return tempStr;
    }

    public boolean equals(CSVObject o) {
        if (this == o) {
            return true;
        } else if (!Objects.equals(this.city, o.city)) {
            return false;
        } else if (!Objects.equals(this.street, o.street)) {
            return false;
        } else if (!Objects.equals(this.floor, o.floor)) {
            return false;
        } else if (!Objects.equals(this.house, o.house)) {
            return false;
        } else {
            return true;
        }

    }
}
