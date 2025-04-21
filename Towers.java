public class Towers {
    private int numDiscs;

    public Towers(int n) {
        this.numDiscs = n;
        moveDiscs(numDiscs, 1, 3, 2);
    }

    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num > 0) {
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
            System.out.println("Move disc " + num + " from peg " + fromPeg + " to peg " + toPeg);
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}
