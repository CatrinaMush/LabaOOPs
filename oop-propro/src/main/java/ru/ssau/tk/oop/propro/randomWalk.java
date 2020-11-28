package ru.ssau.tk.oop.propro;

import static java.lang.Math.*;

public class randomWalk {

    double boltzConst = 1.36 * pow(10, -23);
    double numAvodadro = 6.02 * pow(10, 23);
    double volumeMol = 22.4 * pow(10, -3);

    double m0 = 0.028 / numAvodadro;
    double effectSection = PI * pow((0.3 * pow(10, -9)), 2);
    double concent = numAvodadro / volumeMol;
    int numParticles = 100;
    double tempK = 300;
    double time = pow(2, -7);

    public double diffusion() {
        double meanFreePath = 1 / (sqrt(2) * concent * effectSection);
        double paramMaxwell = sqrt(boltzConst * tempK / m0);
        double llambda;
        double Vx, Vy, Vz;
        double sum_tay, tay, x, y,z, r2 = 0;

        for (int i = 1; i<=numParticles; i++){
            sum_tay = 0;
            x = 0;
            y = 0;
            z = 0;
            while (sum_tay < time) {
                llambda = -meanFreePath * log(random());
                Vx = (-2 * sqrt(log(random()))) * cos(2 * PI * random()) * paramMaxwell;
                Vy = (-2 * sqrt(log(random()))) * sin(2 * PI * random()) * paramMaxwell;
                Vz = (-2 * sqrt(log(random()))) * cos(2 * PI * random()) * paramMaxwell;
                tay = llambda / sqrt(pow(Vx, 2) + pow(Vy, 2) + pow(Vz, 2));
                x += Vx * tay;
                y += Vy * tay;
                z += Vz * tay;
                sum_tay += tay;
                r2 += pow(x, 2) + pow(y, 2) + pow(z, 2);
            }
        }
        return r2/numParticles;
    }
}

