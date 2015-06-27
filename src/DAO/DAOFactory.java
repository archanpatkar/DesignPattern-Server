package DAO;


public class DAOFactory {
    public static DAO getDAO()
    {
        return new DAOValidater();
    }
}
