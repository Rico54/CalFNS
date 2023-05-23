package calculator.model;

public class Test implements State{
    String total = "0";

    private Calculator np;

    public Test(Calculator n){
        this.np = n;
    }
    public String getTotal(){
        return total;
    }
    public double displayNumber() {
        // TODO
        return 0.0;
    }

    public void clearPressed() {
        this.total = "0";
        this.np.setValue("0");
    }

    public void numberPressed(int number) {
        total += String.valueOf(number);
        this.np.setValue(this.total);
        this.np.setSecond(Double.parseDouble(this.total));
    }

    public void dividePressed() {
        this.np.setFirst(Double.parseDouble(this.total));
        this.total = "";
        this.np.setState(new DividePressed(this.np));
    }

    public void multiplyPressed() {
        this.np.setFirst(Double.parseDouble(this.total));
        this.total = "";
        this.np.setState(new MultiplyPressed(this.np));
    }

    public void subtractPressed() {
        this.np.setFirst(Double.parseDouble(this.total));
        this.total = "";
        this.np.setState(new SubtractPressed(this.np));
    }

    public void addPressed() {
        this.np.setFirst(Double.parseDouble(this.total));
        this.total = "";
        this.np.setState(new AddPressed(this.np));
    }

    public void equalsPressed() {

    }

    public void decimalPressed() {
        total += String.valueOf(".");
        this.np.setState(new DecimalPressed(this.np));
        this.np.setValue(this.total);
        this.np.setFirst(Double.parseDouble(this.total));


    }


}