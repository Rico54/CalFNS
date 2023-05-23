package calculator.model;

public class Calculator {
    private State num = new Test(this);
    private String sudo = "0";
    private String value = "0";
    private double first = 0.0;

    private double second = 0.0;

    public Calculator(){
    }
    public void setState(State state){
        this.num = state;
    }
    public String getSudo(){
        return this.sudo;
    }
    public void setSudo(String su){
        this.sudo =su;
    }
    public String getValue(){
        return this.value;
    }
    public void setValue(String num){
        value = num;
    }
    public double getFirst(){
        return this.first;
    }
    public void setFirst(double val){
        this.first = val;
    }
    public double getSecond(){
        return this.second;
    }
    public void setSecond(double val){
        this.second = val;
    }

    public double displayNumber() {
        return Double.parseDouble(this.value);
    }


    public void clearPressed() {
        this.num.clearPressed();
    }

    public void numberPressed(int number) {
        this.num.numberPressed(number);
    }

    public void dividePressed() {
       this.num.dividePressed();
    }

    public void multiplyPressed() {
        this.num.multiplyPressed();
    }

    public void subtractPressed() {
        this.num.subtractPressed();
    }

    public void addPressed() {
        this.num.addPressed();
    }

    public void equalsPressed() {
        this.num.equalsPressed();
    }

    public void decimalPressed() {
        this.num.decimalPressed();
    }


    


}
