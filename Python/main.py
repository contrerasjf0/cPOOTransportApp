from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello world!!")
    car = Car("TEH23", Account("Pepito Perez", "UY3T4"))

    print(vars(car))
    print(vars(car.driver))