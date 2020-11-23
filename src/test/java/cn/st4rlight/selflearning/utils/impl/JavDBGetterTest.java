package cn.st4rlight.selflearning.utils.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@SpringBootTest
@RunWith(SpringRunner.class)
public class JavDBGetterTest {

	@Resource
	private JavDBGetter javDBGetter;

	@Test
	public void getActressDOM() {
		javDBGetter.getActressDOM("znyb");
	}

	@Test
	public void getVideoDOM() {
		javDBGetter.getVideoDOM("GK2nb");
	}
}