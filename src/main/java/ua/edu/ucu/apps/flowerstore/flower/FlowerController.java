package ua.edu.ucu.apps.flowerstore.flower;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path="flower")
public class FlowerController {
    private final FlowerService flowerService;
    // final змінні можна створювати хіба що в конструкторі, ні  в гетерах, ні в сетерах.
    // Створювати тут через new буде погано, не СОЛІДно.
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }
    @GetMapping
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public Public String postMethodName(@RequestBody String entity) {
        flowerRepository.addFlower(flower);

    }
    public void addFlower() {}
}