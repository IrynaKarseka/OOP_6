package work1LSP;


// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель


public class Square extends Shape {
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }
}
