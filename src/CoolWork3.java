public class CoolWork3 {
    public static void main(String[] args) {
        //First level: Level1: В Китае живет 1 411 778 724 человек, всего в мире 197 стран.
        // Сколько бы человек жило на земле, если бы в каждой стране жило население, равное китайскому?

        long residentsOfChina = 1_411_778_724;
        int allCountries = 197;

        System.out.println(residentsOfChina * allCountries);

        //Level2: Феликс прожил 3011456_567  секунд. Сколько лет прожил Феликс?
        // Посчитать, используя Java, Long-переменные и деление.
        //Кто не знает - по какой формуле посчитать - напишите мне, но сначала подумайте

        long secondsOfLife = 3011456567L;
        long minutes = 60;
        long hour = 60;
        long days = 24;
        long year = 365;

        System.out.println(secondsOfLife / minutes / hour / days /year);














    }
}
