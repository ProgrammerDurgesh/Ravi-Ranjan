package org.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.management.dao.Mtf;

public interface MtfRepo extends JpaRepository<Mtf, Integer> {
}
