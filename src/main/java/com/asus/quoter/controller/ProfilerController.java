package com.asus.quoter.controller;

import com.asus.quoter.api.ProfilerControllerMXBean;

public class ProfilerController implements ProfilerControllerMXBean {

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
