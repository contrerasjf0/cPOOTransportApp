<?

require_once('Car.php');
require_once('Account.php');


echo "Hello world!!!\n";

$car = new Car('U45W342', new Account('Maria Luisa', '45689'));

$car->printDataCar();

