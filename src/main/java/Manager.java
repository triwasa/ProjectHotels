import org.apache.log4j.Logger;
import org.hibernate.Session;
import tabels.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;

public class Manager {
    final static Logger logger = Logger.getLogger(Manager.class);
    public static void main(String args[]){

        Hotels hotel = new Hotels();
        hotel.setName("Wilczak");
/*

        Address address = new Address();
        address.setName("ul. Wil 2");
        hotel.setAdress(address);


        Owners owner = new Owners();
        owner.setFirstName("Jan");
        owner.setLastName("Żak");
        owner.getHotelOwners().add(hotel);

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

*/
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

       //craet objects









    }

}
