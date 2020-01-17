package tabels;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "HOTELS", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"})
})
public class Hotels {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    public Cities getCities() {
        return cities;
    }

    public void setCities(Cities cities) {
        this.cities = cities;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "annual_revenues")
    private String annualRevenues;

    @Column(name = "swimming_pool")
    private boolean swimmingPool;

    @Column(name = "single_room")
    private int singleRoom;

    @Column(name = "double_room")
    private int doubleRoom;

    @Column(name = "triple_room")
    private int tripleRoom;

    @Column(name = "apartment")
    private int apartment;

    @Column(name = "number_od_stars")
    private int numbeeerOfStars;

    @Column(name = "when_build")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSZ")
    private DateTime whenbuild;

    @ManyToMany(mappedBy = "hotels", cascade = CascadeType.ALL)
    private List<Facilities> facilities= new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_address")
    private Address address;



    @OneToOne(mappedBy = "hotel", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Countries countries;

    @OneToOne(mappedBy = "hotels", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Cities cities;

    public Hotels() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnualRevenues() {
        return annualRevenues;
    }

    public void setAnnualRevenues(String annualRevenues) {
        this.annualRevenues = annualRevenues;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public int getSingleRoom() {
        return singleRoom;
    }

    public void setSingleRoom(int singleRoom) {
        this.singleRoom = singleRoom;
    }

    public int getDoubleRoom() {
        return doubleRoom;
    }

    public void setDoubleRoom(int doubleRoom) {
        this.doubleRoom = doubleRoom;
    }

    public int getTripleRoom() {
        return tripleRoom;
    }

    public void setTripleRoom(int tripleRoom) {
        this.tripleRoom = tripleRoom;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getNumbeeerOfStars() {
        return numbeeerOfStars;
    }

    public void setNumbeeerOfStars(int numbeeerOfStars) {
        this.numbeeerOfStars = numbeeerOfStars;
    }

    public DateTime getWhenbuild() {
        return whenbuild;
    }

    public void setWhenbuild(DateTime whenbuild) {
        this.whenbuild = whenbuild;
    }

    public List<Facilities> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facilities> facilities) {
        this.facilities = facilities;
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address adress) {
        this.address = adress;
    }


}
