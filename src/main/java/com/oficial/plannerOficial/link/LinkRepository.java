package com.oficial.plannerOficial.link;

import com.oficial.plannerOficial.activity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link, Long> {
    public List<Link> findByTripId(Long tripId);

}
