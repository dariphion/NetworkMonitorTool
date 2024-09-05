package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ping {

    public static final Logger logger = LogManager.getLogger("info");

    public static void isHostAvailable(final String host, final int port, final int timeout) {
        try (final Socket socket = new Socket()) {
            final InetAddress inetAddress = InetAddress.getByName(host);
            final InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, port);

            socket.connect(inetSocketAddress, timeout);
            logger.info("Host available");
        } catch (java.io.IOException e) {
            logger.error("Error...{}", e.getMessage());
        }
    }
    }


