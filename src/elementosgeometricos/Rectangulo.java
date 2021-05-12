package elementosgeometricos;

import ejerciciostp2.Electrodomestico;
import org.w3c.dom.css.Rect;

public class Rectangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;
    private Punto v4;

    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    public Punto getV4() {
        return v4;
    }

    public void setV4(Punto v4) {
        this.v4 = v4;
    }
    public Rectangulo(Punto v1, Punto v2, Punto v3, Punto v4)
    {
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
        this.v4=v4;

    }
    public double Area (){
        return ((getV1().distancia(getV2())* getV3().distancia(getV4())/2));
    }
    public int esIgual(Rectangulo otroRectangulo)
    {
        if (Area()<otroRectangulo.Area())
            return -1;
        else
            if (Area()>otroRectangulo.Area())
                return 1;
            else
                return 0;
    }
    public void invertir()
    {
        v1.setX(-v1.getX());
        v2.setX(-v2.getX());
        v3.setX(-v3.getX());
        v4.setX(-v4.getX());
    }
    public boolean esCuadrado()
    {   double lado1=  getV1().distancia(getV2());
       double lado2= getV3().distancia(getV4());
        return  (lado1==lado2);
    }
    public double largoSuperior ()
    {
     return    (getV1().distancia(getV2()));
    }
    public String poscion() {
        if (getV1().distancia(getV2()) < getV2().distancia(getV3()))
            return "acostado";
        else
            return "parado";
    }
}
