package chapter4;

/*
Определите абстрактный класс Shape с переменной экземпляра
 класса Point; конструктором и конкретным методом
 public void moveBy (double dx, double dy), перемещающим точку
  на заданное расстояние; а также абстрактным классом
   public Point getCenter(). Предоставьте конкретные подклассы
    Circle, Rectangle, Line с конструкторами
    public Circle (Point center, double radius),
    public Rectangle(Point topLeft, double width, double height)
    и public Line (Point from, Point to).
 */

public class Ex4and5 {

    public static void main(String[] args) {
        Circle circle=new Circle(new Point(2,2),3);
        circle.moveBy(1,1);
        System.out.println(circle.toString());
        Rectangle rectangle=new Rectangle(new Point(2,2),3,2);
        rectangle.moveBy(1,2);
        System.out.println(rectangle.toString());
        Line line=new Line(new Point(3,3),new Point(4,4));
        line.moveBy(2,2);
        System.out.println(line.toString());
    }

    public static class Circle extends Shape {
        private int radius;

        public Circle(Point point, int radius) {
            super(point);
            this.radius = radius;
        }

        @Override
        public Point getCenter() {
            return this.point;
        }

        @Override
        protected Circle clone() {
            try {
                Circle cloned = (Circle) super.clone();
                cloned.point = new Point(point.getX(), point.getY());
                return cloned;
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }

        @Override
        public String toString() {
            return "Circle=[x="+getCenter().x+",y="+getCenter().y+",radius="+radius+"]";
        }
    }

   public static class Rectangle extends Shape {
       private double width;
       private double height;


       public Rectangle(Point topLeft, double width, double height) {
           super(topLeft);
           this.width = width;
           this.height = height;
       }

       @Override
       public Point getCenter() {
           return new Point((point.getX() + width) / 2, (point.getY() + height) / 2);
       }

       @Override
       protected Rectangle clone() {
           try {
               Rectangle cloned = (Rectangle) super.clone();
               cloned.point = new Point(point.getX(), point.getY());
               return cloned;
           } catch (CloneNotSupportedException e) {
               return null;
           }
       }

       @Override
       public String toString() {
           return "Rectangle=[x="+point.getX()+",y="+point.getY()+",width="+width+",height"+height+"]";
       }


   }

       public static class Line extends Shape {
           private Point from;
           private Point to;

           @Override
           public String toString() {
               return "Line=[from="+from.getX()+","+from.getY()+" to="+to.getX()+","+to.getY()+"]";
           }

           public Line(Point from, Point to) {
               super(null);
               this.from = from;
               this.to = to;
               this.point = new Point(
                       (from.getX() + to.getX()) / 2,
                       (from.getY() + to.getY()) / 2
               );
           }

           @Override
           public Point getCenter() {
               return point;
           }
           @Override
           protected Line clone() {
               try {
                   Line cloned = (Line) super.clone();
                   cloned.point = new Point(point.getX(), point.getY());
                   cloned.from = new Point(from.getX(), from.getY());
                   cloned.to = new Point(to.getX(), to.getY());
                   return cloned;
               } catch (CloneNotSupportedException e) {
                   return null;
               }
           }

           @Override
           public void moveBy(double dx, double dy) {
               super.moveBy(dx, dy);
               from=new Point(from.getX()+dx,from.getY()+dy);
               to=new Point(to.getX()+dx,to.getY()+dy);
           }
       }


   }


