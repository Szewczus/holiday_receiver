package com.example.holiday_receiver.services;

import com.example.holiday_receiver.UserHolidayReport;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "holiday-report-topic", groupId = "test-consumer-group")
    public void consume(UserHolidayReport message) {
        System.out.println("Received message: " + message);
        // Process the message
    }
}
