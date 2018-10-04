package com.ay3524.cardstackv2test.card_stack.internal;

import android.graphics.Point;

import com.ay3524.cardstackv2test.card_stack.SwipeDirection;

/**
 * Created by luongvo on 3/5/18.
 */

public class SwipedItem {

    private Point point;
    private SwipeDirection direction;
    private boolean enable = true;

    public SwipedItem(Point point, SwipeDirection direction) {
        this.point = point;
        this.direction = direction;
    }

    public Point getPoint() {
        return point;
    }

    public SwipeDirection getDirection() {
        return direction;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
