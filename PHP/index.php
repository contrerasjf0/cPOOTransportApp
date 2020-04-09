<?

//require_once('Car.php');
require_once('Account.php');
require_once('UberX.php');
require_once('UberPool.php');

echo "Hello world!!!\n";

$car = new Car('U45W342', new Account('Maria Luisa', '45689'));
$uberX= new UberX("EETRET23", new Account("Marco Perales", "XAW332"), "Kia", "Rio");
$uberPool= new UberPool("YT374", new Account("Franco Ledesma", "U2Y54"), "Mazda", "Mazda 3");


$car->printDataCar();
$uberX->printDataCar();
$uberPool->printDataCar();
