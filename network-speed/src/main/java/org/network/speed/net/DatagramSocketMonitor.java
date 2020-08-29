package org.network.speed.net;

import java.net.DatagramPacket;

/**
 * @author Youchao Feng
 * @version 1.0
 * @date Sep 23, 2015 11:37 AM
 * @editBy Mohamed Salem
 */
public interface DatagramSocketMonitor {

    /**
     * This method will be called after
     * {@link java.net.DatagramSocket#send(DatagramPacket)} is called.
     *
     * @param len Sent packet length.
     */
    void onSend(final IntWarp len);

    /**
     * This method will be called after
     * {@link java.net.DatagramSocket#receive(DatagramPacket)} is called.
     *
     * @param len Received packet length.
     */
    void onReceive(final IntWarp len);
}
