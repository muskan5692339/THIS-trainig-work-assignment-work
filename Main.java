package com.neonitin;
import java.util.Scanner;
import  java.util.*;
import  java.io.* ;


class Main {
    public static void main(String[] args) {

        System.out.println("<---Welcome to library--->");
        System.out.println("<--Book List -->");

        System.out.println("1. Introduction to Computer Science Using Python"+ "\n" +
                "2. The Hidden Language of Computer Hardware and Software" + "\n" +
                "3. JavaScript: The Good Parts" +"\n" +
                "4. The Elements of Computing Systems: Building a Modern Computer from First Principles"+"\n" +
                "5. The Mythical Man-Month" +"\n" +
                "6. The Pragmatic Programmer" +"\n" +
                "7. Structure and Interpretation of Computer Programs"+"\n"+
                "8. Modern Operating Systems" +"\n" +
                "9.  " + "Introduction to Algorithms"+ "\n" + "10. C Programming Language");

        System.out.println();
        System.out.println("select number as per your book choice");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Author-  Charles Dierbach "+"\n" + " pub. year : 1997 "+
                        "\n" +
                        "Introduction to Computer Science Using Python: A Computational Problem-Solving Focus,recommended by Guido van Rossum, " +
                        "the creator of Python (â€œThis is not your average Python bookâ€¦I think this book is a great text for anyone teaching ");
                break;

            case 2:
                System.out.println("Author- Charles Petzold " + "\n" + " pub. year : 1997" +
                        "\n" +
                        "What do flashlights, the British invasion, black cats, and seesaws have to do with " +
                        "computers? In CODE, they show us the ingenious ways we manipulate language and invent new" +
                        " means of communicating with each other. And through CODE, we see how this ingenuity and our very human compulsion ");
                break;
            case 3:
                System.out.println("Author- Douglas Crockford" +"\n" + " pub. year : 1997"+
                        "\n" +
                        "Most programming languages contain good and bad parts, but JavaScript has more than its share of " +
                        "the bad, having been developed and released in a hurry " +
                        "before it could be refined. This authoritative book scrapes away these bad features to reveal a " +
                        "subset of JavaScript that's more");
                break;
            case 4:
                System.out.println("Author-Noam Nisan; Shimon Schocken"+ "\n" + " pub. year : 1997" +
                        "\n" +
                        "In the early days of computer science, the interactions of hardware, " +
                        "software, compilers, and operating system were simple enough to allow students to");
                break;
            case 5:
                System.out.println("Author- Frederick P. Brooks "+ "\n"+ " pub. year : 1997"+"\n" + "Fred Brooks offers insight for anyone managing complex projects");
                break;
            case 6:
                System.out.println("Author- Andrew Hunt; David Thomas "+ "\n" + " pub. year : 1997"+
                        "\n" +
                        "What others in the trenches say about The Pragmatic Programmer...\"The cool thing about this book is that it's great " +
                        "for keeping the programming process fresh. The book helps you to continue to grow and clearly comes from people who have been there");
                break;
            case 7:
                System.out.println("Author- Harold Abelson; Gerald Jay Sussman"+ "\n" + " pub. year : 1997"+
                        "\n" +
                        "Structure and Interpretation of Computer Programs has had a dramatic impact on computer science curricula over the past decade. This long-awaited");
                break;
            case 8:
                System.out.println("Author- Andrew S. Tanenbaum "+ "\n" + " pub. year : 1997"+
                        "\n" +
                        "Â  The widely anticipated revision of this worldwide best-seller incorporates the latest developments in operating systems " +
                        "technologies.Â  The Third Edition includes up-to-date materials " +
                        "on relevant operating systems such as Linux, Windows, and embedded real-time and multimedia systems. Includes new and updated ");
                break;
            case 9:
                System.out.println("Author- Thomas H. Cormen; Charles E. Leiserson; Ron Rivest"+"\n" + " pub. year : 1997"+
                        "\n" +
                        "Some books on algorithms are rigorous but incomplete; others cover masses of material but lack rigor. Introduction to Algorithms uniquely combines rigor and");
                break;
            case 10:
                System.out.println("Author- Dennis MacAlistair Ritchie" + "\n" + " pub. year : 1997" +"\n" + "Ritchie is best known as the creator of the C programming language, " +
                        "a key developer of the Unix operating system, and co-author of the book The C Programming Language; he was the 'R' in K&R " +
                        "(a common reference to the book's authors Kernighan and Ritchie). Ritchie worked together with Ken Thompson, who is credited " +
                        "with writing the original version of Unix; one of Ritchie's most important contributions to Unix was its porting to different machines and platforms.[16] They were so influential on Research Unix that Doug McIlroy later wrote, \"" +
                        "The names of Ritchie and Thompson may safely be assumed to be attached to almost everything not otherwise attributed");
                break;

            default:
                System.out.println("please enter vailid choice ");
        }

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        while(true) {
            lib.menu();
            int choice = sc.nextInt();


            switch(choice) {
                case 1: System.out.println("Enter ID");
                    int id = sc.nextInt();
                    System.out.println("Enter Book Name");
                    String bname = sc.next();
                    System.out.println("Enter Author Name");
                    String aname = sc.next();
                    System.out.println("Enter Publish Year");
                    int pyear = sc.nextInt();
                    lib.insert(id, bname, aname, pyear);
                    break;
                case 2: System.out.println("The Books are");
                    lib.printBooks();
                    break;
                case 3:    System.out.println("The Authors are");
                    lib.printAuthors();
                    break;
                case 4:    lib.search();
                    break;
                case 5:    System.out.println("Enter your name");
                    String name = sc.next();
                    System.out.println("Enter your address");
                    String add = sc.next();
                    System.out.println("Enter your contact number");
                    Long number = sc.nextLong();
                    System.out.println("Enter your issue date(dd/mm/yyyy)");
                    String idate = sc.next();
                    System.out.println("Enter your return date(dd/mm/yyyy)");
                    String rdate = sc.next();
                    System.out.println("Enter your Book ID");
                    int bid = sc.nextInt();
                    lib.issueBook(name,add,number,idate,rdate,bid);
                    break;
                case 6:    lib.printIssuedBook();
                    break;
                case 0:    System.exit(0);
                default: System.out.println("Invalid choice!!!");
            }
        }


    }
}

class Book {
    int bookID;
    String name;
    String author;
    char avail;
    int yearOfPublish;


    Book(int bookID, String name, String author, char avail, int yearOfPublish) {
        this.bookID = bookID;
        this.name = name;
        this.author = author;
        this.avail = avail;
        this.yearOfPublish = yearOfPublish;
    }


    void print(){
        System.out.println(bookID +"\t" + name + "\t" + author    + "\t" + avail + "\t" + yearOfPublish);
    }
}


class Issue {
    String name;
    String address;
    Long cnumber;
    String idate;
    String rdate;
    int id;


    Issue(String name, String address, Long cnumber,String idate, String rdate, int id) {
        this.name = name;
        this.address = address;
        this.cnumber = cnumber;
        this.idate = idate;
        this.rdate = rdate;
        this.id = id;
    }
    void print() {
        System.out.println(name + "\t" + address + "\t" + cnumber + "\t" + idate + "\t" + rdate + "\t" + id);
    }
}


class Library {
    Book[] book = new Book[100];
    int librarysize = 0;
    Issue[] issuedBook = new Issue[100];
    int issuesize = 0;
    Scanner sc = new Scanner(System.in);


    void insert(int id, String bname, String aname, int pyear){
        Book b = new Book(id,bname,aname,'A',pyear);
        book[librarysize++] = b;
    }


    void printBooks(){
        System.out.println("Book ID\tBook Name\tAuthor\tAvailability\tPublish Year");
        for(int i=0 ; i<librarysize ; i++) {
            book[i].print();
        }
    }


    void printIssuedBook() {
        System.out.println("Issuer Name\tAddess\tContact Number\tIssue Date\tReturnDate\tBookID");
        for (int i = 0; i<issuesize ; i++ ) {
            issuedBook[i].print();
        }
    }


    void printAuthors() {
        for(int i=0 ; i<librarysize ; i++) {
            System.out.println(book[i].author);
        }
    }


    void search() {
        System.out.println("1. Search by ID");
        System.out.println("2. Search by name");
        System.out.println("3. Search by author");
        int searchChoice = sc.nextInt();
        if (searchChoice == 1) {
            System.out.println("Enter the ID");
            int id = sc.nextInt();
            for (int i = 0; i<librarysize ; i++ ) {
                if(id == book[i].bookID)
                    book[i].print();
            }
        }
        else if (searchChoice == 2) {
            System.out.println("Enter the name");
            String bookName = sc.next();
            for (int i = 0; i<librarysize ; i++ ) {
                if(bookName.equalsIgnoreCase(book[i].name))
                    book[i].print();
            }
        }
        else if (searchChoice == 3) {
            System.out.println("Enter the Author name");
            String auth = sc.next();
            for (int i = 0; i<librarysize ; i++ ) {
                if(auth.equalsIgnoreCase(book[i].author))
                    book[i].print();
            }
        }
    }


    void issueBook(String name, String add,Long number,String idate, String rdate, int id) {
        Issue iss = new Issue(name,add,number,idate,rdate,id);
        issuedBook[issuesize++] = iss;
        for (int i = 0 ; i<librarysize ; i++) {
            if(id == book[i].bookID)
                book[i].avail = 'N';
        }
    }


    void menu(){
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the Library");
        System.out.println();
        System.out.println("1. Insert Book");
        System.out.println("2. List down all the books");
        System.out.println("3. List down all the authors");
        System.out.println("4. Seaching book");
        System.out.println("5. issue the Book");
        System.out.println("6. issued Books");
        System.out.println("0. exit");
    }
}
























/*
import java.util.Scanner;
import  java.util.*;
import  java.io.* ;

public class Main
{

    public static void main(String[] args)
    {
	System.out.println("<---Welcome to library--->");
	System.out.println("<--Book List -->");

	    System.out.println("1. Introduction to Computer Science Using Python"+ "\n" +
                "2. The Hidden Language of Computer Hardware and Software" + "\n" +
                "3. JavaScript: The Good Parts" +"\n" +
                "4. The Elements of Computing Systems: Building a Modern Computer from First Principles"+"\n" +
                "5. The Mythical Man-Month" +"\n" +
                "6. The Pragmatic Programmer" +"\n" +
                "7. Structure and Interpretation of Computer Programs"+"\n"+
                "8. Modern Operating Systems" +"\n" +
                "9.  " + "Introduction to Algorithms"+ "\n" + "10. C Programming Language");

        System.out.println();
        System.out.println("select number as per your book choice");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Author-  Charles Dierbach "+"\n" + " pub. year : 1997 "+
                        "\n" +
                        "Introduction to Computer Science Using Python: A Computational Problem-Solving Focus,recommended by Guido van Rossum, " +
                        "the creator of Python (â€œThis is not your average Python bookâ€¦I think this book is a great text for anyone teaching ");
                break;

            case 2:
                System.out.println("Author- Charles Petzold " + "\n" + " pub. year : 1997" +
                        "\n" +
                        "What do flashlights, the British invasion, black cats, and seesaws have to do with " +
                        "computers? In CODE, they show us the ingenious ways we manipulate language and invent new" +
                        " means of communicating with each other. And through CODE, we see how this ingenuity and our very human compulsion ");
                break;
            case 3:
                System.out.println("Author- Douglas Crockford" +"\n" + " pub. year : 1997"+
                        "\n" +
                        "Most programming languages contain good and bad parts, but JavaScript has more than its share of " +
                        "the bad, having been developed and released in a hurry " +
                        "before it could be refined. This authoritative book scrapes away these bad features to reveal a " +
                        "subset of JavaScript that's more");
                break;
            case 4:
                System.out.println("Author-Noam Nisan; Shimon Schocken"+ "\n" + " pub. year : 1997" +
                        "\n" +
                        "In the early days of computer science, the interactions of hardware, " +
                        "software, compilers, and operating system were simple enough to allow students to");
                break;
            case 5:
                System.out.println("Author- Frederick P. Brooks "+ "\n"+ " pub. year : 1997"+"\n" + "Fred Brooks offers insight for anyone managing complex projects");
                break;
            case 6:
                System.out.println("Author- Andrew Hunt; David Thomas "+ "\n" + " pub. year : 1997"+
                        "\n" +
                        "What others in the trenches say about The Pragmatic Programmer...\"The cool thing about this book is that it's great " +
                        "for keeping the programming process fresh. The book helps you to continue to grow and clearly comes from people who have been there");
                break;
            case 7:
                System.out.println("Author- Harold Abelson; Gerald Jay Sussman"+ "\n" + " pub. year : 1997"+
                        "\n" +
                        "Structure and Interpretation of Computer Programs has had a dramatic impact on computer science curricula over the past decade. This long-awaited");
                break;
            case 8:
                System.out.println("Author- Andrew S. Tanenbaum "+ "\n" + " pub. year : 1997"+
                        "\n" +
                        "Â  The widely anticipated revision of this worldwide best-seller incorporates the latest developments in operating systems " +
                        "technologies.Â  The Third Edition includes up-to-date materials " +
                        "on relevant operating systems such as Linux, Windows, and embedded real-time and multimedia systems. Includes new and updated ");
                break;
            case 9:
                System.out.println("Author- Thomas H. Cormen; Charles E. Leiserson; Ron Rivest"+"\n" + " pub. year : 1997"+
                        "\n" +
                        "Some books on algorithms are rigorous but incomplete; others cover masses of material but lack rigor. Introduction to Algorithms uniquely combines rigor and");
                break;
            case 10:
                System.out.println("Author- Dennis MacAlistair Ritchie" + "\n" + " pub. year : 1997" +"\n" + "Ritchie is best known as the creator of the C programming language, " +
                        "a key developer of the Unix operating system, and co-author of the book The C Programming Language; he was the 'R' in K&R " +
                        "(a common reference to the book's authors Kernighan and Ritchie). Ritchie worked together with Ken Thompson, who is credited " +
                        "with writing the original version of Unix; one of Ritchie's most important contributions to Unix was its porting to different machines and platforms.[16] They were so influential on Research Unix that Doug McIlroy later wrote, \"" +
                        "The names of Ritchie and Thompson may safely be assumed to be attached to almost everything not otherwise attributed");
                break;

            default:
                System.out.println("please enter vailid choice ");
        }

    }
}
*/