package com.codespace.work2;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 2-2
 *
 * ЗАДАНИЕ:
 * 1. Создайте в проекте PracticalWork2 новый пакет work22, в котором создайте класс Task22.
 * 2. Добавьте в класс Task22 метод public static void main(String[] args) { }.
 * 3. Добавьте в код метода main(...) следующее:
 *      − определите текущее время;
 *      − выведите количество времени в формате DD-HH-MM-SS, прошедшее с 1 января 1970 года;
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте метод System.currentTimeMillis(), который определяет время, прошедшее с 1 января 1970 года, в миллисекундах.
 * 3. Используйте арифметические операции для получения информации и секундах, минутах, часах и днях.
 * 4. Используйте оператор System.out.println(...) для вывода информации.
 *
 */

public class Task22 {
    public static void main (String[] args) {
        long currentTime = System.currentTimeMillis();
        long amountOfSeconds = currentTime/1000;
        long amountOfMinutes = amountOfSeconds/60;
        long amountOfHours = amountOfMinutes/60;
        long amountOfDays = amountOfHours/24;

        /** case 1 - solving case by using formatting tool */

        String timeDateFormatted = new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new java.util.Date(currentTime));
        String timeDateFormattedLikeInTask = new java.text.SimpleDateFormat("DD:MM:HH:SS").format(new java.util.Date(currentTime));
        System.out.println("Local date-time FORMATTED is " + timeDateFormatted);
        System.out.println("Local date-time FORMATTED LIKE IN TASK is " + timeDateFormattedLikeInTask);


        /** case 2 - solving case by counting the actual dates */
        long YY = 1970 + (amountOfSeconds / (3600L*24L*365L)); //31556926

        long dayCountTillJan2018 = (((YY-1970)/4)*366 + ((YY-1970)-(YY-1970)/4)*365)-1; /**17531 days since Jan 1970 till Dec,31 2017 */
        long dayCountIn2018 = amountOfDays - dayCountTillJan2018; /**more than 70 days */
        long fullMonthsIn2018 = ((dayCountIn2018 * 12) / 365);  /** 2 full months + part of third month*/


        long daysFormattedInSeconds = amountOfDays*3600*24;
        long hoursFormattedInSeconds = amountOfHours*3600;
        long minutesFormattedInSeconds = amountOfMinutes*60;
        long secondsFormattedInMiliseconds = amountOfSeconds*1000;


        long MM = ++fullMonthsIn2018;
        long DD = dayCountIn2018 - 31 - 28 ;
        long HH = ((amountOfSeconds - daysFormattedInSeconds)/3600) + 2;
        long MI = ((amountOfSeconds - hoursFormattedInSeconds)/60);
        long SS = (amountOfSeconds - minutesFormattedInSeconds);
        long MS = (currentTime - secondsFormattedInMiliseconds);

        System.out.println("Local date-time COUNTED is "
                                            + DD + "." + MM + "." + YY + " "
                                            + HH + ":" + MI + ":" + SS);
        System.out.println(String.format("Local date-time COUNTED LIKE IN TASK is %d:%d:%d:%d",
                                            dayCountIn2018,MM,HH,MS));


        /** case 3 - solved in class */
        long time = System.currentTimeMillis() / 1000;
        long SS1 = time % 60 ;
        time /= 60;
        long MM1 = time % 60;
        time /= 60;
        long HH1 = time % 24 + 2;
        time /= 24;
        System.out.println(String.format("%d:%d:%d:%d",time,HH1,MM1,SS1));



        //  long DD = amountOfDays - dayCountTillJan2018;
                //((currentTime / 31556926)*(currentTime/2629743)+(fullMonthsIn2018/2629743));
       //    long  a =  amountOfSeconds - ((((amountOfSeconds / 31556926) * 12) + fullMonthsIn2018)) ;

    //    BigDecimal MM = new BigDecimal((currentTime/2629743) - (YY - 1970)*12).setScale(0, RoundingMode.CEILING);  1520778528

//        int averageYearMM = 365/12;
//        if (averageYearMM * ((dayCountIn2018 * 12) / 365) < dayCountIn2018) {
//            long MM = ((dayCountIn2018 * 12) / 365) + 1;
//        } else {
//
//        }

//        long DD = dayCountIn2018 - ((dayCountIn2018 * 12) / 365);

        //        long dayCountIn2018 = (currentTime/(1000*3600*24)) - dayCountTillJan2018; /**more than 70 days */

      //  System.out.println(DD);

//        long currentTimeSeconds = currentTime/1000;
//        long currentTimeMinutes = currentTimeSeconds/60;
//        long currentTimeHours = currentTimeMinutes/60;
//        long currentTimeDays = currentTimeHours/24;
//        long currentTimeMonths = currentTimeDays/69;
//        System.out.println("SS = " + currentTimeSeconds);
//        System.out.println("MI = " + currentTimeMinutes);
//        System.out.println("HH = " + currentTimeHours);
//        System.out.println("DD = " + dayCount);


    }
}
