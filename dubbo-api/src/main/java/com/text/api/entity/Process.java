package com.text.api.entity;

import java.io.Serializable;

public class Process implements Serializable {
    private static long serializableUID = 1L;

    private String processName;
    private String processAddress;

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProcessAddress() {
        return processAddress;
    }

    public void setProcessAddress(String processAddress) {
        this.processAddress = processAddress;
    }

    @Override
    public String toString() {
        return "Process{" +
                "processName='" + processName + '\'' +
                ", processAddress='" + processAddress + '\'' +
                '}';
    }
}
