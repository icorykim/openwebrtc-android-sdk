/*
 * Copyright (C) 2015 Ericsson Research
 * Author: Patrik Oldsberg <patrik.oldsberg@ericsson.com>
 */
package com.ericsson.research.owr.sdk;

import com.ericsson.research.owr.Candidate;
import com.ericsson.research.owr.Payload;

import java.util.Map;

/**
 * An interface for describing a stream that is a part of a rtc session
 */
public interface StreamDescription {
    public String getId();

    public StreamType getStreamType();

    public StreamMode getMode();

    public String getUfrag();

    public String getPassword();

    public int getCandidateCount();

    public Candidate getCandidate(int index);

    public String getDtlsSetup();

    public String getFingerprint();

    public String getFingerprintHashFunction();

    // media only
    public String getCname();

    public boolean isRtcpMux();

    public int getSsrcCount();

    public long getSsrc(int index);

    public int getPayloadCount();

    public Payload getPayload(int index);

    public Map<String, Object> getPayloadParameters(int index);

    // data only
    public int getSctpPort();

    public int getMaxMessageSize();

    public String getAppLabel();
}