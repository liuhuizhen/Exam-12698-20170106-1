package com.hand.service;

import java.util.List;

import com.hand.dto.Language;

public interface LanguageService {

	List<Language> selectLangs();

	Language selectOneLan(String language);

}
