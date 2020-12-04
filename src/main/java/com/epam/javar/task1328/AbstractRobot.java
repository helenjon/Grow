package com.epam.javar.task1328;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

abstract public class AbstractRobot implements Attackable, Defensable {

    private static int hitCount;


    @Override
    public BodyPart attack() {
        hitCount = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        BodyPart attackedBodyPart = null;
        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;

        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;

        } else if (hitCount == 3) {

            attackedBodyPart = BodyPart.LEG;
        }else if (hitCount == 4) {

            attackedBodyPart  = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    @Override
    public BodyPart defense() {
        hitCount = ThreadLocalRandom.current().nextInt(1, 4 + 1);
      //  hitCount = hitCount + 1;
        BodyPart defendedBodyPart = null;
     //   hitCount = hitCount + 2;
        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {

            defendedBodyPart = BodyPart.ARM;
        }
        else if (hitCount == 4) {

            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }


}
