PARCOURIR UN ARBRE 
- Parcour en largeur :
    Dans le parcour en largeur on parcour l'abre par niveau on visite chaque noeud dans le même niveau ensuite on passe au niveau suivant 

- -Parcour en profondeur:
  - il y'a trois façons de parcourir un arbre en profondeur :
  - Le prefixe: on visite la racine , puis le sous arbre de gauche ensuite le sous arbre de droite (racine, gauche, droite )
  - infixe: On visite le sous arbre de gauche puis la racine, puis le sous arbre de droite(gauche, racine, droite)
  - postfixe: On visite le sous arbre gauche, le sous arbre droite puis la racine (gauche, droite, racine)
  - 
LA RECURSIVITE:
    C'est lorsqu'une fonction s'appelle elle même , c'est une façon de décomposer le problème en laissant la methode de la fonction s'appeler elle même au lieu de recourir à une boucle

  - NB le factoriel n'inclut pas les nombres négatifs 
  - f(3)
  - 3* f(2)
  - 2* f(1)
  - 1 * f(0) = 1
il doit toujours y avoir une condition d'arrêt dans une approche recursive
  - Exemple    if(n == 0) return 1;
  - 
  - public static int factoriel(int n){
    if(n == 0) return 1;

        return n * factoriel(n-1);
    }

PROFONDEUR ET HAUTEUR D'UN NOEUD
    Pour caculer la profondeur d'un noeud on commence  par la racine
    et pour calculer la hauteur on commence par les feuilles 

JAVA AVANCE 

    LES EXCEPTIONS:

Il ya trois types d'exceptions 
CHECKED : Ces ont des exceptions que tout bon développeur se doit d'anticiper , elles sont vérifiées lors de la compilation
UNCHECKED: Ce sont des exceptions qui peuvent arriver lorsque vous avez des erreurs de programmation Exemple NullPointerException, ArithmeticException, IllegalArgumentException, IndexOutOfBoundException

ERROR: Tout erreur qui se produit de fàcon externe à l'application: Exemple out of memory error, 

        GENERICITE


Le boxing c'est le fait d'envelopper un type primitif par son équivalent réference 
Le  unboxing c'est le fait d'extraire un type primitif de son équivalent réference.

LES CONTRAINTES DE GENERICITE: consiste à imposer l'implementation d'une interface 

exemple public class GenericList<T extends Number>

La méthode compareTo : Elle doit retourner :

Un nombre négatif si this est plus petit que other
Zéro si les deux sont égaux
Un nombre positif si this est plus grand que other






