package CatAndBox;
public class Box extends Cat {
    int height = 40;
    int width = 60;
    int depth = 50;
    Cat cat = new Cat();
     Box (boolean alive){
         this.alive = alive;
     }
     public boolean openBox(){
         double a = Math.random()*2;
         if((int)a>0) {alive = true;
         } else {alive = false;}
         return alive;
     }
     public static void main(String[] args){
         Box Schrodinger = new Box(true);
         Schrodinger.openBox();
         System.out.print(Schrodinger.isAlive());
     }
}
