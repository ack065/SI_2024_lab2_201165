Aleksandar Lavurovski 201165
Александар Лавуровски 201165

Controll Flow Graph:

![SILab2_CFG](https://github.com/ack065/SI_2024_lab2_201165/assets/166759494/ce2aa957-aa7e-4df7-8d36-f6b36da5ef98)

----

Цикоматска комплексност е 10. Израчунато е преку броење на зоните кои ги формираат јазлите и ребрата, но може и со формулата Cyclomatic Complexity = E – N + 2P

----

<p>( if statement)
<p>ab | allItems == null
<p>bc | AB = true
<p>ac | allItems != null</p>
<br>
<p>( if statement)
<p>ef | item.getName() == null || item.getName().length() == 0
<p>fg | EF = true
<p>eg | item.getName() == null || item.getName().length() != 0 </p>
<br>
<p>( if statement)
<p>go item.getBarcode() == null
<p>op GO = true
<p>gh item.getBarcode() != null</p>
<br>
<p>( if statement)
<p>ij allowed.indexOf(c) == -1
<p>jh ij = true
<p>ih allowed.indexOf(c) != -1</p>
<br>
<p>(if/else statement)
<p>km item.getDiscount() <= 0
<p>kl item.getDiscount() > 0</p>
<br>
<p>( if statement)
<p>qr item.getPrice() > 300  && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'
<p>rs qr = true
<p>qs item.getPrice() <= 300  && item.getDiscount() <= 0 && item.getBarcode().charAt(0) != '0'</p>
<br>
<p>(If/else statement)
<p>dt sum <= payment
<p>du sum > payment
<br>
  
----

<p>Нека:
<p>а= item.getPrice() > 300
<p>b= item.getDiscount() > 0
<p>c= item.getBarcode().charAt(0) == '0'
<p>T= true
<p>F= false
<p>X= missed (поради Lazy Evaluation)</p>
<br>
<p>Тогаш, потенцијалните тест случаи се следните:
<p>(a && b && c):
<p>FXX = 0
<p>TFX = 0
<p>TTF = 0
<p>TTT = 1

---
