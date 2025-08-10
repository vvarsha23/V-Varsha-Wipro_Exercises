package com.wipro.notification.collector;
import com.wipro.notification.dto.NotificationRequest;
import com.wipro.notification.service.NotificationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/notify")
public class NotificationCollector {
	private final NotificationService notificationService;

    public NotificationCollector(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void notifyUser(@RequestBody NotificationRequest request) {
        notificationService.notify(request);
    }

}
