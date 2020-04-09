from car import Car

if __name__ == "__main__":
    print("Hello world!!")
    car = Car()

    car.license = "TEH23"
    car.driver = "Pepito Perez"

    print(vars(car))

    car2 = Car()

    car2.license = "898ASE"
    car2.driver = "Maria Ruiz"

    print(vars(car2))