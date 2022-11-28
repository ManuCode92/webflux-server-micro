package com.nttdata.bootcamp.webfluxservermicro.controllers;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webfluxservermicro.respository.Person;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {

	@GetMapping("/person-list-1")
	public Flux<Person> personList1() {
		return Flux.just(new Person("Jose Manuel", "Becerra", 20)).delayElements(Duration.ofSeconds(5));
	}

	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		return Flux.just(new Person("Alejandro", "Ocampos", 23)).delayElements(Duration.ofSeconds(7));
	}

	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		return Flux.just(new Person("Carmen", "Torres", 28)).delayElements(Duration.ofSeconds(3));

	}

	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		
		return Flux.just(new Person("Patrick", "Justiniano", 30)).delayElements(Duration.ofSeconds(9));
	}

}
