/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1projeto;

/**
 *
 * @author Paulo Victor
 */
/**
 * Mapa
 * 
 */
public class World {

    public void criaWorld() {
        int i, j;
        for (i = 0; i < 30; i++) {
            for (j = 0; j < 60; j++) {
                world[i][j] = '0';
                //Isso vai fazer as laterais
                world[i][0] = '1';/**limite superior do mapa*/
                world[0][j] = '1';/**limite lateral esquerda do mapa*/
                world[i][59] = '1';/**limite lateral direira do mapa*/
                world[29][j] = '1';/**limite inferior do mapa*/
                if (i == 4 && ((j > 5 && j < 12) || (j > 48 && j < 55))) {
                    world[i][j] = '2';
                } else if (i == 5 && ((j > 5 && j < 12) || (j > 48 && j < 55))) {
                    world[i][j] = '2';
                } else if (i == 6 && ((j > 5 && j < 12) || (j > 48 && j < 55))) {
                    world[i][j] = '2';
                } else if (i == 13 && ((j > 26 && j < 33))) {
                    world[i][j] = '2';
                } else if (i == 14 && ((j > 26 && j < 33))) {
                    world[i][j] = '2';
                } else if (i == 15 && ((j > 26 && j < 33))) {
                    world[i][j] = '2';
                } else if (i == 23 && ((j > 5 && j < 12) || (j > 48 && j < 55))) {
                    world[i][j] = '2';
                } else if (i == 24 && ((j > 5 && j < 12) || (j > 48 && j < 55))) {
                    world[i][j] = '2';
                } else if (i == 25 && ((j > 5 && j < 12) || (j > 48 && j < 55))) {
                    world[i][j] = '2';
                }
            }
        }
    }
/**
 * Funçao de imprimir o mundo
 */
    public void imprimeWorld() {
        for (int i = 0; i < 30; i++) {
            System.out.println("");
            for (int j = 0; j < 60; j++) {
                System.out.printf("%c", world[i][j]);
            }
        }
    }
/**
 * Funçao pra setar o mundo com os veiculos
 * @param x do veiculo
 * @param y do veiculo
 * @param tipo do veiculo
 */
    public void setWorldV(int x, int y, int tipo) {
        /*Definindo os pontos dos veiculos*/
        if (tipo == 2) {//car
            world[x][y] = '^';
        } else if (tipo == 1) { //truck
            world[x][y] = '-';
        } else if (tipo == 3) { //bike
            world[x][y] = '+';
        }
    }
    private char[][] world = new char[30][60];/*o world ta sendo declarado como char pra poder usar os caracteres como veiculos.*/


}
