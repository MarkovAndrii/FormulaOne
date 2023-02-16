package com.spring.formulaone.service;

import com.spring.formulaone.entity.Team;
import com.spring.formulaone.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAll() {
        return teamRepository.findAll();
    }
}
