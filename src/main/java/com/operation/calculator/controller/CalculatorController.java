package com.operation.calculator.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.operation.calculator.model.Calculator;

@RestController
public class CalculatorController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/calculator")
	public Calculator calculator(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Calculator(counter.incrementAndGet(), String.format(template, name));
	}
}