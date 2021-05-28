package com.tts.WeatherApp.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

    @Data
    @NoArgsConstructor
    @Entity

    public class ZipCode {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long Id;
        private String code;

        public ZipCode(String code) {
            this.code = code;
        }
    }


