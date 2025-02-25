package myLudo;

class Pawn {

    private int position;
    private Session session;
    private Direction direction;

    public Pawn(Direction direction) {
        this.position = 0;
        this.session = Session.IS_HOME;
        this.direction = direction;
    }


    public void move(int steps) {
        if (session != Session.IS_FINISHED && session == Session.ON_BOARD) this.position += steps;
        else if (session == Session.IS_HOME) {
            this.position = 2;
            this.session = Session.ON_BOARD;
        }
    }

    public void finish() {
        session = Session.IS_FINISHED;
        this.position = -1;
    }

    public int getPosition() {
        return this.position;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Session getSession() {
        return this.session;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void changeDirection() {
        switch (this.direction) {
            case Direction.WEST -> setDirection(Direction.NORTH);
            case Direction.NORTH -> setDirection(Direction.EAST);
            case Direction.EAST -> setDirection(Direction.SOUTH);
            case Direction.SOUTH -> setDirection(Direction.WEST);
        }
    }
}