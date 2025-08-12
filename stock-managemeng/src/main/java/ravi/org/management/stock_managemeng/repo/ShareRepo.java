package ravi.org.management.stock_managemeng.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ravi.org.management.stock_managemeng.dao.Share;

@Repository
public interface ShareRepo extends JpaRepository<Share,String> {
}
