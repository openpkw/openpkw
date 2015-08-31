package org.openpkw.services.implementation;

import org.openpkw.model.dto.ResultDTO;
import org.openpkw.model.entity.PeripheralCommittee;
import org.openpkw.model.entity.Protocol;
import org.openpkw.repositories.PeripheralCommitteeRepository;
import org.openpkw.repositories.ProtocolRepository;
import org.openpkw.services.interfaces.CurrentResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Karol Dzięgiel on 8/19/2015.
 */

@Service
public class CurrentResultServiceImpl implements CurrentResultService {

    @Autowired
    private ProtocolRepository protocolRepository;

    @Autowired
    private PeripheralCommitteeRepository peripheralCommitteeRepository;


    public ResultDTO getResult() {

        Long cardsGivenSum;
        Long allowedToVoteSum;
        Integer countedCommitteesPercentage;
        Integer turnoutPercentage;

        cardsGivenSum = allowedToVoteSum = 0L;
        List<Protocol> protocols = protocolRepository.findAll();
        List<PeripheralCommittee> peripheralCommittees = peripheralCommitteeRepository.findAll();
        countedCommitteesPercentage = (protocols.size() / peripheralCommittees.size()) * 100;

        for (PeripheralCommittee pc : peripheralCommittees) {
            allowedToVoteSum += pc.getAllowedToVote();
        }

        for (Protocol p : protocols) {
            cardsGivenSum += p.getCardsGiven();
        }

        Long temp = (cardsGivenSum / allowedToVoteSum);
        Integer temp2 = temp.intValue();
        turnoutPercentage = temp2 * 100;
        //TODO
        return null;
    }
}
