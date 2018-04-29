/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sas.kem.edu.ijse.controller.custom;

import com.sas.kem.edu.ijse.controller.SuperController;
import com.sas.kem.edu.ijse.dto.DateDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface DateController extends SuperController<DateDTO>{

    @Override
    public default ArrayList<DateDTO> getAll() throws Exception {return null;}
    
    public DateDTO getDateDetail() throws Exception;

    @Override
    public default boolean add(ArrayList<DateDTO> dtoList) throws Exception {return true;}

    @Override
    public default boolean update(ArrayList<DateDTO> dtoList) throws Exception {return true;}

    @Override
    public default boolean add(DateDTO dto) throws Exception {return true;}
    
    
    
}
