package com.hand.handler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.hand.dto.Film;
import com.hand.dto.Language;
import com.hand.dto.Page;
import com.hand.dto.ResponseData;
import com.hand.service.FilmService;
import com.hand.service.LanguageService;
@RestController("filmController")
@RequestMapping("/film")
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	@Autowired
	private LanguageService languageService;
	
	@RequestMapping(path="",method=RequestMethod.GET)
	@ResponseBody
	public ResponseData<Film> query(
			@RequestParam(name = "page", required = false, defaultValue = "1") int page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "2") int pageSize) {
			Page<Film> arg = new Page<Film>();
				arg.setPage(page);
				arg.setPageSize(pageSize);
		return filmService.selectFilms(arg);
	}

	@RequestMapping(path = "/delFilm", method = RequestMethod.GET)
	@ResponseBody
	public Map delFilm(	@RequestParam(name = "film_id", required = false, defaultValue = "") int film_id) {
		Map<String,String> map=new HashMap<String,String>();
		int result= filmService.delFilm(film_id);
		if(result>0){
			map.put("url","/Exam-12698-20170106-1/index.html");
		}else{
			map.put("url","/Exam-12698-20170106-1/index.html");
		}
		return map;
	}

		
  
	
	@RequestMapping(path = "/selectOne", method = RequestMethod.GET)
	@ResponseBody
	public String selectOneFilm(@RequestParam(name = "film_id", required = false, defaultValue = "") int film_id){
	Film film=filmService.selectFilmById(film_id);
	Gson gson=new Gson();
	String json=gson.toJson(film);
	return json;
	}
	
	@RequestMapping(path = "/selLanguage", method = RequestMethod.GET)
	@ResponseBody
	public String selLanguage(){
	List<Language> language=languageService.selectLangs();
	Gson gson=new Gson();
	String languages=gson.toJson(language);
	return languages;
	}
	
	@RequestMapping(path="/addFilm",method=RequestMethod.GET)
	@ResponseBody
	public Map addFilm(
			@RequestParam(name = "title", required = false, defaultValue = "") String title,
			@RequestParam(name = "description", required = false, defaultValue = "") String description,
			@RequestParam(name = "language", required = false, defaultValue = "") String language) {
		Language language_=languageService.selectOneLan(language);
		int language_id=language_.getLanguage_id();
		Film film=new Film().setTitle(title).setDescription(description).setLanguage_id(language_id);
		int result=filmService.addFilm(film);
		Map<String,String> map=new HashMap<String,String>();
		if(result>0){
			map.put("url","/Exam-12698-20170106-1/index.html");
		}else{
		map.put("url","/Exam-12698-20170106-1/addFilm.html");
		}
		return map;
	}
	
	@RequestMapping(path="/updateFilm",method=RequestMethod.GET)
	@ResponseBody
	public Map updateFilm(
			@RequestParam(name = "film_id", required = false, defaultValue = "") int film_id,
			@RequestParam(name = "title", required = false, defaultValue = "") String title,
			@RequestParam(name = "description", required = false, defaultValue = "") String description,
			@RequestParam(name = "language", required = false, defaultValue = "") String language) {
		Language language_=languageService.selectOneLan(language);
		int language_id=language_.getLanguage_id();
		Film film=new Film().setFilm_id(film_id).setTitle(title).setDescription(description).setLanguage_id(language_id);
		int result=filmService.updateFilm(film);
		Map<String,String> map=new HashMap<String,String>();
		if(result>0){
			map.put("url","/Exam-12698-20170106-1/index.html");
		}else{
		map.put("url","/Exam-12698-20170106-1/update.html");
		}
		return map;
	}

}
