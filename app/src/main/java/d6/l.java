package d6;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import cn.sharesdk.framework.InnerShareParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l<CONTENT, RESULT> {

    /* renamed from: e */
    public static final Object f12702e = new Object();

    /* renamed from: a */
    public final Activity f12703a;

    /* renamed from: b */
    public List<? extends l<CONTENT, RESULT>.a> f12704b;

    /* renamed from: c */
    public int f12705c;

    /* renamed from: d */
    public o5.l f12706d;

    /* loaded from: classes.dex */
    public abstract class a {

        /* renamed from: a */
        public Object f12707a;

        public a(l lVar) {
            gm.l.f(lVar, "this$0");
            this.f12707a = l.f12702e;
        }

        public abstract boolean a(r6.d dVar);

        public abstract d6.a b(r6.d dVar);
    }

    public l(Activity activity, int i10) {
        gm.l.f(activity, InnerShareParams.ACTIVITY);
        this.f12703a = activity;
        this.f12705c = i10;
        this.f12706d = null;
    }

    public abstract d6.a a();

    public abstract ArrayList b();

    public final void c(o5.l lVar, o5.n<RESULT> nVar) {
        gm.l.f(lVar, "callbackManager");
        gm.l.f(nVar, "callback");
        if (lVar instanceof e) {
            o5.l lVar2 = this.f12706d;
            if (lVar2 == null) {
                this.f12706d = lVar;
            } else if (lVar2 != lVar) {
                Log.w("FacebookDialog", "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
            }
            d((e) lVar, nVar);
            return;
        }
        throw new o5.p("Unexpected CallbackManager, please use the provided Factory.");
    }

    public abstract void d(e eVar, o5.n<RESULT> nVar);

    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.activity.result.f, T] */
    public final void e(r6.d dVar) {
        Intent intent;
        d6.a aVar;
        Activity activity;
        if (this.f12704b == null) {
            this.f12704b = b();
        }
        List<? extends l<CONTENT, RESULT>.a> list = this.f12704b;
        if (list != null) {
            Iterator<? extends l<CONTENT, RESULT>.a> it = list.iterator();
            while (true) {
                intent = null;
                if (it.hasNext()) {
                    l<CONTENT, RESULT>.a next = it.next();
                    if (next.a(dVar)) {
                        try {
                            aVar = next.b(dVar);
                            break;
                        } catch (o5.p e10) {
                            d6.a a10 = a();
                            j.d(a10, e10);
                            aVar = a10;
                        }
                    }
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar == null) {
                aVar = a();
                gm.l.f(aVar, "appCall");
                j.d(aVar, new o5.p("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
            }
            Activity activity2 = this.f12703a;
            if (activity2 == null) {
                activity = null;
            } else {
                activity = activity2;
            }
            final int i10 = 0;
            if (activity instanceof androidx.activity.result.h) {
                if (activity2 == null) {
                    activity2 = null;
                }
                if (activity2 != null) {
                    androidx.activity.result.g o10 = ((androidx.activity.result.h) activity2).o();
                    gm.l.e(o10, "registryOwner.activityResultRegistry");
                    final o5.l lVar = this.f12706d;
                    if (!i6.a.b(aVar)) {
                        try {
                            intent = aVar.f12629c;
                        } catch (Throwable th2) {
                            i6.a.a(aVar, th2);
                        }
                    }
                    if (intent != null) {
                        if (!i6.a.b(aVar)) {
                            try {
                                i10 = aVar.f12627a;
                            } catch (Throwable th3) {
                                i6.a.a(aVar, th3);
                            }
                        }
                        final gm.a0 a0Var = new gm.a0();
                        ?? d10 = o10.d(gm.l.k(Integer.valueOf(i10), "facebook-dialog-request-"), new k(), new androidx.activity.result.b() { // from class: d6.i
                            @Override // androidx.activity.result.b
                            public final void a(Object obj) {
                                o5.l lVar2 = o5.l.this;
                                int i11 = i10;
                                gm.a0 a0Var2 = a0Var;
                                Pair pair = (Pair) obj;
                                gm.l.f(a0Var2, "$launcher");
                                if (lVar2 == null) {
                                    lVar2 = new e();
                                }
                                Object obj2 = pair.first;
                                gm.l.e(obj2, "result.first");
                                lVar2.a(i11, ((Number) obj2).intValue(), (Intent) pair.second);
                                androidx.activity.result.c cVar = (androidx.activity.result.c) a0Var2.f15485a;
                                if (cVar == null) {
                                    return;
                                }
                                synchronized (cVar) {
                                    cVar.c();
                                    a0Var2.f15485a = null;
                                    tl.l lVar3 = tl.l.f28297a;
                                }
                            }
                        });
                        a0Var.f15485a = d10;
                        d10.b(intent);
                        aVar.b();
                    }
                    aVar.b();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            } else if (activity2 != null) {
                if (!i6.a.b(aVar)) {
                    try {
                        intent = aVar.f12629c;
                    } catch (Throwable th4) {
                        i6.a.a(aVar, th4);
                    }
                }
                if (!i6.a.b(aVar)) {
                    try {
                        i10 = aVar.f12627a;
                    } catch (Throwable th5) {
                        i6.a.a(aVar, th5);
                    }
                }
                activity2.startActivityForResult(intent, i10);
                aVar.b();
                return;
            } else {
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }
}
