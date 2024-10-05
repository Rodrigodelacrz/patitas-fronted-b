package pe.cibertec.pe.patitas_frontend_b.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RestTemplateConfig {

            @Bean
            public RestTemplate restTemplateAutenticacion(RestTemplateBuilder builder){
                return builder
                        .rootUri("http://localhost:8081/autenticacion")
                        .setConnectTimeout(Duration.ofSeconds(10))
                        .setReadTimeout(Duration.ofSeconds(10))
                        .build();
            }

    @Bean
    public RestTemplate restTemplateFinanzas(RestTemplateBuilder builder){
        return builder

                .setConnectTimeout(Duration.ofSeconds(12))
                .setReadTimeout(Duration.ofSeconds(12))
                .build();
    }

    @Bean
    public RestTemplate restTemplateReporteria(RestTemplateBuilder builder){
        return builder
                .setConnectTimeout(Duration.ofSeconds(15))
                .setReadTimeout(Duration.ofSeconds(15))
                .build();
    }







}
