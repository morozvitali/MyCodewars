A Narcissistic Number (or Armstrong Number) 
is a positive number which is the sum of its own digits,
each raised to the power of the number of digits in a given base.
In this Kata, we will restrict ourselves to decimal (base 10).
For example, take 153 (3 digits), which is narcissistic:
    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
and 1652 (4 digits), which isn't:
    1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
The Challenge:
Your code must return true or false (not 'true' and 'false') 
depending upon whether the given number is a Narcissistic number in base 10.
This may be True and False in your language, e.g. PHP.
Error checking for text strings or other invalid inputs is not required, 
only valid positive non-zero integers will be passed into the function.
--------------------------------------------------------------------
Нарцисичне число (або число Армстронга) — це додатне число, 
яке дорівнює сумі своїх цифр, піднесених до степеня, 
що дорівнює кількості цифр у цьому числі. 
У цій задачі ми розглядаємо лише десяткову систему (основа 10).
Наприклад:
Число 153 (3 цифри) є нарцисичним, бо:
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
А число 1652 (4 цифри) — не є нарцисичним:
1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
Завдання:
Напиши функцію, яка повертає true або false
(тобто логічне значення, а не рядок)
— залежно від того, чи є передане
число нарцисичним у десятковій системі числення.
❗ Перевірку на текстові рядки або інші недійсні
вхідні значення робити не потрібно — функція 
отримуватиме лише додатні ненульові цілі числа.

