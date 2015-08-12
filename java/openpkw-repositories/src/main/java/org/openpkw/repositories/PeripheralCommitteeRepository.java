package org.openpkw.repositories;

import org.openpkw.model.entity.PeripheralCommittee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PeripheralCommitteeRepository extends JpaRepository<PeripheralCommittee, Long> {

	public PeripheralCommittee findById();
}
