package base;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

/**
 * BaseControllerTest
 *
 * @author lujin
 * @date 16/11/21
 */
@RunWith(SpringJUnit4ClassRunner.class) @WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml",
    "classpath:spring-mvc.xml"}) @Rollback @Transactional(transactionManager = "transactionManager")
public class BaseControllerTest {
    protected MockHttpServletRequest request;
    protected MockHttpSession session;
    protected MockHttpServletResponse response;
    protected MockMvc mockMvc;
    @Autowired private WebApplicationContext webApplicationContext;

    @Before public void setup() throws Exception {
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
        session = new MockHttpSession();
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
}
