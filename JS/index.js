const Car = require('./Car');
const Account = require('./Account');
const UberX = require('./UberX');

const car = new Car('WEW323', new Account('Marcos Luis', 'Y4U23'));
car.passanger = 4;
car.printDataCar();

const uberX = new UberX('HSAAW2', new Account('Luis Gonzales', 'A23DW'), "Kia", "Rio");

uberX.passanger = 3;
uberX.printDataCar();
