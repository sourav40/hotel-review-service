package edu.miu.cs590.hotelreviewservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Document("rating")
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @MongoId
    @Field(value = "_id", targetType = FieldType.STRING)
        private ObjectId id;
    private String userId;
    private String hotelId;
    private int rating;
    private String comment;
    @CreatedDate
    private LocalDateTime dateTime;

    @Version
    private Integer version;

    }
