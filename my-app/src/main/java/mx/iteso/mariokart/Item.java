package mx.iteso.mariokart;

public abstract class Item {
/**
 *Tiempo.
 */
private int tiempo;
/**
 *Activar Item.
 * @param c
 */
public abstract void activeItem(MarioKartCharacter c);
/**
 *Get tiempo.
 * @return tiempo
 */
public int getTiempo() {
return tiempo;
}
/**
 *Set tiempo.
 * @param time
 */
public void setTiempo(final int time) {
this.tiempo = time;
}
}
