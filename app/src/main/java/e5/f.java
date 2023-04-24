package e5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import java.util.ArrayList;
import r4.l;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final q4.a f13455a;

    /* renamed from: b */
    public final Handler f13456b;

    /* renamed from: c */
    public final ArrayList f13457c;

    /* renamed from: d */
    public final o f13458d;

    /* renamed from: e */
    public final u4.d f13459e;

    /* renamed from: f */
    public boolean f13460f;

    /* renamed from: g */
    public boolean f13461g;

    /* renamed from: h */
    public n<Bitmap> f13462h;

    /* renamed from: i */
    public a f13463i;

    /* renamed from: j */
    public boolean f13464j;

    /* renamed from: k */
    public a f13465k;

    /* renamed from: l */
    public Bitmap f13466l;

    /* renamed from: m */
    public l<Bitmap> f13467m;

    /* renamed from: n */
    public a f13468n;

    /* renamed from: o */
    public int f13469o;

    /* renamed from: p */
    public int f13470p;

    /* renamed from: q */
    public int f13471q;

    /* loaded from: classes.dex */
    public static class a extends j5.c<Bitmap> {

        /* renamed from: d */
        public final Handler f13472d;

        /* renamed from: e */
        public final int f13473e;

        /* renamed from: f */
        public final long f13474f;

        /* renamed from: g */
        public Bitmap f13475g;

        public a(Handler handler, int i10, long j10) {
            this.f13472d = handler;
            this.f13473e = i10;
            this.f13474f = j10;
        }

        @Override // j5.h
        public final void c(Object obj) {
            this.f13475g = (Bitmap) obj;
            this.f13472d.sendMessageAtTime(this.f13472d.obtainMessage(1, this), this.f13474f);
        }

        @Override // j5.h
        public final void h(Drawable drawable) {
            this.f13475g = null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
            f.this = r1;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                f.this.b((a) message.obj);
                return true;
            } else if (i10 == 2) {
                f.this.f13458d.j((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public f(com.bumptech.glide.b bVar, q4.e eVar, int i10, int i11, z4.b bVar2, Bitmap bitmap) {
        u4.d dVar = bVar.f5660a;
        o e10 = com.bumptech.glide.b.e(bVar.f5662c.getBaseContext());
        n<Bitmap> x10 = com.bumptech.glide.b.e(bVar.f5662c.getBaseContext()).i().x(((i5.g) ((i5.g) new i5.g().d(t4.n.f27656a).v()).p()).h(i10, i11));
        this.f13457c = new ArrayList();
        this.f13458d = e10;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f13459e = dVar;
        this.f13456b = handler;
        this.f13462h = x10;
        this.f13455a = eVar;
        c(bVar2, bitmap);
    }

    public final void a() {
        if (this.f13460f && !this.f13461g) {
            a aVar = this.f13468n;
            if (aVar != null) {
                this.f13468n = null;
                b(aVar);
                return;
            }
            this.f13461g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + this.f13455a.d();
            this.f13455a.b();
            this.f13465k = new a(this.f13456b, this.f13455a.e(), uptimeMillis);
            n<Bitmap> C = this.f13462h.x((i5.g) new i5.g().o(new l5.b(Double.valueOf(Math.random())))).C(this.f13455a);
            C.B(this.f13465k, C);
        }
    }

    public final void b(a aVar) {
        this.f13461g = false;
        if (this.f13464j) {
            this.f13456b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f13460f) {
            this.f13468n = aVar;
        } else {
            if (aVar.f13475g != null) {
                Bitmap bitmap = this.f13466l;
                if (bitmap != null) {
                    this.f13459e.d(bitmap);
                    this.f13466l = null;
                }
                a aVar2 = this.f13463i;
                this.f13463i = aVar;
                int size = this.f13457c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) this.f13457c.get(size)).a();
                }
                if (aVar2 != null) {
                    this.f13456b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public final void c(l<Bitmap> lVar, Bitmap bitmap) {
        b0.c.i(lVar);
        this.f13467m = lVar;
        b0.c.i(bitmap);
        this.f13466l = bitmap;
        this.f13462h = this.f13462h.x(new i5.g().u(lVar, true));
        this.f13469o = m5.l.c(bitmap);
        this.f13470p = bitmap.getWidth();
        this.f13471q = bitmap.getHeight();
    }
}
