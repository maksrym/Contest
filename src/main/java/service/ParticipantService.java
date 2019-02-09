package service;

import dto.ParticipantDto;
import model.Participant;
import model.VerificationToken;

public interface ParticipantService {
    Participant getParticipantByEmail(String email);
    boolean existsByEmail(String email);
    Participant registerNewAccount(ParticipantDto participantDto);
    Participant registerNewAccount(Participant participant);
    void updateAccount(Participant user);
    void createVerificationToken(Participant participant, String token);
    VerificationToken getVerificationToken(String VerificationToken);
}