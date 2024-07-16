package com.oficial.plannerOficial.trip;

import com.oficial.plannerOficial.participant.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {


}
