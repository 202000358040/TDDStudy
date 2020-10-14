package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.ADD;
//测试驱动开发，先写测试代码，保证测试代码是正确的，，，再写ADD，main的代码
public class Test_01 {

	@Test
	public void test_1() {
		ADD add=new ADD();
		int ret=add.getResult(1,2);
		assertEquals(3,ret);
		
	}

}
