package jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jpa.music.Artist;

public class Main {
    public static void main(String[] args) {
        try (var sessionFactory =
                     Persistence.createEntityManagerFactory(
                             "dev.lpa.music"
                     );
             EntityManager entityManager = sessionFactory.createEntityManager();
        ) {
            var transaction = entityManager.getTransaction();
            transaction.begin();
//            entityManager.persist(new Artist("Muddy Water"));
            Artist artist = entityManager.find(Artist.class, 202);
//            Artist artist = new Artist(202, "Muddy Water");
//            artist.setArtistName("Muddy Waters");
            System.out.println(artist);
//            artist.removeDuplicates();
            artist.addAlbum("The Best of Muddy Waters");
            System.out.println(artist);
//            entityManager.remove(artist);
//            entityManager.merge(artist);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
