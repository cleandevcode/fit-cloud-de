package p8;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b9.g;
import c9.l;
import d9.k;
import i8.x;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class a<T extends b9.g> {

    /* renamed from: a */
    public b9.g f23955a;

    /* renamed from: b */
    public Bundle f23956b;

    /* renamed from: c */
    public LinkedList f23957c;

    /* renamed from: d */
    public final p5.e f23958d = new p5.e(this);

    public static void a(b9.b bVar) {
        f8.d dVar = f8.d.f14180d;
        Context context = bVar.getContext();
        int c10 = dVar.c(context);
        String c11 = x.c(context, c10);
        String b10 = x.b(context, c10);
        LinearLayout linearLayout = new LinearLayout(bVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        bVar.addView(linearLayout);
        TextView textView = new TextView(bVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c11);
        linearLayout.addView(textView);
        Intent a10 = dVar.a(context, c10, null);
        if (a10 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new e(context, a10));
        }
    }

    public final void b(int i10) {
        while (!this.f23957c.isEmpty() && ((h) this.f23957c.getLast()).a() >= i10) {
            this.f23957c.removeLast();
        }
    }

    public final void c(Bundle bundle, h hVar) {
        if (this.f23955a != null) {
            hVar.b();
            return;
        }
        if (this.f23957c == null) {
            this.f23957c = new LinkedList();
        }
        this.f23957c.add(hVar);
        if (bundle != null) {
            Bundle bundle2 = this.f23956b;
            if (bundle2 == null) {
                this.f23956b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        p5.e eVar = this.f23958d;
        b9.h hVar2 = (b9.h) this;
        hVar2.f4050g = eVar;
        if (eVar != null && hVar2.f23955a == null) {
            try {
                try {
                    Context context = hVar2.f4049f;
                    boolean z10 = b9.c.f4039a;
                    synchronized (b9.c.class) {
                        b9.c.a(context);
                    }
                    c9.c q10 = l.a(hVar2.f4049f).q(new c(hVar2.f4049f), hVar2.f4051h);
                    if (q10 != null) {
                        hVar2.f4050g.r(new b9.g(hVar2.f4048e, q10));
                        Iterator it = hVar2.f4052i.iterator();
                        while (it.hasNext()) {
                            b9.d dVar = (b9.d) it.next();
                            b9.g gVar = hVar2.f23955a;
                            gVar.getClass();
                            try {
                                gVar.f4046b.m0(new b9.f(dVar));
                            } catch (RemoteException e10) {
                                throw new k(e10);
                            }
                        }
                        hVar2.f4052i.clear();
                    }
                } catch (RemoteException e11) {
                    throw new k(e11);
                }
            } catch (f8.f unused) {
            }
        }
    }
}
