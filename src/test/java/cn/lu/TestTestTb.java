package cn.lu;

import cn.lu.core.common.junit.SpringJunitTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.lu.core.bean.TestTb;
import cn.lu.core.service.TestTbService;

public class TestTestTb extends SpringJunitTest{

	@Autowired
	private TestTbService testTbService;
	@Test
	public void testAdd() throws Exception {
		TestTb testTb = new TestTb();
//		testTb.setName("金乐乐");
		testTb.setName(new String("金乐乐".getBytes(), "UTF-8"));

		testTbService.addTestTb(testTb);
	}
}
