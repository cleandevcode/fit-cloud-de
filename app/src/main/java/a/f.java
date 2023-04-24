package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import c4.h;
import com.bumptech.glide.n;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import com.topstep.fitcloudpro.R;
import mf.a0;
import pm.j;
import tk.p;
import tl.l;

/* loaded from: classes.dex */
public final class f implements h, db.c {

    /* renamed from: a */
    public static volatile boolean f7a;

    public /* synthetic */ f() {
    }

    public /* synthetic */ f(int i10) {
    }

    public static final Object b(tk.a aVar, xl.d dVar) {
        j jVar = new j(1, a0.i(dVar));
        jVar.u();
        aVar.a(new vm.a(jVar));
        Object t10 = jVar.t();
        return t10 == yl.a.COROUTINE_SUSPENDED ? t10 : l.f28297a;
    }

    public static final Object d(p pVar, xl.d dVar) {
        j jVar = new j(1, a0.i(dVar));
        jVar.u();
        pVar.c(new vm.b(jVar));
        return jVar.t();
    }

    public static void e(Context context, DialView dialView, Uri uri) {
        gm.l.f(uri, "uri");
        n<Bitmap> C = com.bumptech.glide.b.c(context).b(context).i().C(uri);
        C.B(new qi.c(dialView), C);
    }

    public static void f(Context context, DialView dialView, Uri uri, int i10) {
        gm.l.f(uri, "uri");
        n<Bitmap> C = com.bumptech.glide.b.c(context).b(context).i().C(uri);
        C.B(new qi.d(dialView, i10), C);
    }

    public static void g(ImageView imageView, Object obj, int i10) {
        boolean z10;
        int i11 = 0;
        if ((i10 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            i11 = R.drawable.ic_default_image_place_holder;
        }
        n<Drawable> x10 = com.bumptech.glide.b.e(imageView.getContext()).k(obj).x(i5.g.w(i11));
        gm.l.e(x10, "with(imageView.context)\n…aceholderOf(placeholder))");
        if (z10) {
            j5.e eVar = new j5.e(imageView);
            eVar.f17500b.f17504c = true;
            x10.B(eVar, x10);
            return;
        }
        x10.A(imageView);
    }

    @Override // c4.h
    public void a() {
        gm.j.e("DefaultDataHandler", "send CCM success in id2.");
    }

    @Override // c4.h
    public void c(int i10, int i11, String str) {
        gm.j.e("DefaultDataHandler", "send\u3000CCM failed ===> " + i10 + " msg ==> " + str + " code ==> " + i11);
    }

    @Override // db.c
    public void h(db.d dVar) {
        boolean z10;
        boolean z11;
        String str = dVar.f12970a;
        int i10 = dVar.f12975f;
        int length = str.length();
        boolean z12 = false;
        int i11 = 0;
        if (i10 < length) {
            loop0: while (true) {
                char charAt = str.charAt(i10);
                do {
                    if (charAt >= '0' && charAt <= '9') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 || i10 >= length) {
                        break loop0;
                    }
                    i11++;
                    i10++;
                } while (i10 >= length);
            }
        }
        if (i11 >= 2) {
            char charAt2 = dVar.f12970a.charAt(dVar.f12975f);
            char charAt3 = dVar.f12970a.charAt(dVar.f12975f + 1);
            if (charAt2 >= '0' && charAt2 <= '9') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (charAt3 >= '0' && charAt3 <= '9') {
                    z12 = true;
                }
                if (z12) {
                    dVar.e((char) ((charAt3 - '0') + ((charAt2 - '0') * 10) + 130));
                    dVar.f12975f += 2;
                    return;
                }
            }
            throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
        }
        char b10 = dVar.b();
        int o10 = rm.l.o(dVar.f12970a, dVar.f12975f, 0);
        if (o10 != 0) {
            if (o10 != 1) {
                if (o10 != 2) {
                    if (o10 != 3) {
                        if (o10 != 4) {
                            if (o10 == 5) {
                                dVar.e((char) 231);
                                dVar.f12976g = 5;
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(o10)));
                        }
                        dVar.e((char) 240);
                        dVar.f12976g = 4;
                        return;
                    }
                    dVar.e((char) 238);
                    dVar.f12976g = 3;
                    return;
                }
                dVar.e((char) 239);
                dVar.f12976g = 2;
                return;
            }
            dVar.e((char) 230);
            dVar.f12976g = 1;
        } else if (rm.l.m(b10)) {
            dVar.e((char) 235);
            dVar.e((char) ((b10 - 128) + 1));
            dVar.f12975f++;
        } else {
            dVar.e((char) (b10 + 1));
            dVar.f12975f++;
        }
    }
}
