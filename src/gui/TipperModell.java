package gui;

public class TipperModell {
    private int randomNum;

    public TipperModell() {
        randomNum = (int) (Math.random() * Math.pow(10, 2));
        System.out.println(randomNum);
    }

    public int getRandomNum(){
        return randomNum;
    }

    public void reset() {
        randomNum = (int) (Math.random() * Math.pow(10, 2));
    }

    public boolean talalt(int num) {
        return (num == getRandomNum());
    }




}
