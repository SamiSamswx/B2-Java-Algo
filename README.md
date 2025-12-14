Question 1.2
Le résultat est false. L'opérateur == compare les joueurs jr1 et jr2

Question 1.3

Le résultat est false. Pareil que pour la question 1.2, il compare les joueurs jr1 et jr2

Question 1.6
Le résultat est false. L'opérateur ==continue de les comparer

Question 1.7

Le résultat est true. Les numéros sont comparés grâce à la modification de la méthode `equals().



Question 2.2

La méthode Collections.min(joueurs) permet de trouver le joueur avec le moins de victoires.

Question 2.3

Ca trie la liste par ordre croissant de victoires.


Question 2.5

Ça a permis de trier la liste sans toucher à la classe Joueur.


Question 3.2
Le résultat est -1 La méthode indexOf utilise le `equals` de base, donc elle ne trouve pas le joueur qu’on a créé.

Question 3.4

Le résultat est encore -1. La méthode `indexOf` cherche la méthode equals(Object), alors que nous avons écrit equals(Joueur)

Question 3.5
Il faut donc redéfinir la méthode equals en equals(object)
