package com.yourfood.restaurant.jpa;

import com.yourfood.restaurant.RestaurantApplication;
import com.yourfood.restaurant.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;


public class InclusaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(
                RestaurantApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        Cozinha cozinha1 = new Cozinha();
        cozinha1.setNome("Italiana");

        cozinha1 = cadastroCozinha.adicionar(cozinha1);

        System.out.printf("%d - %s", cozinha1.getId(), cozinha1.getNome());
    }
}
