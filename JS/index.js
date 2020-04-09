const Car = require('./Car');
const Account = require('./Account');

const car = new Car('WEW323', new Account('Marcos Luis', 'Y4U23'));
car.passanger = 4;
car.printDataCar();