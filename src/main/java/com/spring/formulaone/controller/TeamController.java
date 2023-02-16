package com.spring.formulaone.controller;

import com.spring.formulaone.controller.dto.TeamDto;
import com.spring.formulaone.controller.mapper.TeamMapper;
import com.spring.formulaone.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/teams")
public class TeamController {
    private final TeamService teamService;
    private final TeamMapper teamMapper;

    @Autowired
    public TeamController(TeamService teamService, TeamMapper teamMapper) {
        this.teamService = teamService;
        this.teamMapper = teamMapper;
    }

    @GetMapping
    public ResponseEntity<List<TeamDto>> getAll() {
        return new ResponseEntity<>(
                teamService.getAll().stream()
                        .map(teamMapper::toDto)
                        .collect(Collectors.toList()),
                HttpStatus.OK
        );
    }
}
