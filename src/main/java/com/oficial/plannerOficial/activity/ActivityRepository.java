package com.oficial.plannerOficial.activity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Long> {


    List<Activity> findByTripId(Long tripId);
}
