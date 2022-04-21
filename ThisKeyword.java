public class ThisKeyword {
    String color;
    public void print(){
        System.out.print(this.color);
    }
    public static void main(String[] args) {
        ThisKeyword ds = new ThisKeyword();
        ds.color = "Red";
        ThisKeyword sd = new ThisKeyword();
        sd.color = "Blue";
        ds.print();
        System.out.println();
        sd.print();
    }
}