package no.nordicsemi.android.dfu.internal.manifest;

import ra.b;

/* loaded from: classes2.dex */
public class SoftDeviceBootloaderFileInfo extends FileInfo {
    @b("bl_size")
    private int bootloaderSize;
    @b("sd_size")
    private int softdeviceSize;

    public int getBootloaderSize() {
        return this.bootloaderSize;
    }

    public int getSoftdeviceSize() {
        return this.softdeviceSize;
    }
}
