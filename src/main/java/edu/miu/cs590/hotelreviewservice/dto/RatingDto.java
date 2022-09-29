package edu.miu.cs590.hotelreviewservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.miu.cs590.hotelreviewservice.entity.Rating;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RatingDto {

    private ObjectId id;
    private String userId;

    private String hotelId;

    private int rating;
    private String Comment;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime dateTime;


}


