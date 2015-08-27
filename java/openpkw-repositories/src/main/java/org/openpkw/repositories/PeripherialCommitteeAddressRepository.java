package org.openpkw.repositories;

import org.openpkw.model.entity2.PeripheralCommitteeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Karol Dziegiel on 27.08.15.
 */
@Repository
public interface PeripherialCommitteeAddressRepository extends JpaRepository<PeripheralCommitteeAddress, Long> {
}
