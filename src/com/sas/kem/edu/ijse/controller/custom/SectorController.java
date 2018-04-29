/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sas.kem.edu.ijse.controller.custom;

import com.sas.kem.edu.ijse.controller.SuperController;
import com.sas.kem.edu.ijse.dto.SectorDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface SectorController extends SuperController<SectorDTO>{

    @Override
    public default boolean add(ArrayList<SectorDTO> dtoList) throws Exception {return true;}

    @Override
    public default boolean update(ArrayList<SectorDTO> dtoList) throws Exception {return true;}
    
    public boolean remove(String id) throws Exception;
    
    public boolean rename(String rename,String curName) throws Exception;
    
    public boolean add(String secName) throws Exception;
    
}
