package com.parking.apiparking.services;
import java.util.ArrayList;
import com.parking.apiparking.entities.Car;
import java.util.List;

public class ParkingService {

    private List<Car> parkingLot;

    public ParkingService() {
        this.parkingLot = new ArrayList<>();
    }

    //Reportar los autos guardados
    public List<Car> getAllCars(){
        return this.parkingLot;
    }

    public void addCar(Car car){
        this.parkingLot.add(car);
    }
}
