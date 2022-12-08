# Socket_jeu_en_reseau
Tic Tac toe en réseau

Les codes sont dans la branche master

Lancer l'application avec play.bat
  - Le premier utilisateur qui entre l'adresse IP et le port sera le Serveur
  - Le deuxième sera donc le Client

Fonctionnement : 
 
 1-  Condition Serveur/Client
  - Si il n'existe pas encore de serveur le premier qui entre l'IP et le port initialise le serveur socket(Fonction).
  - Si il existe déjà un serveur socket , une autre fonction créer le Socket Client
 
 2- Circulation de données entre Client et Serveur
  - Quand un utilisateur appuye sur une case , une fonction vérifie si la case est vide .Si oui, on garde la position de la case vide et on envoye ces coordonnées sous forme de String à l'aide d'un DataOutputStream.
  - L'autre utilisateur lit ces dernières avec un dataInputStream (placer dans une fonction), puis marque la case avec les coordonnées qui vient d'être lu sur sa table de jeu

3- Fonctionnement du jeu TicTacToe
  - Si un utisateur coche trois case avec une croix ou un rond , il gagne.
  - S'il n'y a plus possibilité de d'aligner trois croix ou rond , il y a une égalité
  
