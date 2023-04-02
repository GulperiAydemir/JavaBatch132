package practices.practice06nt;

public class Q03 {


    String bookName;
    String authorName;
    int numOfPage;
    String bookID;

    static int numOfBooks;//2

    public static void main(String[] args) {

        Q03 book1 = new Q03("Crime and Pusnisment", "Dostoyevski", 650);
        Q03 book2 = new Q03("Thousand Shiny Suns", "Khaled Houseyni", 276);
        Q03 book3 = new Q03("A wild sheep chase", "Murakami", 756);


    }

    Q03(String bookName, String authorName, int numOfPage) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numOfPage = numOfPage;


        numOfBooks++;
        bookID = bookName.substring(0, 2) + numOfBooks;



            System.out.println("Book Name: " + bookName + "Author Name: " + authorName + "Number Of Page " + numOfPage +
                    "Book ID " + bookID);
        }
    }



