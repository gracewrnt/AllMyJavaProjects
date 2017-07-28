enum EngineType { DIESEL, BENZYL, ELECTRIC }
public class Car2 {
 enum GearType { AUTOMATIC,MANUAL }
 EngineType engineType = EngineType.DIESEL;
 int engineSize =2500;
 GearType gearType;
 String color= "Black";
 int seats = 5;
 
 
 Car2(String color){
  this.color=color;
 }
 Car2(String  color1, EngineType e, GearType g, int size, int seats ){
  color=color1;
     e=EngineType.DIESEL;
  g=GearType.MANUAL;
  size=engineSize;
  this.seats=seats;
 }
 
 
 
 public static void main(String[] args) {
  Car2 myCar = new Car2("RED");
  Car2 yourCar = new Car2("Silver",EngineType.DIESEL,GearType.MANUAL,2500,7);
System.out.println(" seats "+myCar.color+" car. Its engine is ");
System.out.println("Your car is "+yourCar.seats+" seats "+yourCar.color+" car. Its engine is"+yourCar);
}
}