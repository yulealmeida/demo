package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/")
class Blah {
	// localhost:8080/teste?name=Siclano

	@GetMapping   (value = "test")
	public Map<String, String> getBlah(@RequestParam("name") String name, @RequestParam("city") String city, @RequestParam(value = "age") String age, @RequestParam(value = "email") String email,@RequestParam(value = "car") String car)
	{
		Map<String, String> json = new HashMap<>();



		json.put("name", name);
	    json.put("age", age);
		json.put("city", city);
		json.put("email", email);
		json.put("car", car);

		return json;
	}

	@PostMapping("users")
	public Map<String, String> postBlah(@RequestBody Request request) {
		Map<String, String> json = new HashMap<>();
		json.put("name", request.getName());
		json.put("age", request.getAge());
		json.put("description", request.getDescription());
		json.put("email", request.getEmail());
		json.put("country", request.getCountry());
		json.put("city", request.getCity());
		json.put("car", request.getCar());
		return json;
	}
	// Enviando projeto para Github.....



}

class Request {
	private String name;
	private String age;
	private String description;
	private String email;
	private String country;
	private String city;
	private String car;

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
