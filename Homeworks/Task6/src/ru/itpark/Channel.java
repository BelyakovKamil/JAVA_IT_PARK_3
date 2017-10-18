package ru.itpark;


import java.time.LocalTime;

public class Channel {

    Channel(String name){

    }


    private Program programs[];


    public Program[] getPrograms() {
        return programs;
    }


    public void setPrograms(Program[] programs) {

        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                this.programs[i].setBeginTime(LocalTime.of(6, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(12, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(12, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(14, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Сериалы[это же Россиюшка))00)]");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(14, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(20, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Опять");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(20, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(21, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(21, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(23, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Снова сериальчики");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(23, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(24, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Познер");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(24, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(6, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Профилактика");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

            }

            if (i == 2) {

                this.programs[i].setBeginTime(LocalTime.of(6, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(12, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(12, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(14, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Сериальчик");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(14, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(20, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Еще один");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(20, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(21, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(21, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(23, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Снова сериальчик");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(23, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(24, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Продолжение");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(24, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(6, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Профилактика");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");
            }

            if (i == 3) {

                this.programs[i].setBeginTime(LocalTime.of(6, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(12, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(12, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(14, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Сериальчик");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(14, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(20, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Еще один");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(20, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(21, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Тут даже новостей нет(сериал)");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(21, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(23, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Снова сериальчик");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(23, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(24, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("И так понятно ;)");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(24, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(6, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Профилактика");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");
            }

            if (i == 4) {
                this.programs[i].setBeginTime(LocalTime.of(6, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(12, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(12, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(14, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(14, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(20, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Снова Новости");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(20, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(21, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Сериалов не будет");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(21, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(22, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости про Сирию");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(22, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(23, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости про Трампа");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(23, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(24, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Новости про Украину");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(24, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(1, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Кукушкин");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(1, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(6, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Профилактика(нет)(опять Нововсти)");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");
            }

            if (i == 5) {
                this.programs[i].setBeginTime(LocalTime.of(6, 0));
                System.out.println(programs[i].getBeginTime());
                programs[i].setEndTime(LocalTime.of(12, 0));
                System.out.print(" - " + programs[i].getEndTime());
                programs[i].setName("Мультики");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(12, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(14, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Сериалы");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(14, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(17, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Мультики");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(17, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(21, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Сериалы");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(21, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(23, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Кинчик");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(23, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(24, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Кино с деталями");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");

                this.programs[i].setBeginTime(LocalTime.of(24, 0));
                System.out.println(programs[i].getBeginTime());
                this.programs[i].setEndTime(LocalTime.of(6, 0));
                System.out.print(" - " + programs[i].getEndTime());
                this.programs[i].setName("Профилактика");
                System.out.print(": " + programs[i].getName());

                System.out.println("______________");
            }
        }

    }
}


