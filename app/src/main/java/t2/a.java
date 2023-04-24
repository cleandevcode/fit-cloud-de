package t2;

import a.b;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e */
    public static final HashMap f27519e = new HashMap();

    /* renamed from: a */
    public final File f27520a;

    /* renamed from: b */
    public final Lock f27521b;

    /* renamed from: c */
    public final boolean f27522c;

    /* renamed from: d */
    public FileChannel f27523d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        File file2 = new File(file, b.b(str, ".lck"));
        this.f27520a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = f27519e;
        synchronized (hashMap) {
            lock = (Lock) hashMap.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                hashMap.put(absolutePath, lock);
            }
        }
        this.f27521b = lock;
        this.f27522c = z10;
    }

    public final void a(boolean z10) {
        this.f27521b.lock();
        if (z10) {
            try {
                File parentFile = this.f27520a.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f27520a).getChannel();
                this.f27523d = channel;
                channel.lock();
            } catch (IOException e10) {
                this.f27523d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        FileChannel fileChannel = this.f27523d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f27521b.unlock();
    }
}
