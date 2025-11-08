package com.mruruc.behavioral.chain_of_responsibility.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Context {
    private final Map<String, Object> attributes = new HashMap<>();
    private boolean aborted = false;
    private String abortReason;

    public <T> void set(String key, T value) {
        attributes.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(String key) {
        return (T) attributes.get(key);
    }


    public void abort(String reason) {
        this.aborted = true;
        this.abortReason = reason;
    }

    public boolean isAborted() {
        return aborted;
    }

    public Optional<String> abortReason() {
        return Optional.ofNullable(abortReason);
    }

}
