package com.fm.librarybooks.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fm.books.dto.Book;
import com.fm.library.dto.Library;

public class LibraryBookDao {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");

    // Utility method to get a new EntityManager
    private EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    // **1. Save Library (with Books) - Bidirectional**
    public void saveLibrary(Library library) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        // Ensure bidirectional consistency
        if (library.getBooks() != null) {
            for (Book book : library.getBooks()) {
                book.setLibrary(library);
            }
        }

        transaction.begin();
        entityManager.persist(library);
        transaction.commit();
        entityManager.close();

        System.out.println("Library and associated Books saved successfully.");
    }

    // **2. Save Book separately**
    public void saveBook(Book book) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(book);
        transaction.commit();
        entityManager.close();

        System.out.println("Book saved successfully.");
    }

    // **3. Add Books to an Existing Library (Bidirectional)**
    public void addBooksToLibrary(int libraryId, List<Book> books) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Library library = entityManager.find(Library.class, libraryId);

        if (library != null) {
            transaction.begin();

            // Add new books to the existing list
            List<Book> existingBooks = library.getBooks();
            existingBooks.addAll(books);

            // Ensure bidirectional consistency
            for (Book book : books) {
                book.setLibrary(library);
            }

            // Merge the updated library entity
            entityManager.merge(library);
            transaction.commit();

            System.out.println("Books added to Library successfully.");
        } else {
            System.out.println("Library not found.");
        }
        entityManager.close();
    }

    // **4. Find Library by ID**
    public Library findLibraryById(int libraryId) {
        EntityManager entityManager = getEntityManager();
        Library library = entityManager.find(Library.class, libraryId);
        entityManager.close();
        return library;
    }

    // **5. Find Book by ID**
    public Book findBookById(int bookId) {
        EntityManager entityManager = getEntityManager();
        Book book = entityManager.find(Book.class, bookId);
        entityManager.close();
        return book;
    }

    // **6. Update Library**
    public void updateLibrary(Library library) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.merge(library);
        transaction.commit();
        entityManager.close();

        System.out.println("Library updated successfully.");
    }

    // **7. Delete Library (and all Books inside it)**
    public void deleteLibrary(int libraryId) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Library library = entityManager.find(Library.class, libraryId);
        if (library != null) {
            transaction.begin();
            entityManager.remove(library);
            transaction.commit();

            System.out.println("Library deleted successfully.");
        } else {
            System.out.println("Library not found.");
        }
        entityManager.close();
    }
}
