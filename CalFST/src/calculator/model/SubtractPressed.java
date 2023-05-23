package calculator.model;

public class SubtractPressed implements State{
    private Calculator np;
    private String total = "0";
    public SubtractPressed(Calculator sp){
        this.np = sp;
    }
    @Override
    public double displayNumber() {
        return 0;
    }

    @Override
    public void clearPressed() {
        this.np.setValue("0");
        this.np.setState(new Test(this.np));
    }

    @Override
    public void numberPressed(int number) {
        total += String.valueOf(number);
        this.np.setValue(this.total);
        this.np.setSecond(Double.parseDouble(this.total));
//        this.np.setSecond(Double.parseDouble(this.np.getValue()));
    }

    @Override
    public void dividePressed() {
        this.np.setState(new DividePressed(this.np));

    }

    @Override
    public void multiplyPressed() {
        this.np.setState(new MultiplyPressed(this.np));
    }


    @Override
    public void subtractPressed() {
        this.np.setState(new SubtractPressed(this.np));

    }

    @Override
    public void addPressed() {
        this.np.setState(new AddPressed(this.np));

    }

    @Override
    public void equalsPressed() {
        double ret =  this.np.getFirst()-this.np.getSecond();
        String ans = String.valueOf(ret);
        this.np.setValue(ans);
        this.np.setFirst(ret);

    }

    @Override
    public void decimalPressed() {
        total += String.valueOf(".");
        this.np.setValue(this.total);
        this.np.setState(new SubtractDecimalPressed(this.np));
        this.np.setSecond(Double.parseDouble(this.total));

    }
}
