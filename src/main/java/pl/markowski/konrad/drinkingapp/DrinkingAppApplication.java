package pl.markowski.konrad.drinkingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.markowski.konrad.drinkingapp.web.model.Bottle;
import pl.markowski.konrad.drinkingapp.web.model.CatModel;

@SpringBootApplication
public class DrinkingAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(DrinkingAppApplication.class, args);

	}

}
