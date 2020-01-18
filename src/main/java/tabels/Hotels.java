package tabels;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class,
        property="id_h", scope=Hotels.class)

@Entity
@Table(name = "HOTELS", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"})
})
public class Hotels {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "annual_revenues")
    private String annualRevenues;

    @Column(name = "number_od_stars")
    private int numbeeerOfStars;

    @Column(name = "when_build")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSZ")
    private DateTime whenbuild;

    @ManyToMany(mappedBy = "hotels", cascade = CascadeType.ALL)
    private List<Facilities> facilities= new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<TypeAndPriceRooms> rooms = new ArrayList<>();

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "countries_id", referencedColumnName = "id", nullable = false)
    Countries countries;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cities_id", referencedColumnName = "id", nullable = false)
    Cities cities;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "=address_id", referencedColumnName = "id", nullable = false)
    Address address;

    @ManyToMany(mappedBy = "hotels", cascade = CascadeType.ALL)
    private List<Facilities> facilitiesList = new ArrayList<>();

    private List<Hotels> allhotelsList = new ArrayList<>();

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Facilities> getFacilitiesList() {
        return facilitiesList;
    }

    public void setFacilitiesList(List<Facilities> facilitiesList) {
        this.facilitiesList = facilitiesList;
    }

    public List<TypeAndPriceRooms> getRooms() {
        return rooms;
    }

    public void setRooms(List<TypeAndPriceRooms> rooms) {
        this.rooms = rooms;
    }

    public List<Hotels> getAllhotelsList() {
        return allhotelsList;
    }

    public void setAllhotelsList(List<Hotels> allhotelsList) {
        this.allhotelsList = allhotelsList;
    }
}
