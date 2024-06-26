[[p-группа]]
[[Центр группы]]
[[Порядок группы]]

#### Формулировка
Пусть $p \in \mathbb{P}$, а $G$ - $p$-группа. Тогда $|Z(G)| \ \vdots\ p$. 

>[!info]+ Смысл
>Порядок центра $p$-группы кратен $p$. 
#### Доказательство
Рассмотрим действие $Inn(G)$ на $G$.
По [[Теорема об изоморфности факторгруппы по центру и множеству всех сопряжений]], имеем $Inn(G) \simeq G/Z(G)$. Откуда следует, что 
$$|Inn(G)| = |G/Z(G)| = (G : Z(G)) = \frac{|G|}{|Z(G)|}$$
Значит, $|Inn(G)| = p^k$, где $k \leq n$. 
По [[Свойство действия группы №4]], $G$ разбивается на орбиты под действием $Inn(G)$. 
По [[Теорема о порядке стабилизатора, орбиты и группы]], $|G| \ \vdots\ |\langle x \rangle|$, где $x \in G$. 
То есть $|G| = p^k$ делится на размеры всех этих орбит. Следовательно, размер орбиты равен либо 1, либо число, кратное $p$. 

Если $\langle x \rangle$ - одноэлементная орбита, то $x \in St(G)$, потому что при взаимодействии с каждым элементов из $Inn(G)$ он выдаёт один и тот же результат.
$$\langle x\rangle = \{ax : a \in Inn(G)\} = \{x\}$$
По [[Свойство центра группы №2]], одноэлементные орбиты под действием группы $Inn(G)$ образуют в точности элементы из $Z(G)$, так как если в орбите находится только один элемент и мы действуем на него группой $Inn(G)$, то этот элемент при взаимодействии с каждым сопряжением остаётся неизменным. Следовательно, он принадлежит стабилизатору.
Напомню, что смежные классы образуют полное покрытие множества $G$, ведь $G$ - это множество непересекающихся смежных классов, по [[Свойство смежных классов №4]] (см. [[Теорема Лагранжа#Доказательство]]).
Так как $|G|\ \vdots\ p$, то количество одноэлементных орбит $N = |Z(G)|$ делится на $p$ ($N + \sum\limits_{i\in I} M_i = |G|$, где $M_i$ - количество элементов в орбите, кратной $p$), то $|Z(G)|\ \vdots\ p$. 



