package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyTest {
	
	@Test
	public void testForEncoder() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("123456"));
		//$2a$10$84L9g4LVTAwAXJMBpxRi6ecoWnrfPVX060FGf.Ckcp.yzBJzubyVa
	} 
}
