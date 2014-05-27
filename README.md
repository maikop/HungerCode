HungerCode
==========

KASUTUSNÄIDE

newRecipe("recipe name", ingredient1 = int unit, ingredient2...);

Näide:
newRecipe("Pancakes", flour = 500 g, egg = 4 pc, sugar = 100 g, salt = 1 g, milk = 500 dl, servings = 2);



newFood(ingredient1, ingredient2, ingredient3, ... , True|False) => True - kõikidest argumendiks antud toiduainetest peab piisama toidu valmistamiseks. 

False (see on default) - annab ka retsepte, kus osad toiduained puudu on. Kõigepealt annab need retseptid, millest sul rohkem toiduaineid olemas on.
 

Näide:

newFood(flour, egg, sugar, salt);

newFood(flour, egg, sugar, salt, milk, True);

newFood(flour, egg, sugar, salt, milk, ginger); (mul on gingerit ka, äkki sellest saab ka midagi teha?)

Hetkel väljastab vastavalt:

"PANCAKES": FLOUR 500G EGG 4PC SUGAR 100G SALT 1G MILK 500DL   (Sul on 4 toiduainet olemas)

"PANCAKES": FLOUR 500G EGG 4PC SUGAR 100G SALT 1G MILK 500DL

"PANCAKES": FLOUR 500G EGG 4PC SUGAR 100G SALT 1G MILK 500DL   (Sul on 5 toiduainet olemas)

TULEVIKUVAATED

Reitingusüsteem:

newRecipe("Pancakes", flour = 500 g, egg = 4 pc, sugar = 100 g, salt = 1 g, milk = 500 dl, servings = 2, star = 7);

Kasutaja annab retseptidele reitingu. newFood välja kutsumisel sobivad retseptid väljastatakse suurem reiting eespool.

Retsepte saab kätte selle nimetuse järgi. Näiteks eelneva retsepti puhul:

Pancakes.getRecipe();

Retsepri saab kustutada:

Pancakes.deleteRecipe();

Väljastatakse Pancakes retsept.

Saab lisada ja küsida juhised retsepti valmistamiseks:

Pancakes.addInstructions("Instructions as string");
Pancakes.getInstructions(); (Väljastab ekraanile juhised tekstina)

Saab lisada, muuta ja küsida retseptis mingi aine koguse:

Pancakes.addIngredient(butter = 20 g);
Pancakes.setIngredient(sugar = 75 g);
Pancakes.getIngredient(sugar); (Väljastatakse 75 g)

Veateated:

Kasutatud mittelegaalset sõna: 'UndefinedName'

Püütakse lisada retsept, mille nimetus on juba olemas: '"Pancakes" already exists. Try another name (e.g. "Pancakes2")'

Püütakse saada retsept, mida ei eksisteeri: 'Recipe "Pancakes" not found.'

Püütakse muuta ainet, mida selle retseptis ei eksisteeri: 'Ingredient "ginger" in "Pancakes" not found.'

