package product.controller;

import portal.ProductApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProductApplication.class)
public class ProductControllerTest {
    @Autowired
    private org.springframework.web.context.WebApplicationContext context;
    MockMvc mockMvc;
    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void selectProductByCondition() {
            try {
                 MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/product/selectProductByCondition").accept(MediaType.APPLICATION_JSON)
                .param("productname","%XX%"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
                 System.out.println("输出 " + mvcResult.getResponse().getContentAsString());
            }catch(Exception e){
                e.printStackTrace();
            }
    }
}