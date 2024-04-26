package work1LSP;


// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель


public abstract class Shape {
    int height;
    public void setHeight(int height) {
        this.height = height;
    }
}
