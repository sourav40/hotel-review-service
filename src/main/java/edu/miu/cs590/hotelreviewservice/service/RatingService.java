package edu.miu.cs590.hotelreviewservice.service;

import edu.miu.cs590.hotelreviewservice.dto.RatingDto;
import edu.miu.cs590.hotelreviewservice.dto.RatingDtoByHotel;
import edu.miu.cs590.hotelreviewservice.entity.Rating;

import java.util.List;


public interface RatingService {




    RatingDto save(RatingDto ratingDto);

    List<String> findComments(String hotelId);
    public List<RatingDto> getAllReviews();
    RatingDtoByHotel findRatingByHotelId(String hotelId);

    RatingDto getRatingForHotelId(String hotelId);

//    Page<Rating> findByHotel(Hotel hotel, Pageable pageable);
//
//    Review findByHotelAndIndex(Hotel hotel, int index);
//
//    Review save(Review review);


//    public List<RatingDto> getAllReviews();
//
//    public Optional<RatingDto> getReviewById(UUID id);
//
//
//    public Rating updateHotel(UUID id, RatingDto ratingDto);
//
//    public void deleteHotelById(UUID id);

}
