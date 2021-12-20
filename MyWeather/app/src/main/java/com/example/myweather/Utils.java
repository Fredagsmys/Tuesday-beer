package com.example.myweather;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

import wse.utils.Target;

public class Utils {


    public static String stringFormatter(String str) {
        str = str.toLowerCase();
        return str.substring(0, 1).toUpperCase() + str.substring(1);

    }

    public static void pulseAnimation(Float strength, View layout) {
        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(
                layout,
                PropertyValuesHolder.ofFloat("scaleX", strength),
                PropertyValuesHolder.ofFloat("scaleY", strength)
        );
        scaleDown.setDuration(80);
        scaleDown.setRepeatCount(1);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();

    }


    public static void setTarget(Target target) {
//        target.setTarget("192.168.86.50", 1337);
        target.setTarget("magge123.ddns.net", 1302);
    }

    public static String[] stringArrayFormatter(String[] str) {
        List<String> stringList = new LinkedList<>();
        for (String string : str) {
            string = string.toLowerCase();
            stringList.add(string.substring(0, 1).toUpperCase() + string.substring(1));
        }
        return stringList.toArray(new String[0]);
    }

    public static String stringArrToString(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(40);
        for (String string : str) {
            string = string.toLowerCase();
            stringBuilder.append(string.substring(0, 1).toUpperCase()).append(string.substring(1)).append(", ");
        }
        stringBuilder.setLength(stringBuilder.length() - 2);
        return stringBuilder.toString();

    }

    public static String getDateOnly(String timeStamp) {
        String[] result = timeStamp.split(" ");
        return result[0];
    }

    public static class DateFormat {

        private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.US);

        private static final SimpleDateFormat DATE_TODAY = new SimpleDateFormat("HH:mm");
        private static final SimpleDateFormat DATE_TOWEEK = new SimpleDateFormat("EEE HH:mm");
        private static final SimpleDateFormat DATE_TOYEAR = new SimpleDateFormat("dd MMM HH:mm");
        private static final SimpleDateFormat DATE_SPECIFIC = new SimpleDateFormat("dd MMM yyyy HH:mm");

        private Calendar instance;

        public static DateFormat of(String source) {
            try {
                DateFormat format = new DateFormat();

                Date date = DATE_FORMAT.parse(source);
                format.instance = Calendar.getInstance();
                format.instance.setTime(date);

                return format;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public String relative() {
            return relative(Calendar.getInstance());
        }

        public String relative(Calendar now) {
            SimpleDateFormat format;
            if (now.get(Calendar.YEAR) == instance.get(Calendar.YEAR)) {
                if (now.get(Calendar.DAY_OF_YEAR) == instance.get(Calendar.DAY_OF_YEAR)) {
                    format = DATE_TODAY;
                } else if (now.get(Calendar.WEEK_OF_YEAR) == instance.get(Calendar.WEEK_OF_YEAR)) {
                    format = DATE_TOWEEK;
                } else {
                    format = DATE_TOYEAR;
                }
            } else {
                format = DATE_SPECIFIC;
            }
            return format.format(instance.getTime());
        }

        public String today() {
            return DATE_TODAY.format(instance.getTime());
        }

        public String toweek() {
            return DATE_TOWEEK.format(instance.getTime());
        }

        public String toyear() {
            return DATE_TOYEAR.format(instance.getTime());
        }

        public String specific() {
            return DATE_SPECIFIC.format(instance.getTime());
        }

        public String format() {
            return DATE_FORMAT.format(instance.getTime());
        }

        public long getTime() {
            return instance.getTimeInMillis();
        }

        public long millisOfDay() {
            instance.setTimeZone(TimeZone.getTimeZone("GMT+2")); //verkar funka
            return ((

                    instance.get(Calendar.HOUR_OF_DAY) * 60
                            + instance.get(Calendar.MINUTE)) * 60
                    + instance.get(Calendar.SECOND)) * 1000
                    + instance.get(Calendar.MILLISECOND);
        }
    }

    public static List<Date> getDaysBetweenDates(Date startdate, Date enddate) {
        List<Date> dates = new ArrayList<>();
        Calendar calendar = new GregorianCalendar(Locale.US);
        calendar.setTime(startdate);

        while (calendar.getTime().before(enddate)) {
            Date result = calendar.getTime();
            dates.add(result);
            calendar.add(Calendar.DATE, 1);
        }
        return dates;
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

}
