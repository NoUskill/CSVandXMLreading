package org.example;

class CityInfo {
    public Integer onefloor;
    public Integer twofloor;
    public Integer threefloor;
    public Integer fourfloor;
    public Integer fivefloor;

    CityInfo() {
        onefloor = 0;
        twofloor = 0;
        threefloor = 0;
        fourfloor = 0;
        fivefloor = 0;
    }

    void Append(Integer i) {
        if (i == 1) {
            this.onefloor++;
        } else if (i == 2) {
            this.twofloor++;
        } else if (i == 3) {
            this.threefloor++;
        } else if (i == 4) {
            this.fourfloor++;
        } else if (i == 5) {
            this.fivefloor++;
        }
    }

    public String toString() {
        String temp = " 1 Этаж:" + onefloor + " 2 Этажа:" + twofloor + " 3 Этажа:" + threefloor + " 4 Этажа:" + fourfloor + " 5 Этажей:" + fivefloor;
        return temp;
    }
}
