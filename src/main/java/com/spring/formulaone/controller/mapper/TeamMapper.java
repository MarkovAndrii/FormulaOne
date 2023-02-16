package com.spring.formulaone.controller.mapper;

import com.spring.formulaone.controller.dto.TeamDto;
import com.spring.formulaone.entity.Team;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {

    public TeamDto toDto(Team team) {
        return new TeamDto(
                team.getId(),
                team.getName(),
                team.getManager()
        );
    }

    public Team toEntity(TeamDto teamDto) {
        return new Team(
                teamDto.getId(),
                teamDto.getName(),
                teamDto.getManager()
        );
    }
}
