package com.nxxxlxs.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxxxlxs.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
