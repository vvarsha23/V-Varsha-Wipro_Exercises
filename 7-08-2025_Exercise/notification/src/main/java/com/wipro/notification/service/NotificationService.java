package com.wipro.notification.service;
import com.wipro.notification.dto.NotificationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void notify(NotificationRequest request) {
        String username = request.getUser().getUsername();
        String action = request.getAction();

        String message = String.format("User %s information is %s", username, action);
        // For demo, just log it
        logger.info(message);
        System.out.println(message);
    }

}
