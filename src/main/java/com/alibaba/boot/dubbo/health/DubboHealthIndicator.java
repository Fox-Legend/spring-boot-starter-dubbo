package com.alibaba.boot.dubbo.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

@Component
public class DubboHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Builder builder) throws Exception {
        builder.up();
    }
}
