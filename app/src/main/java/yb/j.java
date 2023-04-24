package yb;

import java.util.UUID;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public long f31322a = 1800000;

    /* renamed from: b */
    public volatile boolean f31323b = false;

    /* renamed from: c */
    public a f31324c = null;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public String f31325a = UUID.randomUUID().toString().replace("-", "");

        /* renamed from: b */
        public boolean f31326b = true;

        /* renamed from: c */
        public long f31327c;

        public a(long j10) {
            j.this = r4;
            this.f31325a += "_" + j10;
            this.f31327c = j10;
            r4.f31323b = false;
        }
    }
}
