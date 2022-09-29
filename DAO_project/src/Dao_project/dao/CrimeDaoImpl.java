package Dao_project.dao;

import Dao_project.exception.CriminalException;
import Dao_project.model.Criminal;
import Dao_project.utility.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CrimeDaoImpl implements CrimeDao{

    @Override
    public String getCriminalName(String crime) throws CriminalException {
        String cName = null;

        try (Connection cn = DBUtil.provideConnection()) {
            PreparedStatement ps = cn.prepareStatement("Select name from criminalInformation where attachedCrime=?");
            ps.setString(1,crime);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                String n = rs.getString("name");
                cName = "Criminal name is "+n;
            }else {
                cName="Criminal does not exists";
            }
        } catch (SQLException e) {
            cName = e.getMessage();
        }
        return cName;
    }



    @Override
    public List<Criminal> getAllCriminalDetails() throws CriminalException {
        List<Criminal> crm = new ArrayList<>();

        try (Connection cn = DBUtil.provideConnection()) {
            PreparedStatement ps = cn.prepareStatement("Select * from criminalInformation");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                String n = rs.getString("name");
                int a = rs.getInt("age");
                String g = rs.getString("gender");
                String address = rs.getString("address");
                String im = rs.getString("identifyingMarks");
                String ac = rs.getString("areaOfCrime");
                String c = rs.getString("attachedCrime");

                Criminal cr = new Criminal(n,a,g,address,im,ac,c);
                crm.add(cr);
            }

            if(crm.size()==0){
                throw new CriminalException("No Criminal found");
            }
        } catch (SQLException e) {
            throw new CriminalException(e.getMessage());
        }

        return crm;
    }




    @Override
    public String getCrimeStatus(String name) throws CriminalException {
        String result = null;

        try (Connection cn = DBUtil.provideConnection()) {
            PreparedStatement ps = cn.prepareStatement("select status from crimeStatus where cname=?");
            ps.setString(1,name);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                result = rs.getString("status");
            }else{
                throw new CriminalException("Criminal not found");
            }
        } catch (SQLException e) {
            result = e.getMessage();
        }
        return result;
    }
}
