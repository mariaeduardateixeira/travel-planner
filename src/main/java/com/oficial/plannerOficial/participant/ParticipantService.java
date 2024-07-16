package com.oficial.plannerOficial.participant;

import com.oficial.plannerOficial.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public void registerParticipantsToEvent(List<String> participantToInvite, Trip trip){
        List<Participant> participants = participantToInvite.stream().map(email -> new Participant(email, trip)).toList();

        this.participantRepository.saveAll(participants);
        System.out.println("ID DO PARTICIPANTE" + participants.get(0).getId());
    }

    public ParticipantCreateResponse registerParticipantToEvent(String email, Trip trip){
        Participant newParticipant = new Participant(email, trip);
        this.participantRepository.save(newParticipant);

        return new ParticipantCreateResponse(newParticipant.getId());
    }
    public void triggerConfirmationEmailToParticipants(Long tripId){

    }
    public void triggerConfirmationEmailToParticipant(String email){

    }

    public List<ParticipantData> getAllParticipantsFromEvent(Long tripId){
        return this.participantRepository.findByTripId(tripId).stream().map(participant -> new ParticipantData(participant.getId(), participant.getName(), participant.getEmail(), participant.getIsConfirmed())).toList();
    }
}
