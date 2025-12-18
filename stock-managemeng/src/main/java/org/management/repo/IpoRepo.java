package org.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.management.dao.Ipo;

@Repository
public interface IpoRepo extends JpaRepository<Ipo, Integer> {
    // Custom query methods (if needed)
}
