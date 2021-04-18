# Lab 3 LFPC Conversion of Context Free Grammar to Chomsky Normal Form
##Variant No.22
![ ](/img/var22.png)

## Algorithm implementation steps:
![ ](/img/sc1.png)

1.**_Step 1 - Removing e-production (epsilon is writeen in grammar with symbol 0)_**

![ ](/img/sc2.png)

2.**_Step 2 - Remove Unit Productions (only one non-terminal in the right side)_**

![ ](/img/sc3.png)

3.**_Step 3 - Remove Non-Productive Symbols_**

![ ](/img/sc4.png)

4.**_Step 4 - Remove Inaccesible Symbols_**

![ ](/img/sc5.png)

5.**_Step 5.1 - Make all the rules of length 2 or 1_**

![ ](/img/sc6.1.png)

**_Step 5.2 - Add some terminal rules for the rules when the right side has one terminal and one non-terminal( ex.aB,cD,Ae)_**

![ ](/img/sc6.2.png)

6.**_Final Result_**

![ ](/img/sc7.png)