package web.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private List<Car> carList;

    public CarServiceImp() {
        carList = new ArrayList<>();  // ← ИНИЦИАЛИЗАЦИЯ!
        carList.add(new Car("BMW", "electric", 1234));
        carList.add(new Car("Lada Vesta", "gasoline", 1357));
        carList.add(new Car("Ford Focus", "electric", 5678));
        carList.add(new Car("BMW X5", "gasoline", 1234));
        carList.add(new Car("Toyota Camry", "gasoline", 7890));
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count >= carList.size()) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}