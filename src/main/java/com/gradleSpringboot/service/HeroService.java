package com.gradleSpringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gradleSpringboot.bean.Hero;
import com.gradleSpringboot.mapper.HeroMapper;
import com.gradleSpringboot.service.impl.HeroServiceImpl;

@Service
public class HeroService implements HeroServiceImpl {

	@Autowired
	private HeroMapper heroMapper;

	public List<Hero> getAllHero() throws Exception {
		return heroMapper.getAllHero();
	}

	public Hero getHero(int id) throws Exception {
		return heroMapper.getHero(id);
	}

	public void deleteHero(int id) throws Exception {
        heroMapper.deleteHero(id);
	}

	public void insertHero(Hero hero) throws Exception {
        heroMapper.insertHero(hero);
	}

	public void updateHero(Hero hero) throws Exception {
        heroMapper.updateHero(hero);
	}

	public List<Hero> searchHeroes(String name) throws Exception {
		return heroMapper.searchHeroes(name);
	}
}
