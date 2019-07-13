/*
Simple altitude-hold PID controller

Copyright (C) 2019 Simon D. Levy

MIT License
*/

public class AltitudePidController {

}

/*
    def __init__(self, target, posP, velP, velI, velD, windupMax=10):

        //g In a real PID controller, this would be a set-point
        self.target = target

        //g Constants
        self.posP = posP
        self.velP = velP
        self.velI = velI
        self.velD = velD
        self.windupMax = windupMax

        //g Values modified in-flight
        self.posTarget      = 0
        self.lastError      = 0
        self.integralError  = 0
        self.altitudeTarget = 0

    def u(self, alt, vel, dt):

        //g compute dzdt setpoint and error
        velTarget = (self.target - alt) * self.posP
        velError = velTarget - vel

        //g Update error integral and error derivative
        self.integralError +=  velError * dt
        self.integralError = AltitudePidController._constrainAbs(self.integralError + velError * dt, self.windupMax)
        deltaError = (velError - self.lastError) / dt if abs(self.lastError) > 0 else 0
        self.lastError = velError

        //g Compute control u
        return self.velP * velError + self.velD * deltaError + self.velI * self.integralError

    def _constrainAbs(x, lim):

        return -lim if x < -lim else (+lim if x > +lim else x)

*/
