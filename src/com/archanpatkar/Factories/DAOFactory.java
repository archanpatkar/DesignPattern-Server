package com.archanpatkar.Factories;

import com.archanpatkar.DAO.DAO;
import com.archanpatkar.DAO.DAOValidater;


public class DAOFactory {
    public static DAO getDAO()
    {
        return new DAOValidater();
    }
}
