# Oefening 1: CodeCalculator (unit testen schrijven) 

De klasse CodeCalculator berekent het resultaat van een code die naar een rekenmachine gestuurd wordt.

De eenvoudigste codes zien er als volgt uit:
> &+(5,4,1) wat resulteert in 5 + 4 + 1 = 10

De code begint steeds met een & : achter de & kunnen de vier basisbewerkingen staan: + , - , * of /. Tussen de haken staan integer getallen, gescheiden door een komma.

De &+ bij de start kan ook weggelaten worden wat op hetzelfde neerkomt alsof er &+ staat. Volgende twee hebben dan ook een identiek resultaat:
> &+(5,4,1) resulteert in 5 + 4 + 1 = 10
>
> (5,4,1) resulteert in 5 + 4 + 1 = 10

In het laatste geval kunnen ook de haakjes weggelaten worden. Het volgende heeft dus ook net hetzelfde resultaat (ook dit werkt dus enkel alsof er &+ staat):
> 5,4,1 resulteert in 5 + 4 + 1 = 10

Spaties vooraan en achteraan, en ook spaties tussen de nummers zelf worden vergeven. Bvb.
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   5,&nbsp;&nbsp;&nbsp;4,&nbsp;&nbsp;&nbsp;&nbsp;1&nbsp;&nbsp; resulteert in 5 + 4 + 1 = 10
>
> (&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;,4,&nbsp;&nbsp;&nbsp;1) resulteert in 5 + 4 + 1 = 10
>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&+(&nbsp;&nbsp;5,4&nbsp;&nbsp;&nbsp;,&nbsp;&nbsp;&nbsp;1&nbsp;)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; resulteert in 5 + 4 + 1 = 10

Bij de aanwezigheid van alle andere karakters resulteert de berekening in 0.

**Je mag ervan uitgaan dat de getallen steeds integers zijn en dat een 0 nooit voorkomt als getal.**


-----

# Oefening 2: WikiFormatter (refactoring)

De klasse WikiFormatter genereert html vanuit een array van strings.

Deze strings bevatten MD-achtige formatting hints.

De input is een array van strings.

De output is 1 string. 

Elke input-string staat in de output in een html-element P
  
Dus
>     hallo dit is leuk

resulteert in: 

>     <p>hallo dit is leuk<p>

Als een deel van een input-string tussen 2 sterretjes staat dan wordt staat dat deel in de output tussen html-element B. 

Dus
>     hallo dit is *super leuk*!!!

resulteert in:
>     <p>hallo dit is <b>super leuk</b>!!!<p>

