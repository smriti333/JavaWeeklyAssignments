package JavaLab;


class Book {
  private String title;
  private String author;
  private String publisher;
  private int copyrightYear;

 // Constructor to initialize Book object
 public Book(String title, String author, String publisher, int copyrightYear) {
     this.title = title;
     this.author = author;
     this.publisher = publisher;
     this.copyrightYear = copyrightYear;
 }

 // Getter and Setter for title
 public String getTitle() {
     return title;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 // Getter and Setter for author
 public String getAuthor() {
     return author;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 // Getter and Setter for publisher
 public String getPublisher() {
     return publisher;
 }

 public void setPublisher(String publisher) {
     this.publisher = publisher;
 }

 // Getter and Setter for copyright year
 public int getCopyrightYear() {
     return copyrightYear;
 }

 public void setCopyrightYear(int copyrightYear) {
     this.copyrightYear = copyrightYear;
 }

 // toString method to return a nicely formatted, multi line description
 public String toString() {
     return "Title: " + title + "\n" +
            "Author: " + author + "\n" +
            "Publisher: " + publisher + "\n" +
            "Copyright Year: " + copyrightYear;
 }
}

//Driver class called Bookshelf
  public class BookShelf {
  public static void main(String[] args) {
	  
     // Creating Book objects
     Book book1 = new Book("Power", "Robert Greene", "Viking", 2010);
     Book book2 = new Book("Atomic Habits", "James Clear", "Avery", 2018);

     // Displaying the details of books
     System.out.println(book1);
     System.out.println();
     System.out.println(book2);

     // Updating book details
     book1.setPublisher("Classics");
     book1.setCopyrightYear(2011);
     System.out.println("\nAfter updating book1 details:");
     System.out.println(book1);
 }
}


