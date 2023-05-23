package calculator.model;

public class SubtractDecimalPressed implements State{
    private Calculator np;
    public SubtractDecimalPressed(Calculator dp){
        this.np = dp;

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
//        String not = this.np.getValue();
//        String ready = not.substring(0, not.length()-1);
        String ans = this.np.getValue() + String.valueOf(number);
        this.np.setValue(ans);
        this.np.setSecond(Double.parseDouble(ans));
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


    }
}
