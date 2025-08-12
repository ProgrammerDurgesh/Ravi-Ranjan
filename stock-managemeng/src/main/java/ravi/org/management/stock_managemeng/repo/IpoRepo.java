package ravi.org.management.stock_managemeng.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ravi.org.management.stock_managemeng.dao.Ipo;

@Repository
public interface IpoRepo extends JpaRepository<Ipo, Integer> {
    // Custom query methods (if needed)
}
