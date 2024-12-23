import java.util.*;
class Book{
String name,author;
int price,num_pages;
Book()
{
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}
void SetDetails()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of the book:");
name=sc.next();
System.out.println("Enter author name:");
author=sc.next();
System.out.println("Enter price:");
price=sc.nextInt();
System.out.println("Enter number of pages:");
num_pages=sc.nextInt();
}
void getdetails()
{
System.out.println("Name of the book:"+name);
System.out.println("Author name:"+author);
System.out.println("Price of the book:"+price);
System.out.println("Number of pages in the book:"+num_pages);
}
public String toString() {
        return "Book Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: " + price + "\n" +
               "Number of Pages: " + num_pages;}
}
class MyBook{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of books");
int n=sc.nextInt();

Book[] books=new Book[n];
for(int i=0;i<n;i++)
{
books[i]=new Book();
books[i].SetDetails();
books[i].getdetails();
}
System.out.println("\nAll Book Details:");
for (Book book : books) {
            System.out.println(book);}
}
}