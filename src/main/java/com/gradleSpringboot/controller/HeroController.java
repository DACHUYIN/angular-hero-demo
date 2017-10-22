package com.gradleSpringboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gradleSpringboot.bean.Hero;
import com.gradleSpringboot.service.HeroService;

@RestController
public class HeroController {

	@Autowired
	private HeroService heroService;
	
	@RequestMapping(value="/getAllHeroes", method=RequestMethod.GET)
	public List<Hero> getAllHero() throws Exception {
		return heroService.getAllHero();
	}
	
	@RequestMapping(value="/getHero/{id}", method=RequestMethod.GET)
	public Hero getHero(@PathVariable("id") Integer id) throws Exception {
		return heroService.getHero(id);
	}
	
	@RequestMapping(value="/delHero/{id}",method=RequestMethod.DELETE)
	public void deleteHero(@PathVariable Integer id) throws Exception {
		heroService.deleteHero(id);
	}
	
	@RequestMapping(value="/creHero", method=RequestMethod.POST)
	public void insertHero(@RequestBody Hero hero) throws Exception {
		System.out.println(hero.toString());
		heroService.insertHero(hero);
	}
	
	@RequestMapping(value="/upHero", method=RequestMethod.PUT)
	public void updateHero(@RequestBody Hero hero) throws Exception {
		heroService.updateHero(hero);
	}
	
	@RequestMapping(value="/searchHeroes/{name}", method=RequestMethod.GET)
	public List<Hero> searchHeroes(@PathVariable String name) throws Exception {
		return heroService.searchHeroes(name);
	}
}
