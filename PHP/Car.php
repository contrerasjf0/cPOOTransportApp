<?php
class Car {
    public $id;
    public $license;
    public $driver;
    public $passegenger;

    public function __construct($license, $driver){

        $this->license = $license;
        $this->driver = $driver;
        
    }

    public function printDataCar(){
        echo 'Driver Name: '.$this->license->name,' license: '.$this->license."\n";
    }
}
