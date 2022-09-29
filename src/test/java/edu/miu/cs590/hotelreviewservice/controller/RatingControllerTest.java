package edu.miu.cs590.hotelreviewservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import edu.miu.cs590.hotelreviewservice.dto.RatingDto;
import edu.miu.cs590.hotelreviewservice.entity.Rating;
import edu.miu.cs590.hotelreviewservice.service.RatingService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(MockitoJUnitRunner.class)
//@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
//@SpringBootTest
public class RatingControllerTest {

//    @InjectMocks
//    private RatingController ratingController;
//
//    ObjectMapper objectMapper = new ObjectMapper();
//
//    ObjectWriter objectWriter = objectMapper.writer();
//
//
//    private MockMvc mockMvc;
//
//    @MockBean
//    private RatingService ratingService;
//
//
//    public RatingControllerTest() {
//        MockitoAnnotations.initMocks(this);
//        this.mockMvc = MockMvcBuilders.standaloneSetup(ratingController).build();
//
//    }
//
//    RatingDto rating1 = RatingDto.builder().id(null).userId("")
//            .hotelId("12").rating(5).Comment("Good").build();
//
//    @Test
//    public void getAllReviews_success() throws Exception {
//
//        List<RatingDto> reviews = new ArrayList<>(Arrays.asList(rating1));
//
//        Mockito.when(ratingService.getAllReviews()).thenReturn(reviews);
//
//        mockMvc.perform(MockMvcRequestBuilders
//                        .get("/reviews")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(1)))
//                .andExpect(jsonPath("$[0].hotelId", Matchers.is("12")));
//    }
//
//    @Test
//    public void save() throws Exception {
//        RatingDto ratingDto = RatingDto.builder().id(null).userId("10").hotelId("12").rating(5).Comment("Good").build();
//
//        Mockito.when(ratingService.save(ratingDto)).thenReturn(ratingDto);
//
//        String content = objectWriter.writeValueAsString(ratingDto);
//
//        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/reviews")
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON)
//                .content(content);
//
//        mockMvc.perform(mockRequest)
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", notNullValue()))
//                .andExpect(jsonPath("$.hotelId", Matchers.is("12")));
//
//    }
//
//    @Test
//    public void findAllComment_success() throws Exception {
//
//        List<RatingDto> ratings = new ArrayList<>(Arrays.asList(rating1));
//        List<String> comments = new ArrayList<>();
//        comments.add(rating1.getComment());
//        Mockito.when(ratingService.findComments("Good")).thenReturn(comments);
//        System.out.println(comments);
//
//        mockMvc.perform(MockMvcRequestBuilders
//                        .get("/reviews/12/comment")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//        // .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(1)))
//        //  .andExpect(jsonPath("$[0]", Matchers.is("Good")));
//
//    }
//
////    @Test
////    public void findRatingByHotelId_success() throws Exception {
////
////        List<RatingDto> ratingDtos = new ArrayList<>(Arrays.asList(rating1));
////
////        Mockito.when(ratingService.findRatingByHotelId(rating1.getHotelId()).getAverageRating()).thenReturn(rating1.getRating());
////
////        mockMvc.perform(MockMvcRequestBuilders
////                        .get("/reviews/12")
////                        .contentType(MediaType.APPLICATION_JSON))
////                .andExpect(status().isOk())
////                  .andExpect(jsonPath("$", notNullValue()))
////                  .andExpect(jsonPath("$[0].hotelId", Matchers.is("12")));
////
////      }
//
//    @Test
//    public void findRatingByHotelId() throws Exception {
//
//
//
//    }


}
