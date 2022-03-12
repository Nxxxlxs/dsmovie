package com.nxxxlxs.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nxxxlxs.dsmovie.dto.MovieDTO;
import com.nxxxlxs.dsmovie.entities.Movie;
import com.nxxxlxs.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository moveiRepository;


}
