/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sas.kem.edu.ijse.controller.custom;

import com.sas.kem.edu.ijse.controller.SuperController;
import com.sas.kem.edu.ijse.dto.PasswordDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface PasswordController extends SuperController<PasswordDTO>{

    @Override
    public default boolean add(ArrayList<PasswordDTO> dtoList) throws Exception {return true;}

    @Override
    public default boolean update(ArrayList<PasswordDTO> dtoList) throws Exception {return true;}

    @Override
    public default boolean add(PasswordDTO dto) throws Exception {return true;}
    
    public boolean updatePassword(String userName, String password,String lastName) throws Exception ; 
    
    
    
    
}
