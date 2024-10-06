package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
public class HomeController {
	
	//Controller 메서드, Handler 메서드 : 파이썬은 @app.get("/")
	@GetMapping("/")								// http://localhost:8080/로 요청하면 index.html 문서를 화면에 보여주세요.
	public String home() {
		return "index";
	}	
	

	
}
