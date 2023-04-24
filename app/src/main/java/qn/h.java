package qn;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a */
    public File f25100a;

    /* renamed from: b */
    public RandomAccessFile f25101b;

    /* renamed from: c */
    public Object f25102c;

    public h(File file) {
        boolean z10;
        this.f25100a = new File(file, ".lck");
        try {
            Class.forName("java.nio.channels.FileLock");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        if (z10) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f25100a, "rw");
                this.f25101b = randomAccessFile;
                Object invoke = randomAccessFile.getClass().getMethod("getChannel", new Class[0]).invoke(this.f25101b, new Object[0]);
                this.f25102c = invoke.getClass().getMethod("tryLock", new Class[0]).invoke(invoke, new Object[0]);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException unused2) {
                this.f25102c = null;
            }
            if (this.f25102c == null) {
                a();
                throw new Exception("Problem obtaining file lock");
            }
        }
    }

    public final void a() {
        try {
            Object obj = this.f25102c;
            if (obj != null) {
                obj.getClass().getMethod("release", new Class[0]).invoke(this.f25102c, new Object[0]);
                this.f25102c = null;
            }
        } catch (Exception unused) {
        }
        RandomAccessFile randomAccessFile = this.f25101b;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            this.f25101b = null;
        }
        File file = this.f25100a;
        if (file != null && file.exists()) {
            this.f25100a.delete();
        }
        this.f25100a = null;
    }
}
