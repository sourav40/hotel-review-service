package edu.miu.cs590.hotelreviewservice.service;

import edu.miu.cs590.hotelreviewservice.dto.RatingDto;
import edu.miu.cs590.hotelreviewservice.dto.RatingDtoByHotel;
import edu.miu.cs590.hotelreviewservice.entity.Rating;
import edu.miu.cs590.hotelreviewservice.mapper.RatingMapper;
import edu.miu.cs590.hotelreviewservice.repository.RatingRepository;
import edu.miu.cs590.hotelreviewservice.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingServiceIml implements RatingService {
    @Autowired
    RatingRepository ratingRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    private RatingMapper ratingMapper;

    @Override
    public RatingDto save(RatingDto ratingDto) {

//        Rating rating = MapperUtil.map(ratingDto, Rating.class);

        Rating rating = ratingMapper.dtoToEntity(ratingDto);
//          rating.setComment(ratingDto.getComment());
        ratingRepository.save(rating);
//        return MapperUtil.map(ratingRepository.save(rating), RatingDto.class);

        return ratingMapper.entityToDto(rating);
    }

    @Override
    public List<String> findComments(String hotelId) {
        List<Rating> ratings = ratingRepository.findByHotelId(hotelId);

        return null;// ratings.stream().map(t->t.getComment()).collect(Collectors.toList());

    }

    @Override
    public List<RatingDto> getAllReviews() {
//        return MapperUtil.mapList(ratingRepository.findAll(), RatingDto.class);
        return ratingMapper.entitiesToDtos(ratingRepository.findAll());
    }

    @Override
    public RatingDtoByHotel findRatingByHotelId(String hotelId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("hotelId").is(hotelId));
        List<Rating> ratings = mongoTemplate.find(query, Rating.class);

//        Integer averageRating = (int) ratings.stream()
//                .map(Rating::getRating)
//                .mapToInt(Integer::intValue)
//                .average().getAsDouble();

        Integer average = (int) ratings.stream()
                .map(Rating::getRating)
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);

        List<String> comments = ratings.stream().map(Rating::getComment).collect(Collectors.toList());

        RatingDtoByHotel ratingDtoByHotel = new RatingDtoByHotel();
        ratingDtoByHotel.setAverageRating(average);
        ratingDtoByHotel.setComments(comments);

        return ratingDtoByHotel;
    }

    @Override
    public RatingDto getRatingForHotelId(String hotelId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("hotelId").is(hotelId));
        mongoTemplate.findOne(query, RatingDto.class);

        return mongoTemplate.findOne(query, RatingDto.class);
    }

}
