package com.example.onlinepreorderingsystem.dao;

import com.example.onlinepreorderingsystem.entity.OrderDetails;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public interface OrderDetailsDao extends JpaRepository<OrderDetails,Long>
{
    @Modifying
    @Query(value = "update OrderDetails set idOrder = :idOrder where idOrder = -1 and idCustomer = :idCustomer")
   public void setNewOrderId(long idOrder, long idCustomer);

    public List<OrderDetails> findByIdOrderAndIdCustomer(Long idOrder, Long idCustomer);
    public List<OrderDetails> findAllByIdOrder(Long id);
    @Query("select sum(price) from Product where id in (select idProduct from OrderDetails where idOrder = :id)")
    Double getTotalById(Long id);

    @Query("select sum(od.qty * p.price) from OrderDetails od inner join Product p on od.idProduct = p.id where od.idCustomer = :idCustomer and od.idOrder = :idOrder")
    Double getTotalByIdOrderAndIdCustomer(Long idOrder, Long idCustomer);

    List<OrderDetails> findByIdOrderAndIdProductAndIdCustomer(Long idOrder, Long idProduct, Long idCustomer);




}
