package ru.mirea.lab02var3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.name.set("Twenty Thousand Leagues Under the Sea");
        book.authtor.set("Jules","Verne");
        book.year.setYear(1870);
        System.out.println(book.authtor.getSurname());
        System.out.println(book.year.getYear());
        System.out.println(book.name.getName());
    }
}
