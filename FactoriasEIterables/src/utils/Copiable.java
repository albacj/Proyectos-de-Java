package utils;

//Extendiendo en las respectivas interfaces
//esta interfaz se consiguen dos objetivos
//a) que la clase correspondiente tenga que implementar clone
//b) que en los Test se pueda invocar al metodo clone con
// el correspondiente tipo de objetos.
public interface Copiable<T> extends Cloneable {
	T clone();
}
