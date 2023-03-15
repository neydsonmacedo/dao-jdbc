package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SellerDao  sellerDAo = DaoFactory.createSellerDao();
        System.out.println("=== Test 1: seller findById === ");
        Seller seller = sellerDAo.findById(3);

        System.out.println(seller);
    }
}