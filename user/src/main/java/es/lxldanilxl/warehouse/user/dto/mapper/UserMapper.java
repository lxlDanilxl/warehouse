package es.lxldanilxl.warehouse.user.dto.mapper;

import es.lxldanilxl.warehouse.user.dto.RegisterDto;
import es.lxldanilxl.warehouse.user.model.User;

public final class UserMapper {
    public static User RegisterDtoToUserMapper(RegisterDto registerDto) {
        User user = User.builder()
                .username(registerDto.getUsername())
                .password(registerDto.getPassword())
                .email(registerDto.getEmail())
                .build();
        return user;
    }
}
