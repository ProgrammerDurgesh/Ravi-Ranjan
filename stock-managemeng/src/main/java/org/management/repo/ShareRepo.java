package org.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.management.dao.Share;

public interface ShareRepo extends JpaRepository<Share,Integer> {
}
