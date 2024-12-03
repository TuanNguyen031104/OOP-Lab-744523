package hust.soict.itep.test.store;

import hust.soict.itep.aims.media.Book;
import hust.soict.itep.aims.media.CompactDisc;
import hust.soict.itep.aims.media.DigitalVideoDisc;
import hust.soict.itep.aims.store.Store;

public class TestStore {
    public static void main(String[] args) {
        Store store = new Store();

        Book book1 = new Book("The Great Gatsby", "Classic", 15.99f);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 24.99f);
        CompactDisc cd1 = new CompactDisc("Thriller", "Pop", "Michael Jackson", "Michael Jackson", 42, 19.99f);

        System.out.println("Adding media to the store:");
        store.addMedia(book1);
        store.addMedia(dvd1);
        store.addMedia(cd1);

        System.out.println("\nStore contents:");
        store.print();

        System.out.println("\nSearching for media:");
        System.out.println("Searching for 'Inception': " +
                (store.searchMedia("Inception") != null ? "Found" : "Not Found"));
        System.out.println("Searching for 'Random Book': " +
                (store.searchMedia("Random Book") != null ? "Found" : "Not Found"));

        System.out.println("\nRemoving media:");
        store.removeMedia(dvd1);

        System.out.println("\nUpdated store contents:");
        store.print();
    }
}
