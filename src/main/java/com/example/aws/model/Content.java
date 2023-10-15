package com.example.aws.model;

import java.time.LocalDateTime;

import com.example.aws.model.enums.ContentType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Content {
	int id;
	String text;
	ContentType contentType;
	LocalDateTime createdDate;
}
