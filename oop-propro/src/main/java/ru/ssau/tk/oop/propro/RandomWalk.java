package ru.ssau.tk.oop.propro;

import static java.lang.Math.*;

public class RandomWalk {

    public static void main(String[] args) {

        double boltzConst = 1.36 * pow(10, -23);         //постоянная Больцмана
        double numAvodadro = 6.02 * pow(10, 23);        //число Авогадро
        double volumeMol = 22.4 * pow(10, -3);          //объем одного моля газа при нормальных условиях
        double m0 = 0.028 / numAvodadro;            //масса одной молекулы азота
        double effectSection = PI * pow((0.3 * pow(10, -9)), 2);   //эффективное сечение молекулы азота

        double concent = numAvodadro / volumeMol;     //концентрация 1 моля азота
        int numParticles = 1000;     //число рассматриваемых частиц
        double tempK = 300;      //температура в Кельвинах
        double time = 2 * pow(10, -7);   //время наблюдения
        double meanFreePath = 1 / (sqrt(2) * concent * effectSection);  //средняя длина свободного пробега молекулы азота
        double paramMaxwell = sqrt(boltzConst * tempK / m0);  //ско распределения Максвелла == нормального распределения

        double freePath, Vx, Vy, Vz;
        double sum_tay, tay, x, y, z, r2 = 0;

        for (int i = 1; i <= numParticles; i++) {
            sum_tay = 0;  //прошедшее время, изначально 0
            x = 0; //начальные координаты молекулы
            y = 0;
            z = 0;
            while (sum_tay < time) {
                freePath = -meanFreePath * log(random());  //расстояние, которое прошла молекула после столкновения
                Vx = sqrt((-2 * log(random()))) * cos(2 * PI * random()) * paramMaxwell; //генерация проекций скоростей
                Vy = sqrt((-2 * log(random()))) * sin(2 * PI * random()) * paramMaxwell;
                Vz = sqrt((-2 * log(random()))) * cos(2 * PI * random()) * paramMaxwell;
                tay = freePath / sqrt(pow(Vx, 2) + pow(Vy, 2) + pow(Vz, 2));
                x += Vx * tay;      //текущие координаты
                y += Vy * tay;
                z += Vz * tay;
                sum_tay += tay;     //прошедшее время
            }
            r2 += pow(x, 2) + pow(y, 2) + pow(z, 2); //квадрат смещения i-ой молекулы от исходного положения
        }
        System.out.println(r2 / numParticles);  //срeдний квадрат смещения молекул
    }
}

