package com.example.proxypattern;

import com.example.proxypattern.expensive.object.ExpensiveObject;
import com.example.proxypattern.proxy.ExpensiveObjectProxy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxyPatternApplicationTests {

	@Test
	void contextLoads() {
		ExpensiveObject object = new ExpensiveObjectProxy();
		object.process();

		object.process();

		object.process();
	}

}
