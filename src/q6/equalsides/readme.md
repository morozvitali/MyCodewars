Ось український переклад умови завдання:

📋 Опис:
Тобі буде надано масив цілих чисел. Твоя задача — знайти індекс N,
де сума елементів зліва від N дорівнює сумі елементів справа від N.
Якщо немає жодного індексу, що задовольняє цю умову — поверни -1.

📌 Приклади:
1️⃣ Масив: {1, 2, 3, 4, 3, 2, 1}
👉 Функція повинна повернути 3, бо:

Ліва частина до індексу 3 (не включаючи): {1, 2, 3} → сума 6
Права частина після індексу 3: {3, 2, 1} → сума 6

2️⃣ Масив: {1, 100, 50, -51, 1, 1}
👉 Функція повинна повернути 1, бо:

Ліва частина: {1} → сума 1
Права частина: {50, -51, 1, 1} → сума 1

3️⃣ Масив: {20, 10, -80, 10, 10, 15, 35}
👉 Функція повинна повернути 0, бо:

Ліва частина: {} (порожня) → сума 0
Права частина: {10, -80, 10, 10, 15, 35} → сума 0

📎 У цьому завданні порожні масиви мають суму 0.

🔢 Вхідні дані:
Цілий масив, довжина якого: 0 < arr.length < 1000
Кожен елемент — ціле число (може бути від’ємним або додатним)

🔙 Вихідні дані:
Найменший індекс N, при якому сума лівої частини дорівнює сумі правої
Якщо такого індексу немає — поверни -1

📝 Примітка:
Якщо існує кілька правильних індексів — поверни найменший із них.
У більшості мов програмування індексація масиву починається з 0.

Якщо хочеш, можу одразу дати реалізацію на Java або приклад для тренування 😉







