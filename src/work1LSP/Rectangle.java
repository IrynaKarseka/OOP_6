package work1LSP;


// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель


public class Rectangle extends Shape {
    int width;

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }


}
