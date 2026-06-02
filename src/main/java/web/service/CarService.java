package web.service;

import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface CarService {

        List<Car> getCarList(int count);
}
