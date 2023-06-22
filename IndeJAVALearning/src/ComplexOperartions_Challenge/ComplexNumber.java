package ComplexOperartions_Challenge;

public class ComplexNumber {
    private double real;
    private double imaginary;

    //Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //Getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    //Methods
    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber complexNumber){
        //real = this.real + complexNumber.getReal();
        //imaginary = this.imaginary + complexNumber.getReal();
        add(complexNumber.real, complexNumber.imaginary); //To reduce the code repetition
    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.real, complexNumber.imaginary); //To reduce the code repetition
    }

}
