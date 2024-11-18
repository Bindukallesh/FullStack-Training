package com.ust.fact.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/fact")

public class FactController {
	@GetMapping("/factorial/{number}")
    public long getFactorial(@PathVariable long number) {
        return factorial(number);
    }

    private long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
