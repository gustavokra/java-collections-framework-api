# Interface Enumeration
Um objeto que implemento a interface Enumeration gera uma série de elementos, um por vês.
Por exemplo, para mostrar todos elementos de um Vector <E> v:

```
for (Enumeration<E> e = v.elements(); e.hasMoreElements();) {
	System.out.println(e.nextElement());
}
```

Métodos são enumeráveis por meio dos elementos de um *vetor*, das chaves de uma *hashtable* e dos valores de uma *hashtable*. Enumerações também são usadas para especificar os fluxos de entrada para um *SequenceInputStream*.

A funcionalidade dessa interface é duplicada pela interface *Iterator*, e além disso, *Iterator* tem uma operação adicional *remove()*, além de nomes de métodos mais curtos.
Novas aplicações devem considerar o uso de *Interator* em preferência a *Enumeration*. É possível adaptar *Enumeration* para um Iterator usando o método *asIterator()*.

Desde o Java 1.0;

![Screenshot from 2024-09-02 14-03-50.png](Screenshot%20from%202024-09-02%2014-03-50.png)
Fonte:
[Interface Enumeration<E>](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Enumeration.html)