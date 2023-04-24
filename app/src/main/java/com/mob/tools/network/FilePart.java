package com.mob.tools.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class FilePart extends HTTPPart {

    /* renamed from: a */
    private File f9118a;

    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() {
        return new FileInputStream(this.f9118a);
    }

    @Override // com.mob.tools.network.HTTPPart
    public long b() {
        return this.f9118a.length();
    }

    public void setFile(File file) {
        this.f9118a = file;
    }

    public void setFile(String str) {
        this.f9118a = new File(str);
    }

    public String toString() {
        return this.f9118a.toString();
    }
}
