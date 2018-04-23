package p1projeto;
import java.util.ArrayList;
import java.util.Random;





/**
 *
 * @author Paulo Victor
 */

/**
 * Classe Main
 * 
 */
public class Main {

    public static void main(String[] args) {
        World W = new World();
        W.criaWorld();

        System.out.println();

        int i;
        //criando os vetores de cada veiculo
        ArrayList<Car> car = new ArrayList<>();/**Vetor do carro*/
        ArrayList<Bike> bike = new ArrayList<>();/**Vetor da moto*/
        ArrayList<Truck> truck = new ArrayList<>();/**Vetor do caminhão*/

        for (i = 0; i < 10; i++) {/**Esse for ele vai dar as posições random de cada veiculo*/
            int xcar = (int) (Math.random() * 30);
            int ycar = (int) (Math.random() * 60);
            int xbike = (int) (Math.random() * 30);
            int ybike = (int) (Math.random() * 60);
            int xtruck = (int) (Math.random() * 30);
            int ytruck = (int) (Math.random() * 60);
            car.add(new Car(xcar, ycar, 2, false));
            bike.add(new Bike(xbike, ybike, 3, false));
            truck.add(new Truck(xtruck, ytruck, 1, false));
        }
        for (i = 0; i < 10; i++) {
            W.setWorldV(car.get(i).getX(), car.get(i).getY(), 2);
            W.setWorldV(bike.get(i).getX(), bike.get(i).getY(), 3);
            W.setWorldV(truck.get(i).getX(), truck.get(i).getY(), 1);
        }
        W.imprimeWorld();
        while (car.size() > 0 | bike.size() > 0) {
            for (i = 0; i < car.size(); i++) {/**Faz o carro andar*/
                car.get(i).move(bike, car, truck, 2);
            }
            for (i = 0; i < bike.size(); i++) {/**faz a moto andar*/
                bike.get(i).move(bike, car, truck, 3);
            }
            for (i = 0; i < truck.size(); i++) {/**faz o caminhÃ£o andar*/
                truck.get(i).move(bike, car, truck, 1);
            }
            W.criaWorld();
            for (i = 0; i < car.size(); i++) {
                W.setWorldV(car.get(i).getX(), car.get(i).getY(), 2);
            }
            for (i = 0; i < bike.size(); i++) {
                W.setWorldV(bike.get(i).getX(), bike.get(i).getY(), 3);
            }
            for (i = 0; i < truck.size(); i++) {
                W.setWorldV(truck.get(i).getX(), truck.get(i).getY(), 1);
            }
            System.out.println();
            W.imprimeWorld();

            System.out.printf("\ncarros(^): %d", car.size());
            System.out.printf(" / caminhoes(+): %d", truck.size());
            System.out.printf(" / motos(-): %d\n", bike.size());
            for (i = 0; i < 5; i++) {
                System.out.printf("\n");
            }

        }
    }
}
