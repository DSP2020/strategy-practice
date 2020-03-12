package acceleration;

import item.Item;

/**
 * @author hecto
 *
 */
public interface Acceleration {
/**
* @param i
* Item
*/
void itemAcceleration(Item i);

/**
*/
void basicAcceleration();

/**
* @param a
* int
*/
void setAcceleration(int a);

/**
* @return int
*/
int getAcceleration();
}
