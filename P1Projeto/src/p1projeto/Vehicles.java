package p1projeto;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Paulo Victor
 */
/**
 * Classe dos veiculos
 * 
 */
public class Vehicles {

    protected int x;
    protected int y;
    protected int velo;
    private boolean fabrica;
    int i, j;
/**
 * Construdor de Vehicles
 * @param x é a posição do x do veiculo
 * @param y é a posição do y do veiculo
 * @param velo é a velocidade do veiculo
 * 
 */
    public Vehicles(int x, int y, int velo, boolean fabrica) {
        this.x = x;
        this.y = y;
        this.velo = velo;
        this.fabrica = fabrica;
    }
/**
 * Setando velocidade
 * 
 */
    public void setVelo(int velo) {
        this.velo = velo;
    }
/**
 * Retornando velocidade
 * 
 */
    public int getVelo() {
        return velo;
    }
/**
 * Setando X
 * 
 */
    public void setX(int x) {
        this.x = x;
    }
/**
 * Setando Y
 * 
 */
    public void setY(int y) {
        this.y = y;
    }
/**
 * Retornando X
 * 
 */
    public int getX() {
        return x;
    }
/**
 * Retornando Y
 * 
 */
    public int getY() {
        return y;
    }

    public boolean aFabrica() {
        return fabrica;
    }
/**
 * Setando Fabrica
 * 
 */
    public void setFabrica(boolean fabrica) {
        this.fabrica = fabrica;
    }

    /**
     * Funçao de movimentação dos veiculos
     */
    public void move(ArrayList<Bike> bike, ArrayList<Car> car, ArrayList<Truck> truck, int tipo) {
        Random random = new Random();
        int r = random.nextInt(4);
        if (r == 0) {
            y = (y + velo) % 60;
        } else if (r == 1) {
            y = (y - velo) % 60;
            if (y < 0) {
                y = 60 - Math.abs(y);
            }
        } else if (r == 2) {
            x = (x + velo) % 30;
        } else if (r == 3) {
            x = (x - velo) % 30;
            if (x < 0) {
                x = 30 - Math.abs(x);
            }
        }
        temFabrica(bike, car, truck, tipo);
        batida(bike, car, truck);
    }

    /*Função que vai identificar se o veiculo entrou na area da fábrica*/
    public void temFabrica(ArrayList<Bike> bike,
            ArrayList<Car> car, ArrayList<Truck> truck, int tipo) {
        int xRandom = (int) (Math.random() * 30);
        int yRandom = (int) (Math.random() * 60);
        if (x == 4 && ((y > 5 && y < 12) || (y > 48 && y < 55))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        } else if (x == 5 && ((y > 5 && y < 12) || (y > 48 && y < 55))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        } else if (x == 6 && ((y > 5 && y < 12) || (y > 48 && y < 55))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        } else if (x == 13 && ((y > 26 && y < 33))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        } else if (x == 14 && ((y > 26 && y < 33))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        } else if (x == 14 && ((y > 26 && y < 33))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        } else if (x == 15 && ((y > 26 && y < 33))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        } else if (x == 23 && ((y > 5 && y < 12) || (y > 48 && y < 55))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        } else if (x == 24 && ((y > 5 && y < 12) || (y > 48 && y < 55))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        } else if (x == 25 && ((y > 5 && y < 12) || (y > 48 && y < 55))) {
            if (fabrica == false) {
                if (tipo == 3) {
                    bike.add(new Bike(xRandom, yRandom, 3, false));
                    fabrica = true;
                }
                if (tipo == 2) {
                    car.add(new Car(xRandom, yRandom, 2, false));
                    fabrica = true;
                }
                if (tipo == 1) {
                    truck.add(new Truck(xRandom, yRandom, 1, false));
                    fabrica = true;
                }
            }
        }
    }
/**
 * Funçao pra batidas
 * @param m é a moto
 * @param c é o carro
 * @param t é o caminhão
 */
    public void batida(ArrayList<Bike> m, ArrayList<Car> c, ArrayList<Truck> t) {
        int i, j;
        for (i = 0; i < c.size(); i++) {
            /**Colisão moto com carro*/
            for (j = 0; j < m.size(); j++) {
                if (c.get(i).getX() == m.get(j).getX() & c.get(i).getY() == m.get(j).getY()) {
                    m.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }

                }
            }
        }
        for (i = 0; i < t.size(); i++) {
            /**Colisãoo moto com caminhao*/
            for (j = 0; j < m.size(); j++) {
                if (t.get(i).getX() == m.get(j).getX() & t.get(i).getY() == m.get(j).getY()) {
                    m.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }
        for (i = 0; i < m.size(); i++) {
            /**Colisão moto com moto*/
            for (j = i + 1; j < m.size() - 1; j++) {
                if (m.get(i).getX() == m.get(j).getX() & m.get(i).getY() == m.get(j).getY()) {
                    m.remove(i);
                    m.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }
        for (i = 0; i < c.size(); i++) {
            /**Colisão carro com carro*/
            for (j = i + 1; j < c.size() - 1; j++) {
                if (c.get(i).getX() == c.get(j).getX() & c.get(i).getY() == c.get(j).getY()) {
                    c.remove(i);
                    c.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }

        for (i = 0; i < t.size(); i++) {
            /**Colisão carro com caminhao*/
            for (j = 0; j < c.size(); j++) {
                if (t.get(i).getX() == c.get(j).getX() & t.get(i).getY() == c.get(j).getY()) {
                    c.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }

        for (i = 0; i < t.size(); i++) {
            /**Colisão caminhao com caminhao*/
            for (j = i + 1; j < t.size() - 1; j++) {
                if (t.get(i).getX() == t.get(j).getX() & t.get(i).getY() == t.get(j).getY()) {
                    t.remove(i);
                    t.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }

    }
}
