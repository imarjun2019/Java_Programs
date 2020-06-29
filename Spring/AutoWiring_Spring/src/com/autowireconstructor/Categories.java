package com.autowireconstructor;

public class Categories {


        private String name;
        public Book bk;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Categories(Book bk) {
                this.bk = bk;
        }

        public void bookDetails()
        {
                System.out.println("Category name: " + name);
                System.out.println("Book name: "+bk.getBookName()+"\nBook price: "+bk.getBookPrice());
        }
}


