package org.network.speed.report;

public interface DownloadUploadSpeed {

    long getTcpDownloadSpeed();

    long getTcpUploadSpeed();

    long getUdpDownloadSpeed();

    long getUdpUploadSpeed();
    
}
