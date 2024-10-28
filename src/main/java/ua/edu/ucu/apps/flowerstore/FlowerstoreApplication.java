package ua.edu.ucu.apps.flowerstore;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

@SpringBootApplication
public class FlowerstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerstoreApplication.class, args);
	}

	@GetMapping
	public List<String> HelloWorld() {
		return List.of(new Flower(100, FlowerType.CHAMOMILE, 100));
	}
}
