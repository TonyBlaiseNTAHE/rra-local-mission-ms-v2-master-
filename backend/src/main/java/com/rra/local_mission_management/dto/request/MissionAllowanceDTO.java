package com.rra.local_mission_management.dto.request;

import java.util.List;

import lombok.Data;

@Data
public class MissionAllowanceDTO {
    private String employeeId;
    private List<MissionAllowanceDistrictDTO> missionAllowance;

    
}
