package tabels;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class,
        property="id_c", scope=Cities.class)

@Entity
@Table(name = "CITIES" /*uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name"})
}*/)
public class Cities {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private int population;

    public Cities() {}

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
