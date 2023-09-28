package ru.mirea.pract04var2;

import java.lang.*;

public class Book {
    class Authtor {
        private String name = "Default";
        private String surname = "Default";
        public Authtor () {}
        public Authtor (String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public void setAuthor (String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public String getName () {
            return name;
        }
        public String getSurname () {
            return surname;
        }
        public String getAuthor () { return name + " " + surname; }
    }
    class Name {
        private String bookname;
        public Name () {}
        public Name (String bookname) {
            this.bookname = bookname;
        }
        public void setBookname (String bookname) {
            this.bookname = bookname;
        }
        public String getBookname () {
            return bookname;
        }
    }
    class Year {
        private  int year;
        public Year () {}
        public Year (int year) {
            this.year = year;
        }
        public void setYear (int year) {
            this.year = year;
        }
        public int getYear () {
            return year;
        }
    }
    Authtor authtor = new Authtor();
    Name name = new Name();
    Year year = new Year();
    public Book () {}
    public Book (Name name, Authtor authtor, Year year) {
        this.name = name;
        this.authtor = authtor;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authtor=" + authtor.getAuthor() +
                ", name=" + name.getBookname() +
                ", year=" + year.getYear() +
                '}';
    }
}
