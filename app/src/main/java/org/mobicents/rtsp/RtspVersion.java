package org.mobicents.rtsp;

import org.jboss.netty.handler.codec.http.HttpVersion;

/**
 * Created by Neo on 2015/12/14.
 */
public class RtspVersion extends HttpVersion {

    public static final RtspVersion RTSP_1_0 = new RtspVersion("RTSP", 1, 0);

    public RtspVersion(String text) {
        super(text);
    }

    public RtspVersion(String protocolName, int majorVersion, int minorVersion) {
        super(protocolName, majorVersion, minorVersion);
    }

    public static RtspVersion valueOf(String text) {
        if (text == null) {
            throw new NullPointerException("text");
        }

        text = text.trim().toUpperCase();
        if (text.equals("RTSP/1.0")) {
            return RTSP_1_0;
        }
        return new RtspVersion(text);
    }
}
