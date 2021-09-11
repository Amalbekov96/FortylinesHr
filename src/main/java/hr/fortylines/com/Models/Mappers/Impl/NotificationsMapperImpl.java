package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.NotificationsDto;
import hr.fortylines.com.Models.Mappers.NotificationsMapper;
import hr.fortylines.com.Models.Notifications;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationsMapperImpl implements NotificationsMapper {
    @Override
    public Notifications toEntity(NotificationsDto notificationsDto) {
        return NotificationsMapper.INSTANCE.toEntity(notificationsDto);
    }

    @Override
    public NotificationsDto toDto(Notifications notifications) {
        return NotificationsMapper.INSTANCE.toDto(notifications);
    }

    @Override
    public List<Notifications> toListEntity(List<NotificationsDto> d) {
        return NotificationsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<NotificationsDto> toListDto(List<Notifications> e) {
        return NotificationsMapper.INSTANCE.toListDto(e);
    }
}
