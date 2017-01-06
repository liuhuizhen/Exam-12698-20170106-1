package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dao.FilmMapper;
import com.hand.dto.Film;
import com.hand.dto.Page;
import com.hand.dto.ResponseData;
import com.hand.service.FilmService;
@Service
public class FilmServiceImlp implements FilmService{
	@Autowired
	private FilmMapper filmMapper;
	@Override
	public ResponseData<Film> selectFilms(Page film) {
		ResponseData<Film> responseData=new ResponseData<>();
		responseData.setTotal(filmMapper.selectCount((Film)film.getEntity()));
		responseData.setRows(filmMapper.selectFilms(film));
		return responseData;
	}
	@Override
	public int delFilm(int film_id) {
		return filmMapper.delFilm(film_id);
	}
	@Override
	public Film selectFilmById(int film_id) {
		return filmMapper.selFilmById(film_id);
	}
	@Override
	public int addFilm(Film film) {
		return filmMapper.addFilm(film);
	}
	@Override
	public int updateFilm(Film film) {
		return filmMapper.updateFilm(film);
	}

}
