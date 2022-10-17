/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.pojo.Payments;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dea Fitria
 */
public class PaymentsDao extends BaseDao {
    
    public Payments getByProperty(String property, Object value) {
        return Payments.class.cast(super.getByProperty(Payments.class, property, value));
    }
    
    public Payments getById(int id) {
        return Payments.class.cast(super.getById(Payments.class, id));
    }
    public List<Payments> getAll() {
        List<Payments> payments = new ArrayList<>();
        listData = super.getAll(Payments.class);
        listData.forEach((list) -> {
            payments.add(Payments.class.cast(list));
        });
        
        return payments;
    }
}
