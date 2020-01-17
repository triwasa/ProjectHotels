package tabels;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"})
})
public class Address {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public Hotels getHotels2() {
        return hotels2;
    }

    public void setHotels2(Hotels hotels2) {
        this.hotels2 = hotels2;
    }

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL,
                fetch = FetchType.LAZY, optional = false)
    private Hotels hotels2;

    public Address() {}

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
}
