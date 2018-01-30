package com.feign.user.application.service;

import com.starrk.dev.interfaces.UserInterface;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "USER-SERVICE",fallback = CallbackForUserService.class)
public interface UserService extends UserInterface {
}
