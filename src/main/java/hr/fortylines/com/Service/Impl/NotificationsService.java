package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.NotificationsDto;
import hr.fortylines.com.Models.Mappers.NotificationsMapper;
import hr.fortylines.com.Models.Notifications;
import hr.fortylines.com.Repository.NotificationRepo;
import org.springframework.stereotype.Service;

@Service
public class NotificationsService extends BaseServiceImpl<Notifications, NotificationsDto, NotificationsMapper, NotificationRepo>{
    public NotificationsService(NotificationRepo repo, NotificationsMapper mapper) {
        super(repo, mapper);
    }
}
