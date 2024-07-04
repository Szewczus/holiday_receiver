package com.example.holiday_receiver.services;

import com.example.holiday_receiver.UserHolidayReport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {
    @KafkaListener(topics = "holiday-report-topic", groupId = "test-consumer-group")
    public void consume(UserHolidayReport message) {
        log.info("Received message: "+message);
        System.out.println("Received message: " + message);
        // Process the message
    }
}
