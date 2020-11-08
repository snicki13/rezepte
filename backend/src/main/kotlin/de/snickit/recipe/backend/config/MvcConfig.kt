package de.snickit.recipe.backend.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
class MvcConfig: WebMvcConfigurer{
    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("/index")
        registry.addViewController("/").setViewName("index")
        registry.addViewController("/login").setViewName("sign-in")
    }
}
