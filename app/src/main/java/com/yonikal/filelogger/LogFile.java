package com.yonikal.filelogger;

/**
 * Created by yonikal on 08/08/2017.
 */
public enum LogFile {

    LOG_FILE("log.txt");

    private String mFileName;

    LogFile(String fileName) {
        mFileName = fileName;
    }

    public String getFileName() {
        return mFileName;
    }
}
