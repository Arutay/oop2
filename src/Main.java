

public class Main {

    public static void main(String[] args) {
        Car BMW = new Car("BMW", "z8", 3.0, "черный", 2020, "Германия", "автоматическая","седан", "a0001aa99", 4, true, true);
        Car Lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия","автоматическая","седан", "d3123gf099", 4,true,true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия","автоматическая","седан","d1323sdg55", 4,true,true);
        Car kia = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "автоматическая","седан","v5134vv42",4,true,true);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автоматическая","седан", "а4534аы12", 4,true,true);

        System.out.println(BMW);
        System.out.println(Lada);
        System.out.println(audi);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}