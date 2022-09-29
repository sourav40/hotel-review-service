package edu.miu.cs590.hotelreviewservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class RatingDtoByHotel {
    public Integer AverageRating;
    List<String> Comments;
}
