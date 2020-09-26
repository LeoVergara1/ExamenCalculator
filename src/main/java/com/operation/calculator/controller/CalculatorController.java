package com.operation.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.operation.calculator.model.Calculator;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	@GetMapping("/suma")
	public Calculator suma(@RequestParam(value = "firstParam", defaultValue = "0") float firstParam, @RequestParam(value = "secondParam", defaultValue = "0") float secondParam) {
		float result = firstParam + secondParam;
		return new Calculator(result);
	}

	@GetMapping("/resta")
	public Calculator resta(@RequestParam(value = "firstParam", defaultValue = "0") float firstParam, @RequestParam(value = "secondParam", defaultValue = "0") float secondParam) {
		float result = firstParam - secondParam;
		return new Calculator(result);
	}

	@GetMapping("/multiplicacion")
	public Calculator multiplicacion(@RequestParam(value = "firstParam", defaultValue = "0") float firstParam, @RequestParam(value = "secondParam", defaultValue = "0") float secondParam) {
		float result = firstParam * secondParam;
		return new Calculator(result);
	}

	@GetMapping("/division")
	public Calculator division(@RequestParam(value = "firstParam", defaultValue = "0") float firstParam, @RequestParam(value = "secondParam", defaultValue = "0") float secondParam) {
		float result = firstParam / secondParam;
		return new Calculator(result);
	}
}