/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sas.kem.edu.ijse.controller.custom.impl;

import com.sas.kem.edu.ijse.controller.custom.DateController;
import com.sas.kem.edu.ijse.dao.DAOFactory;
import com.sas.kem.edu.ijse.dao.custom.DateDAO;
import com.sas.kem.edu.ijse.dto.DateDTO;

/**
 *
 * @author Vidura
 */
public class DateControllerImpl implements DateController{
    
    private DateDAO dateDAO;

    public DateControllerImpl() {
        
        dateDAO=(DateDAO) DAOFactory.getInstance().getDAOTypes(DAOFactory.daoTypes.DATE);
    }
    
    
    @Override
    public DateDTO getDateDetail() throws Exception {
        
        return dateDAO.getDateDetail();
    }
    
}
