package ru.mirea.pract04var2;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.name.setBookname("Twenty Thousand Leagues Under the Sea");
        book1.authtor.setAuthor("Jules","Verne");
        book1.year.setYear(1870);
        book2.name.setBookname("Му-му");
        book2.authtor.setAuthor("Иван", "Тургенев");
        book2.year.setYear(1852);
        System.out.println(book1.authtor.getSurname());
        System.out.println(book1.year.getYear());
        System.out.println(book1.name.getBookname());
        System.out.println(book2.authtor.getAuthor());
        System.out.println(book2.name.getBookname());
        System.out.println(book2.year.getYear());
        System.out.println(book1);
        System.out.println(book2);
    }
}
