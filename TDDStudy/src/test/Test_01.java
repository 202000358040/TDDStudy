package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.ADD;
//����������������д���Դ��룬��֤���Դ�������ȷ�ģ�������дADD��main�Ĵ���
public class Test_01 {

	@Test
	public void test_1() {
		ADD add=new ADD();
		int ret=add.getResult(1,2);
		assertEquals(3,ret);
		
	}

}
