# century
# 07.10.2022
## метод centry возвращает номер столетия по году от Рождества Христова
## [ссылка на задание](https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/java)
## реализация 

* public static int century(int number) {
        // your code goes here
        int a = (number-1)/100+1;
        return a;

    }
  ## понравившееся решение, автор scottyboutin
    public static int century(int number) {
        return (number + 99) / 100;
     }
