import org.apache.log4j.Logger;
import org.hibernate.Session;
import tabels.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Manager {
    final static Logger logger = Logger.getLogger(Manager.class);
    public static void main(String args[]){

        Hotels hotel = new Hotels();
        hotel.setName("Wilczak");


        Address address = new Address();
        address.setName("ul. Wil 2");
        hotel.setAddress(address);






        Cities city = new Cities();
        city.setName("Lublin");
        hotel.setCities(city);

        Countries country = new Countries();
        country.setName("Poland");
        hotel.setCountries(country);

        Facilities facility1 = new Facilities();
        Facilities facility2 = new Facilities();

        facility1.setName("SwimmingPool");
        facility2.setName("FreeParking");

        hotel.getFacilities().add(facility1);
        hotel.getFacilities().add(facility2);

        facility1.getHotels().add(hotel);
        facility2.getHotels().add(hotel);

        TypeAndPriceRooms rooms1 = new TypeAndPriceRooms();
        rooms1.setSingleRoom(300);
        rooms1.setDoubleRoom(400);
        rooms1.setTripleRoom(450);
        rooms1.setApartment(1000);

        rooms1.getHotelsList().add(hotel);
        hotel.getRooms().add(rooms1);









        //work with database
        System.out.println("Start");

       EntityManager e  = null;

       EntityManagerFactory entityManagerFactory = null;

       try{

           entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-dynamic");
           e = entityManagerFactory.createEntityManager();


           e.getTransaction().begin();



            e.persist(hotel);




           //zakoncz transakcje
           e.getTransaction().commit();

           System.out.println("Done");

           e.close();

       } catch (Throwable ex) {
           System.err.println("Initial SessionFactory creation failed." + ex);
       } finally {

           entityManagerFactory.close();
       }










    }

}
