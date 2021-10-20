/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.service;

import com.ca.control.dao.MesdiahoraDao;
import com.ca.control.domain.Mesdiahora;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesdiahoraService {
    
    @Autowired
    MesdiahoraDao mdhD;
    
    public List<Mesdiahora> Lista(){
        return mdhD.Lista();
    }
}
