package tabels;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TYPEANDPRICEROOM")
public class TypeAndPriceRooms {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "single_room")
    private int singleRoom;

    @Column(name = "double_room")
    private int doubleRoom;

    @Column(name = "triple_room")
    private int tripleRoom;

    @Column(name = "apartment")
    private int apartment;

    @ManyToMany(mappedBy = "rooms", cascade = CascadeType.ALL)
    private List<Hotels> hotelsList= new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Hotels> getHotelsList() {
        return hotelsList;
    }

    public void setHotelsList(List<Hotels> hotelsList) {
        this.hotelsList = hotelsList;
    }
}
