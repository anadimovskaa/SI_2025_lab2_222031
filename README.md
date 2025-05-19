Ана Димовска 222031

*Control Flow Graph:
![Screenshot 2025-05-19 180038](https://github.com/user-attachments/assets/85c4a1af-6de4-48a0-b960-3f99a9496173)

*Цикломатската комплексност на овој метод е 9. Ова го добив според формулата М = број на услови + 1 = 8 + 1 = 9. Гранките се следните:
1.if (allItems == null)
2.for (i)
3.if (item.getName() == null || ...)
4.if (item.getPrice() > 300 || ...)
5.if (item.getDiscount() > 0)
6.if (cardNumber != null && ...)
7.for (j)
8.if (allowed.indexOf(c) == -1)
