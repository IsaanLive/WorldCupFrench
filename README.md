<h1>Coupe du monde de la FIFA Application Android</h1>
<h2>Comment configurer un MP3 Android</h2>

Conditions d'application:
-Java JDK
-Eclipse IDE
-Android ADT Eclipse Plugin

<h2>1) Installation du Java JDK</h2>
L'un des avantages indirects est le JDK. Cliquez sur les liens suivants pour télécharger le JDK

o Téléchargez JDK ici

Après avoir téléchargé le fichier, ouvrez-le et suivez les instructions d'installation pour l'installer.

Vous devrez peut-être redémarrer votre système pour vous assurer que le JDK est chargé correctement.

<h2>2) Téléchargement du kit de démarrage SDK</h2>
Nous aurons besoin du SDK Starter Package alors téléchargez-le.

Maintenant, installez-le.

Si vous n'avez pas d'installateur, mais un fichier zip. Extrayez-le et rappelez-vous l'emplacement. Sous Windows, nous devons placer l'emplacement sur le SDK Android dans les variables Enviroment. C'est comme ça qu'on fait ça.

o Faites un clic droit sur "Ordinateur"
o Goto propriétés
o (Sur Win 7, cliquez sur "Propriétés système avancées")
o Cliquez sur l'onglet "Avancé"
o Cliquez sur "Variables d'environnement"
o Dans la moitié inférieure, faites défiler jusqu'à "PATH"
o Cliquez dessus et cliquez sur le bouton "Modifier"
o Tapez un point-virgule ";" le type dans le chemin d'accès à votre installation SDK
o après ce type "\ sdk \ tools" 

Donc, si votre chemin d'installation est "C: \ Program
Fichiers \ Android "type" C: \ Program Files \ Android \ tools "

Cliquez sur OK sur tous les écrans. Maintenant, testons si tout s'est bien passé.
Allez au début, tapez cmd (une invite de commande s'ouvrira). Dans le type d'invite: android. Si configuré, le gestionnaire AVD (Andoid Virtual Device) démarrera.

<h2>3) Installation du SDK Android</h2>
Ouvrez le gestionnaire de SDK android

Sélectionnez l'API Android et cliquez sur installer le package

<h2>4) Installation de l'ecplise</h2>
Téléchargez Eclipse et extrayez le contenu.

o Windows 32
o Windows 64

Après avoir extrait Eclipse, accédez au dossier et ouvrez Eclipse en double-cliquant sur eclipse.exe

Eclipse va s'ouvrir.

<h2>5) Installation du plugin ADT pour Eclipse</h2>

1. Lancez Eclipse, puis sélectionnez Aide> Installer un nouveau logiciel ....

2. Cliquez sur Ajouter dans le coin supérieur droit.

3. Dans la boîte de dialogue Ajouter un référentiel qui apparaît, entrez "ADT Plugin" pour le nom et l'URL suivante pour
l'emplacement: https://dl-ssl.google.com/android/eclipse/

4. Cliquez sur OK
Remarque: Si vous rencontrez des problèmes lors de l'acquisition du plug-in, essayez d'utiliser "http" dans l'URL de localisation, au lieu de "https" (https est préférable pour des raisons de sécurité).

5. Dans la boîte de dialogue Logiciels disponibles, cochez la case en regard de Outils de développement, puis cliquez sur Suivant.

6. Dans la fenêtre suivante, vous verrez une liste des outils à télécharger. Cliquez sur Suivant.

7. Lisez et acceptez les contrats de licence, puis cliquez sur Terminer.
Remarque: Si vous recevez un avertissement de sécurité indiquant que l'authenticité ou la validité du logiciel ne peut pas être
établi, cliquez sur OK.

8. Lorsque l'installation est terminée, redémarrez Eclipse.

<h2>Configuration du plug-in ADT</h2>
Après avoir téléchargé l'ADT avec succès comme décrit ci-dessus, l'étape suivante consiste à modifier votre ADT
préférences dans Eclipse pour pointer vers le répertoire Android SDK:

1. Sélectionnez Fenêtre> Préférences ... pour ouvrir le panneau Préférences (Mac OS X: Eclipse> Préférences).

2. Sélectionnez Android dans le panneau de gauche.
Vous pouvez voir une boîte de dialogue vous demandant si vous souhaitez envoyer des statistiques d'utilisation à Google. Si oui, faites votre
choix et cliquez sur Continuer. Vous ne pouvez pas continuer avec cette procédure tant que vous n'avez pas cliqué sur Continuer.

3. Pour l'emplacement du SDK dans le panneau principal, cliquez sur Parcourir ... et localisez votre répertoire SDK téléchargé.

4. Cliquez sur Appliquer, puis sur OK.
Terminé! Si vous n'avez rencontré aucun problème, l'installation est terminée. Si vous installez le SDK Android pour la première fois, revenez à Installation du SDK pour terminer votre configuration.

<h2>6) Importation d'application</h2>
Maintenant vous avez terminé tout ce qui va dans l'éclipse, cliquez sur le fichier, puis sélectionnez l'importation:

Sélectionnez Projets existants dans l'espace de travail:

Maintenant, sélectionnez le répertoire racine (dossier mp3 dans le zip):

Cliquez sur OK, puis terminez. Maintenant, vous verrez l'application dans l'onglet de vos projets. Développez la source, développez src, à droite
cliquez sur com.mp3wiz cliquez sur réfracteur-> renommer. Maintenant, sélectionnez Renommer les paquets Sub et changez le nom
de com.euroasia.nl à com.renamepackage

App_name à quel que soit votre nom l'application ex. MP3FR topappsurl à l'URL de votre application.

<h2>8) Exportation de l'application</h2>
Maintenant, il est temps d'exporter l'application. Sélectionnez le fichier -> exporter -> Exporter l'application Android -> Suivant ->
Maintenant, sélectionnez votre application

<h2>Site officiel</h2>
https://euroasia.company
