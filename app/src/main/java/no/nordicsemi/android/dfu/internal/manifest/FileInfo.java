package no.nordicsemi.android.dfu.internal.manifest;

import ra.b;

/* loaded from: classes2.dex */
public class FileInfo {
    @b("bin_file")
    private String binFile;
    @b("dat_file")
    private String datFile;

    public String getBinFileName() {
        return this.binFile;
    }

    public String getDatFileName() {
        return this.datFile;
    }
}
