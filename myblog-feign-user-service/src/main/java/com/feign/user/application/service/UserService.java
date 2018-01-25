package com.feign.user.application.service;

import com.starrk.dev.interfaces.UserInterface;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "user-service")
public interface UserService extends UserInterface {
}
