package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SellerDao  sellerDAo = DaoFactory.createSellerDao();
        Seller seller = sellerDAo.findById(3);
        System.out.println(seller);
    }
}