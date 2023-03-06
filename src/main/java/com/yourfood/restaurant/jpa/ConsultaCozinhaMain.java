package com.yourfood.restaurant.jpa;

import com.yourfood.restaurant.RestaurantApplication;
import com.yourfood.restaurant.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(
                RestaurantApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        List<Cozinha> cozinhas = cadastroCozinha.lista();

        for (Cozinha cozinha : cozinhas) { System.out.println(cozinha.getNome()); }
    }
}
