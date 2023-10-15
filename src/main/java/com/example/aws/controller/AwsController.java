package com.example.aws.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aws.model.Content;
import com.example.aws.model.enums.ContentType;

@RestController
@RequestMapping("aws")
public class AwsController {
	
	@GetMapping("content")
	public Content getContent() {
		return new Content(1, "Content-1", ContentType.ARTICLE, LocalDateTime.now());
	}

}
