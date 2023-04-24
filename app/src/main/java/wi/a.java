package wi;

import java.util.UUID;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: wi.a$a */
    /* loaded from: classes2.dex */
    public static final class C0545a {

        /* renamed from: a */
        public final xi.a f29853a;

        /* renamed from: b */
        public UUID f29854b;

        /* renamed from: c */
        public UUID f29855c;

        /* renamed from: d */
        public UUID f29856d;

        /* renamed from: e */
        public int f29857e;

        /* renamed from: f */
        public boolean f29858f;

        /* renamed from: g */
        public String f29859g;

        /* renamed from: h */
        public bj.a<?> f29860h;

        public C0545a(xi.a aVar) {
            gm.l.f(aVar, "fcCore");
            this.f29853a = aVar;
            UUID fromString = UUID.fromString("000001ff-3c17-d293-8e48-14fe2e4da212");
            gm.l.e(fromString, "fromString(\"000001ff-3c17-d293-8e48-14fe2e4da212\")");
            this.f29854b = fromString;
            UUID fromString2 = UUID.fromString("0000ff02-0000-1000-8000-00805f9b34fb");
            gm.l.e(fromString2, "fromString(\"0000ff02-0000-1000-8000-00805f9b34fb\")");
            this.f29855c = fromString2;
            UUID fromString3 = UUID.fromString("0000ff03-0000-1000-8000-00805f9b34fb");
            gm.l.e(fromString3, "fromString(\"0000ff03-0000-1000-8000-00805f9b34fb\")");
            this.f29856d = fromString3;
            this.f29857e = 20;
        }
    }
}
