package com.mob.commons.cc;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class u extends RuntimeException {
    public u(String str, Throwable th2) {
        super(str, th2);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        StringBuilder a10 = android.support.v4.media.d.a("");
        a10.append(getMessage());
        printStream.println(a10.toString());
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        StringBuilder a10 = android.support.v4.media.d.a("");
        a10.append(getMessage());
        printWriter.println(a10.toString());
    }
}
