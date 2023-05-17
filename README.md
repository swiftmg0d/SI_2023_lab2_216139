## Втора лабораториска задача по СИ - Живче Глигоров 216139
> **1.Control Flow Graph** <br>
>  ![CFG](./CFG.jpg)

> **2.Цикломатската комплексност** <br>
> Согласно 1. постојат 11 predicate nodes : (1,2), (4), (7), (9.2), (11), (13), (19), (22), (23.2), (24) ; <br>
> Согласно формулата: Цикломатската комплексност = број на предикатни јазли + 1 <br>
> Цикломатската комплексност = 11 <br>

> A = null, new ArrayList()<> 
> B = new User(Kalu, kafanska pjevacica@, kalu.dragoliev@gmail.com ), new List.of(new User(Predrag, desamsinocbio@, predrag.petkov@gmail.com ) <br>
> C = new User(Kalu, kafanskapjevacica, kalu.dragoliev@gmail.com ), new List.of( new User(Kalu, kafanskapjevacica, kalu.dragoliev@gmail.com ) <br>
> D = new User(Kalu, kafanska pjevacica@, kalu.dragoliev@gmail.com ), new List.of(new User(Predrag, desamsinocbio@, predrag.petkov@gmail.com ) <br>
> A | B | C | D
> ---|---|---|---
> * | | |
> | * | * | *
> * | | |
> NOT | NOT | NOT |
> | * | * | *
> | * | * | *
> | | * | *
> | * | |
> | | * | *
> | | * | *
> | | * | *
> | | * | *
> | | * | 
> | | | *
> | | * | 
> | | * | 
> | | | *
> | | * |
> | | * | *
> | | * | *
> | | * | *
> | * | * | *
> | * | |
> | * | |
> | | * | * 
> | | * | *
> | | | *
> | | * |
> | | * |
> | | * |
> | | * |
> | | * |
> | | | *
> | | | *
> | | * |
> | | * |








