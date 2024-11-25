package DAO;

import entities.City;
import entities.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class CustomerDAO extends GenericDAO<Customer>{
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }

    public Customer getByName(String fName, String lName) {
        Query<Customer> query = getCurrentSession().createQuery("select c from Customer c where c.first_name = :fName and c.last_name = :lName", Customer.class);
        query.setParameter("fName", fName);
        query.setParameter("lName", lName);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
