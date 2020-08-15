package com.juicebox.straw.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.*

@Configuration
class WebConfiguration : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**").allowedMethods("*")
    }
}