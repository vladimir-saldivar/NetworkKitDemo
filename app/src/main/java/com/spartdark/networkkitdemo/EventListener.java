package com.spartdark.networkkitdemo;

public interface EventListener {
    /**
     * Callback to be called if an error occurs during request execution.
     *
     * @param message Error message.
     */
    void onException(String message);

    /**
     * Callback to be called when the request is executed successfully.
     *
     * @param message Message indicating that the request is executed successfully.
     */
    void onSuccess(String message);
}
