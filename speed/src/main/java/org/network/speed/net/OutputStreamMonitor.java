package org.network.speed.net;

/**
 * @author Youchao Feng
 * @version 1.0
 * @date Sep 21, 2015 2:44 PM
 * @editBy Mohamed Salem
 */
public interface OutputStreamMonitor {
    void onWrite(IntWarp len);
}
