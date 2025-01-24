package com.rra.local_mission_management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rra.local_mission_management.entity.MissionLocation;

@Repository
public interface MissionLocationRepository extends JpaRepository<MissionLocation, Long>{
    Optional<MissionLocation> findByDistrict_districtCode(int districtId);
}
