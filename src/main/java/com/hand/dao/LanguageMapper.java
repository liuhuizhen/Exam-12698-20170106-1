package com.hand.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hand.dto.Language;

@Component
public interface LanguageMapper {

	List<Language> selectLanguages();

	Language selectOneLang(String language);

}
