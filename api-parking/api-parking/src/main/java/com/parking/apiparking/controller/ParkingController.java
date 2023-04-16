package com.parking.apiparking.controller;

public class ParkingController {

    private List<Car> parkingLot;

    public ParkingController() {
        this.parkingLot = new ArrayList<>();
    }

    //Reportar los autos guardados
    public List<Car> gettAllCars(){
        return this.parkingLot;
    }

    public void addCar(Car car){
        this.parkingLot.add(car);
    }
}
