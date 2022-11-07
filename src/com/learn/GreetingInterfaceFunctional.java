package com.learn;


/*Functional Interface est un nouveau concept introduit dans Java
        depuis la version 8. C'est une interface avec une seule méthode
        abstraite. Les expressions Lambda sont
        souvent utilisées pour créer rapidement un objet de Functional Interface.*/

@FunctionalInterface
public interface GreetingInterfaceFunctional {
    /*Si une interface est conçue pour but d'une functional interface,
    vous devez utiliser l'annotation @FunctionalInterface pour l'annoter.
    Même si cette démarche n'est pas obligatoire, cela permet aux autres de
    mieux comprendre votre intention de conception */

    String greeting(String name);

    default String hello(String name) {
        return "Hello " + name;
    }
}
