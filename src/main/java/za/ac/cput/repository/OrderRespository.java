package za.ac.cput.repository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OrderRespository extends JpaRepository<Order, String>{
    String findOrderIdByCustomerId(String customerId);
}
