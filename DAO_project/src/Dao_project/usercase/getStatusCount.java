package Dao_project.usercase;

import Dao_project.dao.CrimeDao;
import Dao_project.dao.CrimeDaoImpl;
import Dao_project.exception.CriminalException;

import java.util.Scanner;

public class getStatusCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the crime status type to check the count");
        System.out.println("Example : solved or unsolved");
        System.out.println("--------------------------------------------------------");
        String status = sc.next();

        CrimeDao cd = new CrimeDaoImpl();

        try {
            int result = cd.getNumberOfCrimeStatus(status);
            System.out.println("Total number of "+status+" crimes are "+result);
        } catch (CriminalException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
