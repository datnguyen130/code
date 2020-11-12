package JAVA2.Lab_09;

import java.util.List;

public class ListOfBooksBag {
    private List<Books> listBooks;
    private List<Bag> listBag;

    public ListOfBooksBag(){
        listBooks = null;
        listBag = null;
    }

    public List<Bag> getListBag() {
        return listBag;
    }

    public List<Books> getListBooks() {
        return listBooks;
    }

    public void setListBag(List<Bag> listBag) {
        this.listBag = listBag;
    }

    public void setListBooks(List<Books> listBooks) {
        this.listBooks = listBooks;
    }
}
