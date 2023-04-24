package com.mob.tools.utils;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public class FileLocker implements PublicMemberKeeper {

    /* renamed from: a */
    private FileOutputStream f9325a;

    /* renamed from: b */
    private FileLock f9326b;

    private boolean a(boolean z10) {
        this.f9326b = z10 ? this.f9325a.getChannel().lock() : this.f9325a.getChannel().tryLock();
        return this.f9326b != null;
    }

    public synchronized void lock(Runnable runnable, boolean z10) {
        if (lock(z10) && runnable != null) {
            runnable.run();
        }
    }

    public synchronized boolean lock(boolean z10) {
        return lock(z10, z10 ? 1000L : 500L, 16L);
    }

    public synchronized boolean lock(boolean z10, long j10, long j11) {
        if (this.f9325a == null) {
            return false;
        }
        return a(z10);
    }

    public synchronized void release() {
        if (this.f9325a == null) {
            return;
        }
        unlock();
        try {
            this.f9325a.close();
        } catch (Throwable unused) {
        }
        this.f9325a = null;
    }

    public synchronized void setLockFile(String str) {
        try {
            this.f9325a = new FileOutputStream(str);
        } catch (Throwable unused) {
            FileOutputStream fileOutputStream = this.f9325a;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                this.f9325a = null;
            }
        }
    }

    public synchronized void unlock() {
        FileLock fileLock = this.f9326b;
        if (fileLock == null) {
            return;
        }
        try {
            fileLock.release();
        } catch (Throwable unused) {
        }
        this.f9326b = null;
    }
}
