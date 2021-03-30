package com.Wchallenge.clients;

import com.Wchallenge.domain.dtos.UserDto;
import com.Wchallenge.utils.Route;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "${feign.client.jsonplaceholder.name}", url = "${feign.client.jsonplaceholder.url}")
public interface JSONPlaceHolderClient {

    @GetMapping(value = Route.USERS_CLIENT)
    List<UserDto> findAllUsers();

    @GetMapping(value = Route.USERS_CLIENT + Route.GETBY_ID_CLIENT)
    UserDto findUserById(@PathVariable("id") Long id);

}
