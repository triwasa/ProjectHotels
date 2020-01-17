package tabels;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "OWNERS", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"first_name", "last_name"})
})
public class Owners {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "ammount_of_hotels")
    private int ammouuntOfHotels;

    public List<Hotels> getHotelOwners() {
        return hotelOwners;
    }

    public void setHotelOwners(List<Hotels> hotelOwners) {
        this.hotelOwners = hotelOwners;
    }

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Hotels> hotelOwners = new ArrayList<>();

    public Owners() {}



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAmmouuntOfHotels() {
        return ammouuntOfHotels;
    }

    public void setAmmouuntOfHotels(int ammouuntOfHotels) {
        this.ammouuntOfHotels = ammouuntOfHotels;
    }
}
