package edu.miu.cs590.hotelreviewservice.controller;


import edu.miu.cs590.hotelreviewservice.dto.RatingDto;
import edu.miu.cs590.hotelreviewservice.entity.Rating;
import edu.miu.cs590.hotelreviewservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/reviews")
@CrossOrigin("http://localhost:3000")
public class RatingController {
    @Autowired
    RatingService ratingService;

    @GetMapping()
    public ResponseEntity<List<RatingDto>> getAllReviews(){

        return new ResponseEntity<>(ratingService.getAllReviews(),HttpStatus.OK);
    }

    @GetMapping("/ratings/{id}")
    public ResponseEntity<RatingDto> getRatingForHotelId(@PathVariable("id") String hotelId){
        return new ResponseEntity<RatingDto>(ratingService.getRatingForHotelId(hotelId),HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<?> findRatingByHotelId(@PathVariable("hotelId") String hotelId){

    return new ResponseEntity<>(ratingService.findRatingByHotelId(hotelId),HttpStatus.OK);

    }

    @GetMapping("/{hotelId}/comment")

    public ResponseEntity<List<String>> getAllComments(@PathVariable("hotelId") String hotelId){

        return new ResponseEntity<>(ratingService.findComments(hotelId), HttpStatus.OK);
    }


    @PostMapping()
    public ResponseEntity<?> saveComment(@RequestBody RatingDto rating){
        System.out.println("in the review post method.");
        RatingDto ratingDto = ratingService.save(rating);
        if(ratingDto == null) return new ResponseEntity<>("Comment create failed", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(ratingDto,HttpStatus.OK);
    }





}
