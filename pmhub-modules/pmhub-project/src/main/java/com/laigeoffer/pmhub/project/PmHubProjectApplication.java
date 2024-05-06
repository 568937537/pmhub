package com.laigeoffer.pmhub.project;

import com.laigeoffer.pmhub.base.security.annotation.EnableCustomConfig;
import com.laigeoffer.pmhub.base.security.annotation.EnablePmFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author canghe
 * @description 项目管理模块
 * @create 2024-04-25-17:23
 */
@EnableCustomConfig
@EnablePmFeignClients
@SpringBootApplication
public class PmHubProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmHubProjectApplication.class, args);
    }
}