package com.hand.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hand.dto.Film;
import com.hand.dto.Page;
import com.hand.dto.ResponseData;
@Component
public interface FilmMapper {

	List<Film> selectFilms(Page film);

	Integer selectCount(Film entity);

	int delFilm(int film_id);

	Film selFilmById(int film_id);

	int addFilm(Film film);

	int updateFilm(Film film);

}
