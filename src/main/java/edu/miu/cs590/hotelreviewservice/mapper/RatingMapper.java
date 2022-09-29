package edu.miu.cs590.hotelreviewservice.mapper;

import edu.miu.cs590.hotelreviewservice.dto.RatingDto;
import edu.miu.cs590.hotelreviewservice.entity.Rating;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RatingMapper {

    Rating dtoToEntity(RatingDto ratingDto);

    RatingDto entityToDto(Rating rating);

    List<RatingDto> entitiesToDtos(List<Rating> ratings);
}
