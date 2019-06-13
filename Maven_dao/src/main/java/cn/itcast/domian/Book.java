package cn.itcast.domian;

public class Book  {
    private Integer id;
    private String bookName;
    private String author;
    private String company;
    private Double price;



    public Integer getId() {

        return id;
    }



    public void setId(Integer id) {

        this.id = id;
    }



    public String getBookName() {

        return bookName;
    }



    public void setBookName(String bookName) {

        this.bookName = bookName;
    }


    public String getAuthor() {

        return author;
    }



    public void setAuthor(String author) {

        this.author = author;
    }



    public String getCompany() {

        return company;
    }



    public void setCompany(String company) {

        this.company = company;
    }



    public Double getPrice() {

        return price;
    }



    public void setPrice(Double price) {

        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
