package students.vitaly_porsev.lesson_8.level_3.task_13;

class Bus extends Vehicle {

    public Bus(int wheels, int fuelCapacity, int fuelConsumption, int numberOfPassengers) {
        super(wheels, fuelCapacity, fuelConsumption, numberOfPassengers);
    }

    @Override
    int averageFuelConsumption() {
        return 0;
    }

    @Override
    int howMuchTiresWillCost() {
        return 0;
    }
}