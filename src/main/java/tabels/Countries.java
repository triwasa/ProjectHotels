package tabels;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRIES", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"})
})
public class Countries {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private int population;

    @Column(name = "language")
    private String language;

    public Hotels getHotel() {
        return hotel;
    }

    public void setHotel(Hotels hotel) {
        this.hotel = hotel;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_countries")
    private Hotels hotel;

    public Countries() {}

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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
