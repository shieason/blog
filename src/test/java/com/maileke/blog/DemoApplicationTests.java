package com.maileke.blog;

import com.maileke.blog.entity.User;
import com.maileke.blog.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	/**
	 * shieason 2018.09.17
	 */
	@Test
	public void testSelect() {
		System.err.println("----select all methon test----");
        List<User> users = userMapper.selectList(null);

        Assert.assertEquals(1,users.size());
        users.forEach(System.out::println);
    }

}
