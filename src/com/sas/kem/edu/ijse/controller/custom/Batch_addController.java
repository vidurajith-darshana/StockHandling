/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sas.kem.edu.ijse.controller.custom;

import com.sas.kem.edu.ijse.controller.SuperController;
import com.sas.kem.edu.ijse.dto.Batch_addDTO;

/**
 *
 * @author Vidura
 */
public interface Batch_addController extends SuperController<Batch_addDTO>{
    
   public String getProId(String baid) throws Exception;
       
}