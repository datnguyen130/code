package lab_08;

class Circle extends Shape {
    float area;
    @Override
    void calculate(float rad){
        area = getPI() * rad * rad;
        System.out.println(area);
    }
}
