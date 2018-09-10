package org.arpit.java2blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLIGHTS")
public class Flights {

       @Id
       @Column(name = "flightID")
       private int flightid;
       
       @Column(name = "flightName")
       String flightName;
       
       @Column(name="source")
       String source;
       
       @Column(name="destination")
       String destination;
       
       @Column(name="departure")
       String departure;
       
       @Column(name="arrival")
       String arrival;
       
       @Column(name="departdate")
       String departdate;
       
       @Column(name="price")
       double price;

       public int getFlightid() {
              return flightid;
       }

       public void setFlightid(int flightid) {
              this.flightid = flightid;
       }

       public String getFlightName() {
              return flightName;
       }

       public void setFlightName(String flightName) {
              this.flightName = flightName;
       }

       public String getSource() {
              return source;
       }

       public void setSource(String source) {
              this.source = source;
       }

       public String getDestination() {
              return destination;
       }

       public void setDestination(String destination) {
              this.destination = destination;
       }

       public String getDeparture() {
              return departure;
       }

       public void setDeparture(String departure) {
              this.departure = departure;
       }

       public String getArrival() {
              return arrival;
       }

       public void setArrival(String arrival) {
              this.arrival = arrival;
       }

       public String getDepartdate() {
              return departdate;
       }

       public void setDepartdate(String departdate) {
              this.departdate = departdate;
       }

       public double getPrice() {
              return price;
       }

       public void setPrice(double price) {
              this.price = price;
       }

       @Override
       public String toString() {
              return "Flights [flightid=" + flightid + ", flightName=" + flightName + ", source=" + source + ", destination="
                           + destination + ", departure=" + departure + ", arrival=" + arrival + ", departdate=" + departdate
                           + ", price=" + price + "]";
       }

       public Flights(String flightName, String departure, String arrival, double price) {
              super();
              //this.flightid = flightid;
              this.flightName = flightName;
              /*this.source = source;
              this.destination = destination;*/
              this.departure = departure;
              this.arrival = arrival;
              /*this.departdate = departdate;*/
              this.price = price;
       }
       public Flights()
       {
              super();
       }
}
