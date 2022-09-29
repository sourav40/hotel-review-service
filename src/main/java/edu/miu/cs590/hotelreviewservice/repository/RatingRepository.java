package edu.miu.cs590.hotelreviewservice.repository;

import edu.miu.cs590.hotelreviewservice.dto.RatingDto;
import edu.miu.cs590.hotelreviewservice.entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String>{
List<Rating> findRatingByHotelId(String hotelId);

List<Rating> findRatingByComment(String comment);

List<Rating> findByHotelId(String hotelId);

RatingDto findHotelDetailsByHotelId(String hotelId);



}
