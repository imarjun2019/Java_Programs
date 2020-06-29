package com.autowiring;

public class Categories {


        private String name;
        private Book book;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Book getBook() {
                return book;
        }

        public void setBook(Book book) {
                this.book = book;
        }

        public void bookDetails()
        {
                System.out.println("Category name: " + name);
                System.out.println("Book name: " + book.getBookName());
                System.out.println("Book Price: " + book.getBookPrice());
        }
}


