public class Reader {
    String name;
    int age;
    char sex;   //M,F,m,f

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex == 'm' || sex == 'M' || sex == 'f' || sex == 'F')
            this.sex = sex;
        else
            System.out.println("Error! Undefined sex");
    }

    public void read(Book book, int numberOfPagesRead){
        if(numberOfPagesRead > book.getPage())
            System.out.println("Error! The number of pages read cannot be greater than the number of pages in book.\n");
        else if(book.getCurrentPage() > numberOfPagesRead)
            System.out.println("Error! The number of pages read cannot be less than the number of pages currently read.\n");
        else{
            System.out.println("Reader reading... --> The book title is: " + book.getTitle() + " and its author is: " + book.getAuthor().name);
            book.setCurrentPage(numberOfPagesRead);
            System.out.println("Total number of pages read: " + book.getCurrentPage() + " (total number of pages in the book: " + book.getPage() + ")\n");
        }
    }
}
