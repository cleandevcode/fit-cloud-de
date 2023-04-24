package no.nordicsemi.android.dfu.internal.manifest;

import ra.b;

/* loaded from: classes2.dex */
public class Manifest {
    private FileInfo application;
    private FileInfo bootloader;
    @b("bootloader_application")
    private FileInfo bootloaderApplication;
    private FileInfo softdevice;
    @b("softdevice_application")
    private FileInfo softdeviceApplication;
    @b("softdevice_bootloader")
    private SoftDeviceBootloaderFileInfo softdeviceBootloader;
    @b("softdevice_bootloader_application")
    private FileInfo softdeviceBootloaderApplication;

    public FileInfo getApplicationInfo() {
        FileInfo fileInfo = this.application;
        if (fileInfo != null) {
            return fileInfo;
        }
        FileInfo fileInfo2 = this.softdeviceApplication;
        if (fileInfo2 != null) {
            return fileInfo2;
        }
        FileInfo fileInfo3 = this.bootloaderApplication;
        return fileInfo3 != null ? fileInfo3 : this.softdeviceBootloaderApplication;
    }

    public FileInfo getBootloaderInfo() {
        return this.bootloader;
    }

    public SoftDeviceBootloaderFileInfo getSoftdeviceBootloaderInfo() {
        return this.softdeviceBootloader;
    }

    public FileInfo getSoftdeviceInfo() {
        return this.softdevice;
    }

    public boolean isSecureDfuRequired() {
        return (this.bootloaderApplication == null && this.softdeviceApplication == null && this.softdeviceBootloaderApplication == null) ? false : true;
    }
}
