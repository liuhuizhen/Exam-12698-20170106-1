package com.hand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dao.LanguageMapper;
import com.hand.dto.Language;
import com.hand.service.LanguageService;
@Service
public class LanguageServiceImpl implements LanguageService{
	@Autowired
	private LanguageMapper languageMapper;
	@Override
	public List<Language> selectLangs() {
		return languageMapper.selectLanguages();
	}
	@Override
	public Language selectOneLan(String language) {
		return languageMapper.selectOneLang(language);
	}

}
