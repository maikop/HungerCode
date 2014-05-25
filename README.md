HungerCode
==========

KASUTUSNÄIDE

newRecipe("recipe name", ingredient1 = int unit, ingredient2...)

Näide:
newRecipe("Pancakes", flour = 500 g, egg = 4 pc, sugar = 100 g, salt = 1 g, milk = 500 dl, servings = 2)



newFood(ingredient1, ingredient2, ingredient3, ... , True|False) => True - kõikidest argumendiks antud toiduainetest peab piisama toidu valmistamiseks. 
 False (see on default) - annab ka retsepte, kus osad toiduained puudu on. Kõigepealt annab need retseptid, millest sul rohkem toiduaineid olemas on.
 

Näide:

newFood(flour, egg, sugar, salt, True)
newFood(flour, egg, sugar, salt, milk)
