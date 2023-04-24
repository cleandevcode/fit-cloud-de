package wc;

import a0.g2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import s.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: k */
    public static volatile d f29782k;

    /* renamed from: a */
    public i f29783a;

    /* renamed from: b */
    public a f29784b;

    /* renamed from: d */
    public int f29786d;

    /* renamed from: e */
    public int f29787e;

    /* renamed from: f */
    public LinkedBlockingQueue<Integer> f29788f;

    /* renamed from: g */
    public AtomicInteger f29789g;

    /* renamed from: h */
    public AtomicInteger f29790h;

    /* renamed from: i */
    public long f29791i;

    /* renamed from: c */
    public volatile boolean f29785c = false;

    /* renamed from: j */
    public byte f29792j = 0;

    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: a */
        public final File f29793a;

        public a(File file) {
            d.this = r1;
            this.f29793a = file;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f29793a);
                StringBuilder a10 = android.support.v4.media.d.a("transfer thread has running, file name: ");
                a10.append(this.f29793a.getName());
                a10.append(", sendPktSize: ");
                g2.c(a10, d.this.f29786d);
                byte[] bArr = new byte[d.this.f29786d];
                while (d.this.f29785c) {
                    try {
                        ge.b.d("current put buffer type: " + d.this.f29788f.take());
                        for (int i10 = 0; i10 < d.this.f29787e; i10++) {
                            try {
                                int read = fileInputStream.read(bArr);
                                ge.b.d("read len: " + read);
                                if (read == -1) {
                                    ge.b.p("read the end of file, will exit the transfer thread ...");
                                    return;
                                }
                                if (d.this.f29789g.get() > 65535) {
                                    d.this.f29789g.set(0);
                                    ge.b.p("sequence number more than the max number(65535), reset to 0");
                                }
                                int andIncrement = d.this.f29789g.getAndIncrement();
                                int andAdd = d.this.f29790h.getAndAdd(read);
                                short s10 = 0;
                                for (int i11 = 0; i11 < (read % 2 == 0 ? read : read - 1); i11 += 2) {
                                    s10 = (short) (s10 ^ ((short) ((bArr[i11 + 1] << 8) | (bArr[i11] & 255))));
                                }
                                short s11 = (short) (((s10 & 255) << 8) | ((65280 & s10) >> 8));
                                ge.b.d("read completed, prepare to send, seq: " + andIncrement + ", Transferred: " + andAdd + ", sendSize: " + read);
                                if (c.f29781j == null) {
                                    ge.b.p("please call setup(Context, BeeProManager) first");
                                }
                                c.f29781j.j((short) andIncrement, s11, andAdd, (short) read, bArr);
                            } catch (IOException e10) {
                                e10.printStackTrace();
                                ge.b.f("read song file data failed, catch a io exception");
                                return;
                            }
                        }
                    } catch (InterruptedException unused) {
                        ge.b.p("receive a interrupt signal, will exit the transfer thread ... ");
                        return;
                    }
                }
                ge.b.p("exit transfer thread");
            } catch (FileNotFoundException unused2) {
                ge.b.f("send file data failed, transfer file can not found");
            }
        }
    }

    public static d b() {
        if (f29782k == null) {
            synchronized (d.class) {
                if (f29782k == null) {
                    f29782k = new d();
                }
            }
        }
        return f29782k;
    }

    public final void a(File file) {
        a aVar = this.f29784b;
        if (aVar != null) {
            d.this.f29785c = false;
            aVar.interrupt();
            this.f29784b = null;
            ge.b.d("stop last transfer thread");
        }
        LinkedBlockingQueue<Integer> linkedBlockingQueue = this.f29788f;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.clear();
        }
        this.f29789g.set(0);
        this.f29790h.set(0);
        this.f29791i = 0L;
        this.f29792j = (byte) 0;
        this.f29791i = file.length();
        try {
            this.f29788f.put(241);
            this.f29788f.put(242);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        this.f29785c = true;
        a aVar2 = new a(file);
        this.f29784b = aVar2;
        aVar2.start();
    }
}
