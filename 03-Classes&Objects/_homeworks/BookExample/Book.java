public class Book {
    String title;
    String type;
    int page;
    Author author;
    boolean isHardCover;
    int currentPage;  //default: 0

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        if (currentPage < 0)
            System.out.println("Error! The current page cannot be a negative number.");
        else if(currentPage <= page)
            this.currentPage = currentPage;
        else
            System.out.println("Error! The current page cannot greater than the number of pages in the book.");
    }
}
