package tabels;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class,
        property="id_a", scope=Address.class)

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
