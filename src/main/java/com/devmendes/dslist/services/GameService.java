package com.devmendes.dslist.services;

import com.devmendes.dslist.dto.GameDTO;
import com.devmendes.dslist.dto.GameMinDTO;
import com.devmendes.dslist.entities.Game;
import com.devmendes.dslist.projections.GameMinProjection;
import com.devmendes.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly=true)
    public GameDTO findById(Long id){
        Game result=gameRepository.findById(id).get();
        GameDTO dto= new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly=true)
    public List<GameMinDTO> findAll(){
    List<Game> result = gameRepository.findAll();
    List<GameMinDTO> dto=result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
}
    @Transactional(readOnly=true)
    public List<GameMinDTO> findbyList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return  result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
