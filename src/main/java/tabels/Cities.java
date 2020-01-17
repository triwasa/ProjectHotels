package tabels;

import javax.persistence.*;

@Entity
@Table(name = "CITIES", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"})
})
public class Cities {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private int population;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_cities")
    private Hotels hotels;







    public Cities() {}

    public Hotels getHotels() {
        return hotels;
    }

    public void setHotels(Hotels hotels) {
        this.hotels = hotels;
    }

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
}
