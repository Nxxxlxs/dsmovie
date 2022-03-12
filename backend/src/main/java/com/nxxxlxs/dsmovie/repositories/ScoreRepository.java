package com.nxxxlxs.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxxxlxs.dsmovie.entities.Score;
import com.nxxxlxs.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
