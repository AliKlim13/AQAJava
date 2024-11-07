package Lesson_4;

public class Park {
    private String name;

    class Attraction{
        private String attractionName;
        private String time;
        private double price;

        public Attraction(String attractionName,String time, double price){
            this.attractionName = attractionName;
            this.time = time;
            this.price = price;
        }
        public void infoAttraction(){
            System.out.println("Название аттракциона:"+attractionName);
            System.out.println("Время работы:"+time);
            System.out.println("Стоимость:"+price);
        }
    }
    public Park(String name){
        this.name = name;
    }

    public void displayAttraction(){
        Attraction[] attractions = new Attraction[3];
        attractions[0]= new Attraction("Русские горки", "10.00-22.00", 500);
        attractions[1]= new Attraction("Шейкер", "10.00-22.00", 450);
        attractions[2]= new Attraction("Колесо обозрения", "10.00-21.00", 380);

        System.out.println("Аттракционы в парке:"+name);
        for (Attraction attraction: attractions){
            attraction.infoAttraction();
        }
    }
}
