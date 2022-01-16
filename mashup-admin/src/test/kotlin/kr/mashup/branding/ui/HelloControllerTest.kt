package kr.mashup.branding.ui

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc

    @DisplayName("hello api")
    @Test
    fun hello() {
        mockMvc.perform(get("/hello"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$").value("Hello, Mashup-admin"))
    }
}