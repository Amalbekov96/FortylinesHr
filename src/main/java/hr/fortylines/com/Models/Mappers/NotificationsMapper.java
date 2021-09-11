package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.NotificationsDto;
import hr.fortylines.com.Models.Notifications;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface NotificationsMapper extends BaseMapper<Notifications, NotificationsDto>{
    NotificationsMapper INSTANCE = Mappers.getMapper(NotificationsMapper.class);
}
