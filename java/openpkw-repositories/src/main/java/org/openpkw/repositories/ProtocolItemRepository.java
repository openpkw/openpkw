package org.openpkw.repositories;

import org.openpkw.model.entity.ProtocolItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocolItemRepository extends JpaRepository<ProtocolItem, Long> {

	
}
