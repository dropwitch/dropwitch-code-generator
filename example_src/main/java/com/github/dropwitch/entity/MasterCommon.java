package com.github.dropwitch.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.ser.DateTimeSerializer;
import lombok.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.joda.time.DateTime;

import javax.persistence.*;
import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "master_common")
public class MasterCommon {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "key")
    @NotNull
    @Size(max = 255)
    private String key;

    @Column(name = "value")
    private String value;

    @Column(name = "created_at")
    @Generated(value = GenerationTime.INSERT)
    @JsonSerialize(using = DateTimeSerializer.class)
    private DateTime createdAt;

    @Column(name = "updated_at")
    @Generated(value = GenerationTime.ALWAYS)
    @JsonSerialize(using = DateTimeSerializer.class)
    private DateTime updatedAt;

}
