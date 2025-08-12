package ravi.org.management.stock_managemeng.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ravi.org.management.stock_managemeng.dao.Share;

public interface ShareRepo extends JpaRepository<Share,Integer> {
}
