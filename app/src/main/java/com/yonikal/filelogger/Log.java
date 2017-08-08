package com.yonikal.filelogger;

import java.text.SimpleDateFormat;


/**
 * Created by yonikal on 08/08/2017.
 */
class Log {

    String mLogLine = null;

    public Log(Class<?> clazz, String log) {
        mLogLine = String.format("%s | %s : %s", getFormattedTime(), clazz.getSimpleName(), log);
    }

    public <T> Log(Class<?> clazz, String logFormat, T... args) {
        String format = getFormattedTime() + " | " + clazz.getSimpleName() + " : " + logFormat;
        mLogLine = String.format(format, args);
    }

    public static String getFormattedTime() {
        SimpleDateFormat output = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        String formattedTime = output.format(System.currentTimeMillis());
        return formattedTime;
    }

    @Override
    public String toString() {
        return mLogLine;
    }
}
