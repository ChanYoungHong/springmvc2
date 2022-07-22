package com.nhnacademy.springmvc.config;

import com.nhnacademy.springmvc.Base;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration          // @Component의 일종인 것을 기억하기. Stereo bean 타입 중의 하나다
@ComponentScan(basePackageClasses = Base.class,
excludeFilters = @ComponentScan.Filter(Controller.class))
public class RootConfig {

}
