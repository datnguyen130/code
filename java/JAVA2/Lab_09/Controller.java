package JAVA2.Lab_09;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    List<Users> listUser = new ArrayList<>();

    public List<Users> loadingUsers(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){

            ResultSet rset = stmt.executeQuery("select * from Users");

            while (rset.next()){
                int id = rset.getInt("IdUser");
                String userName = rset.getString("Username");
                String password = rset.getString("Password");
                int role = rset.getInt("Role");
                String created = rset.getString("Created");
                String updated = rset.getString("Updated");

                Users obj = new Users(id,userName,password,role,created,updated);
                listUser.add(obj);


            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return  listUser;
    }

    public Users PreSignUp(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter new UserName : ");
        String name = input.nextLine();
        System.out.println("Enter password :");
        String password = input.nextLine();
        System.out.println("Enter role : ");
        int role = input.nextInt();
        Users obj = new Users(name,password,role);
        return obj;
    }

    public boolean SignUp(Users user){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String signup = "insert into Users(Username,Password,Role,Created) values('"+user.getUserName()+"','"+user.getPassword()+"',"+user.getRole()+", "+ "CURRENT_DATE()"+")";
            int countInsert = stmt.executeUpdate(signup);
            loadingUsers();

            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public Users SignIn(){
        Users obj = new Users();
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your UserName to LogIn : ");
            String name = input.nextLine();
            System.out.println("Enter your PassWord to Login : ");
            String pass = input.nextLine();
            String signIn = "SELECT * FROM Users WHERE Username = '" + name + "' AND Password = '" + pass + "'";
            ResultSet rset = stmt.executeQuery(signIn);

            if (rset.next()){
                int id = rset.getInt("IdUser");
                String userName = rset.getString("Username");
                String password = rset.getString("Password");
                int role = rset.getInt("Role");
                String created = rset.getString("Created");
                String updated = rset.getString("Updated");
                obj.setUser(id,userName,password,role,created,updated);
            }
            else {
                System.out.println("Invalid Username or Password");
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return obj;
    }

    List<Customers> listCuscomers = new ArrayList<>();

    public List<Customers> loadingCustomer(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            ResultSet rset = stmt.executeQuery("SELECT * FROM customer");
            while (rset.next()){
                int idCus = rset.getInt("IdCus");
                String nameCus = rset.getString("NameCus");
                String address = rset.getString("Address");
                String email = rset.getString("Email");
                int phone = rset.getInt("Phone");
                int level = rset.getInt("level");
                Customers objCustomer = new Customers(idCus,nameCus,address,email,phone,level);
                listCuscomers.add(objCustomer);

            }
        }  catch (SQLException ex){
            ex.printStackTrace();
        }
        return listCuscomers;
    }

    public Customers PreAddCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer ID that you want to add :");
        int idCus = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Customer name :");
        String nameCus = input.nextLine();
        System.out.println("Enter new Customer email : ");
        String email = input.nextLine();
        System.out.println("Enter new Customer Address :");
        String address = input.nextLine();
        System.out.println("Enter new Customer phone : ");
        int phone = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Customer Level :");
        int level = input.nextInt();
        Customers objCustomer = new Customers(idCus,nameCus,address,email,phone,level);
        return objCustomer;
    }

    public boolean AddCustomer(Customers objCustomer){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String addCustomer = "INSERT INTO Customer (IdCus, NameCus, Address, Email, Phone, level, Created) VALUES ( " +
                    objCustomer.getIdCus() + " , '" + objCustomer.getNameCus() + "', '" + objCustomer.getAddress() + "', '" +
                    objCustomer.getEmail() + "', " + objCustomer.getPhone()+ ", " + objCustomer.getLevel() + ", CURRENT_DATE())";
            int countAdd = stmt.executeUpdate(addCustomer);
            loadingCustomer();
            return true;
        }
        catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public Customers PreUpdateCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer ID to update :");
        int idCus = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Customer Email :");
        String email = input.nextLine();
        System.out.println("Enter new Customer Phone :");
        int phone = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Customer level :");
        int level = input.nextInt();
        input.nextLine();
        Customers objCustomer = new Customers();
        objCustomer.setIdCus(idCus);
        objCustomer.setEmail(email);
        objCustomer.setLevel(level);
        objCustomer.setPhone(phone);
        return objCustomer;
    }

    public int UpdateCustomer(Customers objCustomer){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strUpdate = "update customer set Email = '" + objCustomer.getEmail() + "', Phone = "+ objCustomer.getPhone() +", level = " + objCustomer.getLevel() + " where IdCus =  " + objCustomer.getIdCus() ;
            int countUpdate = stmt.executeUpdate(strUpdate);
            if (countUpdate == 0){
                return 0;
            }
            else {
                loadingCustomer();
                return 1;

            }
        }catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    public Customers PreDeleteCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer ID to delete : ");
        int id = input.nextInt();
        input.nextLine();
        Customers objCustomer = new Customers();
        objCustomer.setIdCus(id);
        return objCustomer;
    }

    public int DeleteCustomer(Customers objCustomer){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strDelete = "DELETE FROM customer WHERE IdCus = " + objCustomer.getIdCus() +  " and IdCus NOT IN (SELECT IdCus FROM orders)";
            int countDeleted = stmt.executeUpdate(strDelete);
            if (countDeleted == 0) {
                return 0;
            }
            else {
                loadingCustomer();
                return 1;
            }

        } catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    public void DisplayCustomer(List<Customers> obj){
        System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","idCus","nameCus","address","email","phone","level");
        for (int i = 0; i < obj.size(); i++){
            System.out.println(obj.get(i).toString());
        }

    }
    List<Books> listBooks = new ArrayList<>();

    public List<Books> loadingBooks(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            ResultSet rset = stmt.executeQuery("select * from books");
            while (rset.next()){
                int id = rset.getInt("IdBook");
                String nameBook = rset.getString("NameBook");
                String author = rset.getString("Author");
                int year = rset.getInt("YearPushlish");
                String category = rset.getString("Category");
                double price = rset.getDouble("Price");
                int qty = rset.getInt("Qty");
                int stt = rset.getInt("Status");
                String created = rset.getString("Created");
                String updated = rset.getString("Updated");
                Books objBook = new Books(id, nameBook,author,year,category,stt,qty,price,created,updated);
                listBooks.add(objBook);
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return listBooks;
    }

    public Books PreAddBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new Book ID : ");
        int bookID = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Book Name : ");
        String title = input.nextLine();
        System.out.println("Enter new Book Price :");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Enter new book qty :");
        int qty = input.nextInt();
        input.nextLine();
        System.out.println("Enter new book author :");
        String author = input.nextLine();
        Books objBook = new Books(bookID, title, author, price,qty);
        return objBook;

    }

    public boolean AddBook(Books objBook){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String addBook = "INSERT INTO books(IdBook, NameBook, Author, Qty, Price, Created) VALUES ( " + objBook.getBookID() +", '" + objBook.getTitle()
                    + "', '" + objBook.getAuthor() + "', " + objBook.getQty() + ", " + objBook.getPrice() + ",  CURRENT_DATE() )";
            int countInsert = stmt.executeUpdate(addBook);
            loadingBooks();
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public Books PreUpdateBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter BookID to update : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter new Price of Book :");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Enter new Qty of Book : ");
        int qty = input.nextInt();
        input.nextLine();
        Books objBook = new Books();
        objBook.setBookID(id);
        objBook.setPrice(price);
        objBook.setQty(qty);
        return objBook;
    }

    public int UpdateBook(Books objBook){

        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strUpdate = "update books set price = " + objBook.getPrice() + " , qty = "+ objBook.getQty() + " where IdBook =  " + objBook.getBookID() ;
            int countUpdate = stmt.executeUpdate(strUpdate);
            if (countUpdate == 0){
                return 0;
            }
            else {
                loadingBooks();
                return 1;

            }
        }catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    public Books PreDeleteBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter BookID to delete : ");
        int id = input.nextInt();
        input.nextLine();
        Books objBook = new Books();
        objBook.setBookID(id);
        return objBook;
    }

    public int DeleteBook(Books objBook){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strDelete = "DELETE FROM books WHERE idBook = " + objBook.getBookID() +  " and idBook NOT IN (SELECT idBook FROM orderdetail)";
            int countDeleted = stmt.executeUpdate(strDelete);
            if (countDeleted == 0) {
                return 0;
            }
            else {
                loadingBooks();
                return 1;
            }

        } catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    public void DisplayBooks(List<Books> listBooks){
        System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s%-30s\n","bookID","title","author","category","years","price","qty");
        for (int i = 0; i < listBooks.size(); i++){
            System.out.printf(listBooks.get(i).toString());
        }
    }

    public void displayOrdersByIdUser(Users objUser){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement();){
            int idSearch = objUser.getId();
            String strSelect = "SELECT * FROM orders WHERE IdCus =" + idSearch;
            System.out.println("Orders List with ID Customer = " + idSearch + " :" );
            ResultSet sresult = stmt.executeQuery(strSelect);
            System.out.println("\n IdOrders \t\t\t IdCustomer \t\t\t Status \t\t\t Total \t\t\t TimeOrder");

            while (sresult.next()){
                int idOrders = sresult.getInt("IdOrders");
                String idCus = sresult.getString("IdCus");
                int status = sresult.getInt("Status");
                double total = sresult.getDouble("Total");
                String timeOrder = sresult.getString("TimeOrder");
                System.out.println(idOrders + "\t\t\t" + idCus + "\t\t\t" + status + "\t\t\t" + total + "\t\t\t" + timeOrder);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void top3NewBook(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement();) {
            String strSelect = "SELECT * FROM `books` ORDER BY YearPushlish DESC LIMIT 3";
            ResultSet sresult = stmt.executeQuery(strSelect);
            System.out.println("\n IdBook \t\t  NameBook \t\t Author \t\t YearPushlish \t\t Category \t\t Price \t\t Qty \t\t Status  ");

            while (sresult.next()){
                int idBook = sresult.getInt("IdBook");
                String nameBook = sresult.getString("NameBook");
                String author = sresult.getString("Author");
                int yearPushlish = sresult.getInt("YearPushlish");
                String category = sresult.getString("Category");
                double price = sresult.getDouble("Price");
                int qty = sresult.getInt("Qty");
                int status = sresult.getInt("Status");
                System.out.println("\n" + idBook + "\t\t\t" + nameBook + "\t\t\t" + author + "\t\t\t" + yearPushlish + "\t\t\t" + category + "\t\t\t" + price + "\t\t\t" + qty + "\t\t\t" + status + "\n");
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void top3BestSale(){
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement();
        ){
            String strSelectTop3BestSale ="SELECT books.IdBook, NameBook, Category, books.Price, SUM(orderdetail.Qty) AS TotalQty FROM books INNER JOIN orderdetail ON books.IdBook = orderdetail.IdBook INNER JOIN orders ON orderdetail.IdOrder = orders.IdOrders WHERE orders.Status != 0 GROUP BY books.IdBook, NameBook, Category, books.Price ORDER BY TotalQty DESC LIMIT 3";
            ResultSet sresult = stmt.executeQuery(strSelectTop3BestSale);
            System.out.println("\n IdBook \t\t NameBook \t\t Category \t\t Price  \t\t Qty");

            while (sresult.next()){
                int idBook = sresult.getInt("books.IdBook");
                String nameBook = sresult.getString("NameBook");
                String category = sresult.getString("Category");
                Double price = sresult.getDouble("books.Price");
                int qty = sresult.getInt("TotalQty");
                System.out.println("\n" + idBook + "\t\t\t" + nameBook + "\t\t\t" + category + "\t\t\t" + price + "\t\t\t" +qty + "\n");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void searchByCategory(){
        try (
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
                Statement stmt = conn.createStatement();
        ) {
            String categorySearch = "";
            Scanner input = new Scanner(System.in);
            System.out.println("\n Enter the kind of category that you want to search : ");
            categorySearch = input.nextLine();
            String strSelect = "SELECT IdBook, NameBook, Category FROM books WHERE Category LIKE \'%" + categorySearch + "%\'" ;
            ResultSet sresult = stmt.executeQuery(strSelect);
            if ( !sresult.next()){
                System.out.println("No search found!!! " );
                System.out.println("Try again later!!! ");
            }
            else {
                System.out.println("IdBook \t\t NameBook \t\t Category");

                while (sresult.next()){
                    int id = sresult.getInt("IdBook");
                    String name = sresult.getString("NameBook");
                    String category = sresult.getString("Category");
                    System.out.println(id + "\t\t\t" + name + "\t\t\t" + category);
                }
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void searchByAuthor(){
        try (
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
                Statement stmt = conn.createStatement();
        ) {
            String categorySearch = "";
            Scanner input = new Scanner(System.in);
            System.out.println("\n Enter the author's name that you want to search : ");
            categorySearch = input.nextLine();
            String strSelect = "SELECT IdBook, NameBook,Author, Category FROM books WHERE Author LIKE \'%" + categorySearch + "%\'" ;
            ResultSet sresult = stmt.executeQuery(strSelect);
            if ( !sresult.next()){
                System.out.println("No search found!!! " );
                System.out.println("Try again later!!! ");
            }
            else {
                System.out.println("\nIdBook \t\t NameBook \t\t Author \t\t Category");
                while (sresult.next()){
                    int id = sresult.getInt("IdBook");
                    String name = sresult.getString("NameBook");
                    String author = sresult.getString("Author");
                    String category = sresult.getString("Category");
                    System.out.println(id +"\t\t\t" + name + "\t\t\t" + author + "\t\t\t" + category);
                }
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void searchByIdBook(){
        try (
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
                Statement stmt = conn.createStatement();
        ) {
            int idSearch = 0 ;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the ID Book that you want to search: ");
            idSearch = input.nextInt();
            String strSelect = "SELECT IdBook, NameBook, Author, Category, Price, Qty, YearPushlish  FROM books WHERE IdBook = " +  idSearch ;
            ResultSet sresult = stmt.executeQuery(strSelect);
            System.out.println("IdBook \t\t NameBook \t\t Author \t\t Category \t\t Price \t\t Qty \t\t YearPushLish");

            while (sresult.next()){
                int id = sresult.getInt("IdBook");
                String name = sresult.getString("NameBook");
                String author = sresult.getString("Author");
                String category = sresult.getString("Category");
                double price = sresult.getDouble("Price");
                int qty = sresult.getInt("Qty");
                String year = sresult.getString("YearPushlish");
                System.out.println(id + "\t\t\t" + name + "\t\t\t" + author + "\t\t\t" + category +"\t\t\t" + price + "\t\t\t" + qty + "\t\t\t" + year);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void checkUser(Users obj){
        if (obj.getRole() == 1){
            AdminMode();
        } else if (obj.getRole() == 2){

            CustomerMode(obj);
        }
    }

    public void CustomerMode(Users obj){
        System.out.println("Welcome to Customer Mode : ");
        Scanner input = new Scanner(System.in);
        int choice = 1;
        do {
            System.out.println("Enter your choice : ");
            System.out.println("1. View All Books ");
            System.out.println("2. View Your Orders ");
            System.out.println("3. View Top 3 New Books");
            System.out.println("4. View Top 3 Best Sale Books");
            System.out.println("5. Search Book By Category");
            System.out.println("6. Search Book By Author");
            System.out.println("7. Search Book By ID Book");
            System.out.println("0. Out Customer Mode ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    DisplayBooks(listBooks);
                    break;
                case 2:
                    displayOrdersByIdUser(obj);
                    break;
                case 3:
                    top3NewBook();
                    break;
                case 4:
                    top3BestSale();
                    break;
                case 5:
                    searchByCategory();
                    break;
                case 6:
                    searchByAuthor();
                    break;
                case 7:
                    searchByIdBook();
                    break;
                case 0:
                    System.out.println("Out Customer Mode ");
                    break;
                default:
                    System.out.println("Invalid choice ");
                    break;
            }
        }while (choice != 0);
    }
    
    public void AdminMode(){
        System.out.println("Welcome to Admin Mode ");
        Scanner input = new Scanner(System.in);
        int choice = 1;
        do {
            System.out.println("Enter your choice : ");
            System.out.println("1. Add New Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Add New Customer");
            System.out.println("5. Update Customer");
            System.out.println("6. Delete Customer");
            System.out.println("7. View All Customers");
            System.out.println("0. Out Admin Mode ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    if (AddBook(PreAddBook())){
                        System.out.println("Add Book successfully");
                    }else {
                        System.out.println("Add Book Fail");
                    }
                    break;
                case 2:
                    int updateBook = UpdateBook(PreUpdateBook());
                    if (updateBook == 0){
                        System.out.println("No Book Updated");
                    } else if (updateBook == 1){
                        System.out.println("Book Updated");
                    }else if (updateBook == -1){
                        System.out.println("ERR!!!");
                    }
                    break;
                case 3:
                    int deleteBook = DeleteBook(PreDeleteBook());
                    if (deleteBook == 0){
                        System.out.println("No Book Deleted");
                    } else if (deleteBook == 1){
                        System.out.println("Book Deleted");
                    }else if (deleteBook == -1){
                        System.out.println("ERR!!!");
                    }
                    break;
                case 4:
                    if (AddCustomer(PreAddCustomer())){
                        System.out.println("Add Customer successfully");
                    } else {
                        System.out.println("Add Customer Fail");
                    }
                    break;
                case 5:
                    int updateCustomer = UpdateCustomer(PreUpdateCustomer());
                    if (updateCustomer == 0){
                        System.out.println("No Customer Updated");
                    } else if (updateCustomer == 1 ){
                        System.out.println("Customer Updated");
                    } else if (updateCustomer == -1){
                        System.out.println("ERR");
                    }
                    break;
                case 6:
                    int deleteCustomer = DeleteCustomer(PreDeleteCustomer());
                    if (deleteCustomer == 0){
                        System.out.println("No Customer Deleted");
                    } else if (deleteCustomer == 1){
                        System.out.println("Customer Deleted");
                    }else if (deleteCustomer == -1){
                        System.out.println("ERR");
                    }
                    break;
                case 7:
                    DisplayCustomer(listCuscomers);
                    break;
                case 0:
                    System.out.println("Out Admin Mode ");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while (choice != 0);
    }

    public void DisplayBag(List<Bag> listBag){
        System.out.printf("%-30s%-30s%-30s%-30s%-30s\n","idBook","nameBook","price","qty","discount");
        for (int i = 0; i < listBag.size(); i++){
            if (listBag.get(i).getQty() > 0){
                System.out.printf(listBag.get(i).toString());
            }

        }
    }

    public List<Bag> PreCreateBag(List<Books> listBooks){
        List<Bag> listBags = new ArrayList<>();
        for (int i = 0; i < listBooks.size() ; i ++){
            Bag objBag = new Bag(listBooks.get(i).getBookID(),listBooks.get(i).getTitle(),listBooks.get(i).getPrice(),0);
            listBags.add(i,objBag);
        }
        return listBags;
    }

    public ListOfBooksBag CreateListBooksBag(List<Books> listBooks){
        ListOfBooksBag listBooksBag = new ListOfBooksBag();
        List<Bag> listBags = PreCreateBag(listBooks);
        System.out.println("============================");
        System.out.println("||  Welcome to Books Shop ||");
        System.out.println("============================\n");
        char choiceIn = 'n';
        char choiceOut = 'y';
        do{
            System.out.println("There are books on Shop : \n");
            DisplayBooks(listBooks);
            Scanner input = new Scanner(System.in);
            do {
                System.out.println("Do you want to buy some books ? : ");
                System.out.println("Enter 'y' to Continue to choose book");
                System.out.println("Enter 'n' to Stop choose book" );
                choiceIn = input.next().charAt(0);
                switch (choiceIn) {
                    case 'y' -> {
                        int idChoice = 0;
                        int qtyChoice = 0;
                        int index = -1;
                        String nameChoice = "";
                        System.out.println("Enter the ID Book that you want to buy : ");
                        idChoice = input.nextInt();
                        input.nextLine();
                        for (int i = 0; i < listBooks.size(); i++) {
                            if (listBooks.get(i).getBookID() == idChoice) {
                                qtyChoice = listBooks.get(i).getQty();
                                nameChoice = listBooks.get(i).getTitle();
                                index = i;
                                break;
                            }
                        }
                        if (index < 0) {
                            System.out.println("You entered incorrect ID Book. Please try again");
                        } else {
                            if (qtyChoice == 0) {
                                System.out.println("The Qty of this book is zero ! Please try other Books");
                            } else {
                                System.out.println("The Qty of this book is " + qtyChoice + "\nHow many '" + nameChoice + "' book that you want to buy");
                                int qtyOrder = input.nextInt();
                                if (qtyOrder > qtyChoice) {
                                    System.out.println("Sorry. Your choice is over the Qty of this book!\nPlease try again");
                                } else {
                                    qtyChoice = qtyChoice - qtyOrder;

                                    listBooks.get(index).setQty(qtyChoice);
                                    listBags.get(index).plusQty(qtyOrder);
                                    System.out.println("Thank for your good choice");
                                }
                            }
                        }
                    }
                    case 'n' -> System.out.println("Thanks you very much!!!");
                    default -> System.out.println("Invalid choice");
                }

            }  while (choiceIn != 'n' );

            System.out.println("Do you want to go to Check out step ?");
            System.out.println("Enter 'y' to go to Check out");
            System.out.println("Enter 'n' to turn back for shopping");
            choiceOut = input.next().charAt(0);
        } while (choiceIn == 'n' & choiceOut != 'y');
        listBooksBag.setListBag(listBags);
        listBooksBag.setListBooks(listBooks);
        return listBooksBag;
    }

    public Customers ReturnCustomerByUser(Users objUser){
        Customers objCus = new Customers();
        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
             Statement stmt = conn.createStatement()){
            String strSelect = "SELECT * FROM customer where IdCus = " + objUser.getId();
            ResultSet rset = stmt.executeQuery(strSelect);
            if (rset.next()){
                objCus.setIdCus(rset.getInt("IdCus"));
                objCus.setAddress(rset.getString("Address"));
                objCus.setEmail(rset.getString("Email"));
                objCus.setLevel(rset.getInt("level"));
                objCus.setNameCus(rset.getString("NameCus"));
                objCus.setPhone(rset.getInt("Phone"));
            }

        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return objCus;
    }

    public double TotalCash (ListOfBooksBag listOfBooksBag){
        double total = 0;
        List<Bag> listBag = listOfBooksBag.getListBag();
        for (int i = 0; i < listBag.size(); i++){
            total += listBag.get(i).getPrice() * listBag.get(i).getQty();
        }
        return total;
    }

    public CheckOut CheckOut(Users objUser, ListOfBooksBag listOfBooksBag){
        // Work with SQL
        double totalCash = TotalCash(listOfBooksBag);
        List<Books> listBooks = listOfBooksBag.getListBooks();
        List<Bag> listBag = listOfBooksBag.getListBag();
        try (
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/libary","root","");
                Statement stmt = conn.createStatement();
        ){
            try {
                int idOrder = -1;
                conn.setAutoCommit(false);
                for (int i = 0; i < listBooks.size(); i++){
                    String strUpdateBooks = "update books set qty = "+ listBooks.get(i).getQty() + " where IdBook =  " + listBooks.get(i).getBookID() ;
                    stmt.addBatch(strUpdateBooks);
                }

                stmt.addBatch("INSERT INTO Orders(IdCus, Status, Total, TimeOrder, Created)\n" +
                        " VALUES ( " + objUser.getId()+" , 1, " + totalCash +
                        " , CURRENT_DATE() , CURRENT_DATE())");
                stmt.executeBatch();
                ResultSet rset = stmt.executeQuery("select max(IdOrders) AS idnew from orders");
                while (rset.next()){
                    idOrder = rset.getInt("idnew");
                }
                for (int i = 0; i < listBag.size(); i++){
                    if (listBag.get(i).getQty() == 0){
                        continue;
                    }
                    String strInsertOrderDetail = "INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES " +
                            "("+idOrder+" , "+listBag.get(i).getIdBook()+" , "+listBag.get(i).getQty()+
                            " , "+listBag.get(i).getPrice()+" , CURRENT_DATE())";
                    stmt.addBatch(strInsertOrderDetail);
                }
                stmt.executeBatch();
                conn.commit();
            } catch (SQLException ex){
                System.out.println("Update SQL failed");
                conn.rollback();
                ex.printStackTrace();
            }

        }  catch (SQLException ex){
            System.out.println("ERR SQL Exception");
            ex.printStackTrace();
        }

        // Return CheckOut Obj
        Customers objCus = ReturnCustomerByUser(objUser);
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int sign = 0;
        String mail = "";
        if (objCus.getEmail() == null ){
            System.out.println("Enter email to check out :");
            mail = input.nextLine();
        }
        else {
            System.out.println("Your email is : " + objCus.getEmail());
            System.out.println("Do you want to use that email to check out or the other email ?");
            do {
                System.out.println("Choose your choice :");
                System.out.println("1. Use " + objCus.getEmail() + " to check out");
                System.out.println("2. Enter the other email to check out");
                choice = input.nextInt();
                switch (choice){
                    case 1:
                        mail = objCus.getEmail();
                        sign = 1;
                        break;
                    case 2:
                        mail = input.nextLine();
                        sign = 1;
                        break;
                    default:
                        System.out.println("invalid choice");
                }
            }while (sign != 1);
        }
        String paymentMethod = "";
        do {
            System.out.println("Choose your payment methods");
            System.out.println("1. COD method");
            System.out.println("2. Visa method");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                    System.out.println("You choose COD method");
                    paymentMethod = " COD Method ";
                    sign = 2;
                    break;
                case 2:
                    System.out.println("You choose Visa method");
                    sign = 2;
                    paymentMethod = " Visa method ";
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (sign != 2);
        String addressShip = "";
        System.out.println("Enter your address that you want to ship :");
        addressShip = input.nextLine();
        return new CheckOut(mail,paymentMethod,addressShip,totalCash);
    }

    public void DisplayReview(Users objUser, ListOfBooksBag listOfBooksBag){
        CheckOut objCheckOut = CheckOut(objUser, listOfBooksBag);
        System.out.println("Let Review your Bag");
        System.out.println("List Books you ordered");
        DisplayBag(listOfBooksBag.getListBag());
        System.out.println();
        System.out.println("The total money that you need paying is : " + objCheckOut.getPrice() );
        System.out.println("The address ship is : " + objCheckOut.getAddress());
    }
}
