package Dao_project.usercase;

import Dao_project.dao.CrimeDao;
import Dao_project.dao.CrimeDaoImpl;
import Dao_project.exception.CriminalException;

import java.util.Scanner;

public class CriminalName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the crime name in bangalore to get the criminal name :");
        System.out.println("Examples : Murder , Hit and run, Bank robery");
        System.out.println("----------------------------------------------------------");
        String name = sc.nextLine();

        CrimeDao cd = new CrimeDaoImpl();
        try {
            String result = cd.getCriminalName(name);
            System.out.println(result);
        } catch (CriminalException e) {
            throw new RuntimeException(e);
        }
    }
}
