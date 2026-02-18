package com.example.item_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * CORS(Cross-Origin Resource Sharing) 설정 클래스
 */
@Configuration  // Spring 설정 클래스임을 명시
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")  // 모든 경로에 대해 CORS 설정 적용

                // 허용할 출처(origin) 설정
                .allowedOrigins(
                        "http://localhost:5173"      // Vite React 개발 서버 주소
                )

                // 허용할 HTTP 메서드 설정
                .allowedMethods("GET", "POST", "PUT", "DELETE")

                // 허용할 헤더 설정
                .allowedHeaders("*")

                // 쿠키나 인증 정보를 포함한 요청 허용
                .allowCredentials(true);
    }
}