package com.hand.service;

import com.hand.dto.Film;
import com.hand.dto.Page;
import com.hand.dto.ResponseData;

public interface FilmService {

	ResponseData<Film> selectFilms(Page<Film> arg);

	int delFilm(int film_id);

	Film selectFilmById(int film_id);

	int addFilm(Film film);

	int updateFilm(Film film);

}
